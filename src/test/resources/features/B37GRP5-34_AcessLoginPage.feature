Feature: Some of the general login functionality
  Agile story : As a user, I should be able to access login page features.

  Scenario Outline: Login functionality
    Given user is on the AgileProCRM web page
    And user enters valid userName "<username>"
    And user enters  valid password "<password>"
    And user clicks on checkBox "Remember me on this computer"
    And user clicks login button
    And user closes the window.
    When user opens the application again
    Then user should lands on HOME page

    Examples:
      | username       | password |
      | hr15@cydeo.com  | UserUser |

  Scenario Outline: Forgot Password
    Given user is on the AgileProCRM web page
    And user enters valid userName "<username>"
    When user clicks in to "Forgot password?"
    Then user should lands on Get Password
    Examples:
      | username       |
      | helpdesk15@cydeo.com |




