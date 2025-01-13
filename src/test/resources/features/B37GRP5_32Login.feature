@Login
Feature: As a user, I should be able to access login page features.

  Background:
    Given user is on the login page

  @validLogin
  Scenario Outline:Login with valid credential
    # Given user is on the login page
    When user enters the username "<username>" and password "<password>"
    And user clicks to login button
    Then the user should be able to log in

    Examples:

      | username              | password |
      | hr15@cydeo.com        | UserUser |
      | hr1@cydeo.com         | UserUser |
      | hr75@cydeo.com         | UserUser |
      | helpdesk15@cydeo.com  | UserUser |
      | helpdesk5@cydeo.com   | UserUser |
      | helpdesk75@cydeo.com   | UserUser |
      | marketing15@cydeo.com | UserUser |
      | marketing5@cydeo.com  | UserUser |
      | marketing75@cydeo.com   | UserUser |


  @InvalidLogin
  Scenario Outline:Login with invalid credential
    # Given user is on the login page
    When user enters the username "<username>" and password "<password>"
    And user clicks to login button
    And user see "Incorrect login or password" error message is displayed for invalid credentials
    And the user should not be able to log in

    Examples:
      | username              | password  |
      | Wrongmail@.com        | UserUser  |
      | hr15@cydeo.com        | WrongPass |
      | Wrongmail@.com        | UserUser  |
      | helpdesk15@cydeo.com  | WrongPass |
      | Wrongmail@.com        | UserUser  |
      | marketing15@cydeo.com | WrongPass |

  @feature
  Scenario: Feature in a login page

    When user see  "Please fill out email and password fields!" error message is displayed if the password or username is empty
    And Verify that the password is in bullet signs by default.
    Then Verify that Remember me on this computer link exists and is clickable on the login page