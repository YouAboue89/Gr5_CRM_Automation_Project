@AA
Feature: As a user, I should be able to access the Time and Reports page

  Background:
    Given user is on the AgileProCRM web page

  Scenario Outline: Verify that the <userType> sees the following 5 modules in the Time and Reports page
    When user logs in as "<userType>"
    And user clicks "Time and Reports"
    Then  user should see following 5 options on the Time and Reports page
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: Verify there are 2 checkboxes when Worktime option is selected.
    When user logs in as "<userType>"
    And user clicks "Time and Reports"
    When user selects "Worktime" option
    Then user should see 2 checkboxes
    Then The statistics checkbox is selected by default
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |