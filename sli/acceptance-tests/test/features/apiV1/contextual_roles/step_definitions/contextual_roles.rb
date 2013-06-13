=begin

Copyright 2012-2013 inBloom, Inc. and its affiliates.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end

require 'selenium-webdriver'
require 'mongo'

require_relative '../../../utils/sli_utils.rb'
require_relative '../../../utils/selenium_common.rb'

DATABASE_HOST = PropLoader.getProps['ingestion_db']
DATABASE_PORT = PropLoader.getProps['ingestion_db_port']

#############################################################################################
# After Steps
#############################################################################################

After do
  unless @mongo_changes.nil?
    @mongo_changes.reverse_each do |mongo_change|
      disable_NOTABLESCAN()
      conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
      db = conn[mongo_change[:tenant]]
      coll = db.collection(mongo_change[:collection])
      if mongo_change[:operation] == 'remove'
        coll.save(mongo_change[:value])
      elsif mongo_change[:operation] == 'update'
        if mongo_change[:found]
          coll.update(mongo_change[:query], {'$set' => {mongo_change[:field] => mongo_change[:value]}})
        else
          coll.update(mongo_change[:query], {'$unset' => {mongo_change[:field] => 1}})
        end

      end
    end
  end
end

#############################################################################################
# Mongo Steps
#############################################################################################

def update_mongo(tenant, collection, query, field, remove = true, value = nil)
#Note: value is ignored if remove is true (It doesn't matter what the field contains if you're removing it)

  disable_NOTABLESCAN()
  conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
  db = conn[tenant]
  coll = db.collection(collection)
  entity = coll.find_one(query)
  entity_iter = entity
  field_list = field.split('.')
  found = true
  field_list.each do |field_entry|
    unless entity_iter.has_key? field_entry
      found = false
      break
    end
    entity_iter = entity_iter[field_entry]
  end
  if !(remove) || found
    entry = {:operation => 'update',
             :tenant => tenant,
             :collection => collection,
             :query => query,
             :field => field,
             :remove => remove,
             :found => found,
             :value => entity_iter,
             :new => value
    }
    if remove
      coll.update(query, {'$unset' => {field => 1}})
    else
      coll.update(query, {'$set' => {field => value}})
    end
    (@mongo_changes ||= []) << entry
  end

  conn.close
  enable_NOTABLESCAN()

end

def remove_from_mongo(tenant, collection, query)
  disable_NOTABLESCAN()
  conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
  db = conn[tenant]
  coll = db.collection(collection)
  entity = coll.find_one(query)
  if entity
    entry = {:operation => 'remove',
             :tenant => tenant,
             :collection => collection,
             :query => query,
             :value => entity
    }
    coll.remove(query)

    (@mongo_changes ||= []) << entry

  end

end


Given /^I (remove|expire) all SEOA expiration dates for "([^"]*)" in tenant "([^"]*)"$/ do | function, staff, tenant|
  tenant = convertTenantIdToDbName tenant
  disable_NOTABLESCAN()
  conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
  db = conn[tenant]
  staff_coll = db.collection('staff')
  staff_id = staff_coll.find_one({'body.staffUniqueStateId' => staff})['_id']
  seoa_coll = db.collection('staffEducationOrganizationAssociation')
  seoas = seoa_coll.find({'body.staffReference' => staff_id}).to_a
  remove = (function == 'remove')
  seoas.each do |seoa|
    query = { '_id' => seoa['_id']}
    update_mongo(tenant, 'staffEducationOrganizationAssociation', query, 'body.endDate', remove, '2000-01-01')
  end

  conn.close
  enable_NOTABLESCAN()
end

Given /^I modify all SEOA staff classifications for "([^"]*)" in tenant "([^"]*)" to "([^"]*)"$/ do |staff, tenant, value|
  tenant = convertTenantIdToDbName tenant
  disable_NOTABLESCAN()
  conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
  db = conn[tenant]
  staff_coll = db.collection('staff')
  staff_id = staff_coll.find_one({'body.staffUniqueStateId' => staff})['_id']
  seoa_coll = db.collection('staffEducationOrganizationAssociation')
  seoas = seoa_coll.find({'body.staffReference' => staff_id}).to_a
  seoas.each do |seoa|
    query = { '_id' => seoa['_id']}
    update_mongo(tenant, 'staffEducationOrganizationAssociation', query, 'body.staffClassification', false, value)
  end

  conn.close
  enable_NOTABLESCAN()

end

Given /^I remove all SEOAs for "([^"]*)" in tenant "([^"]*)"/ do |staff, tenant|
  tenant = convertTenantIdToDbName tenant
  disable_NOTABLESCAN()
  conn = Mongo::Connection.new(DATABASE_HOST,DATABASE_PORT)
  db = conn[tenant]
  staff_coll = db.collection('staff')
  staff_id = staff_coll.find_one({'body.staffUniqueStateId' => staff})['_id']
  seoa_coll = db.collection('staffEducationOrganizationAssociation')
  seoas = seoa_coll.find({'body.staffReference' => staff_id}).to_a
  seoas.each do |seoa|
    query = { '_id' => seoa['_id']}
    remove_from_mongo(tenant, 'staffEducationOrganizationAssociation', query)
  end

  conn.close
  enable_NOTABLESCAN()

end

#############################################################################################
# OAUTH Steps
#############################################################################################

Given /^the testing device app key has been created$/ do
  @oauthClientId = "EGbI4LaLaL"
  @oauthClientSecret = "iGdeAGCugi4VwZNtMJR062nNKjB7gRKUjSB0AcZqpn8Beeee"
  @oauthRedirectURI = "http://device"
end

When /^I navigate to the API authorization endpoint with my client ID$/ do
  @driver.get PropLoader.getProps['api_server_url'] + "/api/oauth/authorize?response_type=code&client_id=#{@oauthClientId}"
end

Then /^I should be redirected to the realm choosing page$/ do
  assertWithWait("Failed to navigate to Realm chooser") {@driver.title.index("Choose your realm") != nil}
end

When /^I select "(.*?)" from the dropdown and click go$/ do |arg1|
  select = Selenium::WebDriver::Support::Select.new(@driver.find_element(:tag_name, "select"))
  select.select_by(:text, arg1)
  assertWithWait("Could not find the Go button")  { @driver.find_element(:id, "go") }
  @driver.find_element(:id, "go").click
end

Then /^I should receive a json response containing my authorization code$/ do
  assertWithWait("Could not find text 'authorization_code' on page") {@driver.page_source.include?("authorization_code")}
  @oauthAuthCode = @driver.page_source.match(/"authorization_code":"(?<Code>[^"]*)"/)[:Code]
end

Then /^I should receive a response page with http error code 403$/ do
  assertWithWait("Could not find text 'HTTP Error 403' on page") {@driver.page_source.include?("HTTP Error 403")}
end

When /^I navigate to the API token endpoint with my client ID, secret, authorization code, and redirect URI$/ do
  @driver.get PropLoader.getProps['api_server_url'] + "/api/oauth/token?response_type=code&client_id=#{@oauthClientId}" +
  "&client_secret=#{@oauthClientSecret}&code=#{@oauthAuthCode}&redirect_uri=#{@oauthRedirectURI}"
end

Then /^I should receive a json response containing my authorization token$/ do
  assertWithWait("Could not find text 'authorization_token' on page") {@driver.page_source.include?("access_token")}

  @sessionId = @driver.page_source.match(/"access_token":"(?<Token>[^"]*)"/)[:Token]
  puts "sessionId = #@sessionId"
end

Then /^I should be able to use the token to make valid API calls$/ do
  restHttpGet("/system/session/check", "application/json")
  assert(@res != nil, "Response from rest-client GET is nil")
  assert(@res != nil, "Response is nil")
  data = JSON.parse(@res.body)
  assert(data != nil, "Response body is nil")
  assert(data['authenticated'] == true,
  "Session debug context 'authentication.authenticated' is not true")
end

Given /^I import the odin-local-setup application and realm data$/ do
  @ci_realm_store_path = File.dirname(__FILE__) + '/../../../../../../../tools/jmeter/odin-ci/'
  @local_realm_store_path = File.dirname(__FILE__) + '/../../../../../../../tools/jmeter/odin-local-setup/'
  #get current working dir
  current_dir = Dir.getwd
  # Get current server environment (ci or local) from properties.yml
  app_server = PropLoader.getProps['app_bootstrap_server']
  # Drop in ci specific app-auth fixture data
  if app_server == "ci"
    puts "\b\bDEBUG: We are setting CI environment app auth data"
    Dir.chdir(@ci_realm_store_path)
    `sh ci-jmeter-realm.sh`
    # Drop in local specific app-auth fixture data
  elsif app_server == "local"
    puts "\b\bDEBUG: We are setting LOCAL environment app auth data"
    Dir.chdir(@local_realm_store_path)
    `sh local-jmeter-realm.sh`
  else
    puts "\n\nWARNING: No App server context set, assuming CI environment.."
    Dir.chdir(@ci_realm_store_path)
    `sh ci-jmeter-realm.sh`
  end
  # restore back current dir
  Dir.chdir(current_dir)
end

#############################################################################################


#############################################################################################
# API Steps
#############################################################################################

Then /^I should get and store the link named "(.*?)"$/ do |mylink|
  @result = JSON.parse(@res.body)
  assert(@result != nil, "Response contains no data")
  found = false
  if !@result.nil? && !@result.empty?
    @result["links"].each do |link|
      if link["rel"] == mylink
        found = true
        teacherHashPush(mylink, link["href"])
      end
    end
  end
  assert(found, "Could not find the link #{mylink} in the URI Response: #{@result}")
end

Then /^I should extract the "(.*?)" id from the "(.*?)" URI$/ do |resource, link|
  value = @teacher[link].match(/#{resource}\/(.*?_id)/)
  teacherHashPush("id", $1)
end


#############################################################################################

# Build the teacher hash
def teacherHashPush(key, value)
  @teacher = Hash.new unless defined? @teacher
  @teacher[key] = value
end
