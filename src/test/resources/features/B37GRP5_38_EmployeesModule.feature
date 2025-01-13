Feature:Employee Module Options
  Agile story : As a user, I should be able to access to the Employees module.


  Scenario:Employee options
    Given user is on the Home page
    When the employee module is selected
    Then  user should see the following Options in order
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |
    Then user should see the HIDDEN section with the following Hidden option
      | Drag here to hide |
    Then user should see SETTINGS with the following Setting options
      | Configure Menu |
      | Reset menu     |


  @B37GRP5_38
  Scenario Outline: Creating Department
    Given user is on the Home page
    When the employee module is selected
    And user clicks Add Department
    And user enters department name "<Department name>"
    And user selects parent department from the list
    And user clicks add button
    Then user should see "<Department name>" displayed in the company structure system
    Examples:
      | Department name |
      | Cyber Tech      |
