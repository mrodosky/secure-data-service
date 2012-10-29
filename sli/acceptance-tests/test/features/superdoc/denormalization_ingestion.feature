@RALLY_US4328
Feature: As an SLI platform, I want to denormalize data to super-docs correctly when ingesting data.

  Background: I have a landing zone route configured
    Given I am using local data store
    And I am using preconfigured Ingestion Landing Zone

  Scenario: Pre-populate the tenant to set up for subsequent scenarios
    Given I am using preconfigured Ingestion Landing Zone for "Midgar-Daybreak"
    And I post "StoriedDataSet_IL_Daybreak.zip" file as the payload of the ingestion job
    And the following collections are empty in datastore:
      | collectionName                        |
      | assessment                            |
      | attendance                            |
      | calendarDate                          |
      | cohort                                |
      | competencyLevelDescriptor             |
      | course                                |
      | courseOffering                        |
      | disciplineAction                      |
      | disciplineIncident                    |
      | educationOrganization                 |
      | grade                                 |
      | gradebookEntry                        |
      | gradingPeriod                         |
      | graduationPlan                        |
      | learningObjective                     |
      | learningStandard                      |
      | parent                                |
      | program                               |
      | reportCard                            |
      | section                               |
      | session                               |
      | staff                                 |
      | staffCohortAssociation                |
      | staffEducationOrganizationAssociation |
      | staffProgramAssociation               |
      | student                               |
      | studentAcademicRecord                 |
      | studentAssessmentAssociation          |
      | studentCohortAssociation              |
      | studentCompetency                     |
      | studentCompetencyObjective            |
      | studentDisciplineIncidentAssociation  |
      | studentGradebookEntry                 |
      | studentParentAssociation              |
      | studentProgramAssociation             |
      | studentSchoolAssociation              |
      | studentSectionAssociation             |
      | courseTranscript                      |
      | teacherSchoolAssociation              |
      | teacherSectionAssociation             |
    When zip file is scp to ingestion landing zone
    And a batch job log has been created
    Then I should see following map of entry counts in the corresponding collections:
      | collectionName                        | count |
      | assessment                            | 19    |
      | attendance                            | 75    |
      | calendarDate                          | 556   |
      | cohort                                | 3     |
      | competencyLevelDescriptor             | 6     |
      | course                                | 95    |
      | courseOffering                        | 95    |
      | disciplineAction                      | 2     |
      | disciplineIncident                    | 2     |
      | educationOrganization                 | 5     |
      | grade                                 | 4     |
      | gradebookEntry                        | 12    |
      | gradingPeriod                         | 17    |
      | graduationPlan                        | 4     |
      | learningObjective                     | 198   |
      | learningStandard                      | 1499  |
      | parent                                | 9     |
      | program                               | 2     |
      | reportCard                            | 2     |
      | section                               | 97    |
      | session                               | 22    |
      | staff                                 | 14    |
      | staffCohortAssociation                | 3     |
      | staffEducationOrganizationAssociation | 10    |
      | staffProgramAssociation               | 7     |
      | student                               | 78    |
      | studentAcademicRecord                 | 117   |
      | studentAssessmentAssociation          | 203   |
      | studentCohortAssociation              | 6     |
      | studentCompetency                     | 59    |
      | studentCompetencyObjective            | 4     |
      | studentDisciplineIncidentAssociation  | 4     |
      | studentGradebookEntry                 | 315   |
      | studentParentAssociation              | 9     |
      | studentProgramAssociation             | 6     |
      | studentSchoolAssociation              | 167   |
      | studentSectionAssociation             | 297   |
      | courseTranscript                      | 196   |
      | teacherSchoolAssociation              | 3     |
      | teacherSectionAssociation             | 11    |
    And I should see "Processed 4261 records." in the resulting batch job file
    And I should see "All records processed successfully." in the resulting batch job file
    And I should not see an error log file created

  Scenario: Post new data and check if references are denormalized correctly to Super Docs
    # Pre-ingest check
    When I look at "<INGESTED MATT SOLLARS>" in the "student"
    Then I should not find "<INGESTED 7TH GRADE ENGLISH SEC 5>" in "section"
    And I should not find "<INGESTED ACC TEST PROG 2>" in "program"
    # Ingest new data
    Given I am using preconfigured Ingestion Landing Zone for "Midgar-Daybreak"
    And I post "SuperDocDenormalization.zip" file as the payload of the ingestion job
    When zip file is scp to ingestion landing zone
    And a batch job log has been created
    Then I should see following map of entry counts in the corresponding collections:
      | collectionName                        | count |
      | studentProgramAssociation             | 7     |
      | studentSectionAssociation             | 298   |
    And I should see "Processed 2 records." in the resulting batch job file
    And I should see "All records processed successfully." in the resulting batch job file
    And I should not see an error log file created
    # Check if references are inserted
    When I look at "<INGESTED MATT SOLLARS>" in the "student"
    Then I should find "<INGESTED 7TH GRADE ENGLISH SEC 5>" in "section"
    And I should find "<INGESTED ACC TEST PROG 2>" in "program"

