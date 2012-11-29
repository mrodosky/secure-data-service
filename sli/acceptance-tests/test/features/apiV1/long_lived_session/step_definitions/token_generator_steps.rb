require_relative '../../../utils/sli_utils.rb'
require 'open3'

Given /^I used the long lived session token generator script to create a token for user "(.*?)" with role "(.*?)" in tenant "(.*?)"  for realm "(.*?)" that will expire in "(.*?)" seconds with client_id "(.*?)"$/ do |user, role, tenant, realm, expiration_in_seconds, client_id|
  out, status = Open3.capture2("ruby ../opstools/token-generator/generator.rb -e #{expiration_in_seconds} -c #{client_id} -u #{user} -r \"#{role}\" -t \"#{tenant}\" -R \"#{realm}\"")
  match = /token is (.*)/.match(out)
  @sessionId = match[1]
  puts("The generated token is #{@sessionId}") if $SLI_DEBUG
end

Then /^I should see that my role is "(.*?)"$/ do |role|
  restHttpGet("/system/session/check", "application/json")
  check = JSON.parse(@res.body)
  assert(check["sliRoles"].include?("Educator"), "Should be an Educator") 
end


Then /^I should receive (\d+) section$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end
