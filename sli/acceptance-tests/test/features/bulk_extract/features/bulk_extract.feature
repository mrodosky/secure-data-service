Feature: A bulk extract is triggered

@smoke
Scenario: Trigger a bulk extract on ingested data
   Given I trigger a bulk extract
   When I fetch the path to and decrypt the edorg data extract file for the tenant "Midgar" and application with id "19cca28d-7357-4044-8df9-caad4b1c8ee4" and edorg with id "1b223f577827204a1c7e9c851dba06bea6b031fe_id"
   And I verify that an extract tar file was created for the tenant "Midgar"
   And there is a metadata file in the extract
   And the extract contains a file for each of the following entities:
   |  entityType                            |
   |  attendance                            |
   |  courseTranscript                      |
   |  disciplineIncident                    |
   |  disciplineAction                      |
   |  grade                                 |
   |  gradebookEntry                        |
   |  parent                                |
   |  reportCard                            |
   |  staff                                 |
   |  staffCohortAssociation                |
   |  staffEducationOrganizationAssociation |
   |  staffProgramAssociation               |
   |  student                               |
   |  studentAcademicRecord                 |
   |  studentAssessment                     |
   |  studentCohortAssociation              |
   |  studentCompetency                     |
   |  studentDisciplineIncidentAssociation  |
   |  studentProgramAssociation             |
   |  studentGradebookEntry                 |
   |  studentParentAssociation              |
   |  studentSchoolAssociation              |
   |  studentSectionAssociation             |
   |  teacher                               |
   |  teacherSchoolAssociation              |
   |  teacherSectionAssociation             |

 @smoke
  Scenario: Trigger a bulk extract on ingested data
    Given I trigger a bulk extract
    When I retrieve the path to and decrypt the public data extract file for the tenant "Midgar" and application with id "19cca28d-7357-4044-8df9-caad4b1c8ee4"
    And I verify that an extract tar file was created for the tenant "Midgar"
    And there is a metadata file in the extract
    And the extract contains a file for each of the following entities:
      |  entityType                            |
      |  assessment                            |
      |  competencyLevelDescriptor             |
      |  graduationPlan                        |
      |  learningStandard                      |
      |  program                               |
      |  calendarDate                          |
      |  educationOrganization                 |
      |  learningObjective                     |
      |  studentCompetencyObjective            |
      |  course                                |
      |  courseOffering                        |
      |  session                               |
      |  gradingPeriod                         |
      |  school                                |
      |  section                               |
      |  cohort                                |
