Feature: Service Module Access

  Agile story: As a user, I should be able to access to the Service module.
  Accounts are: HR, HelpDesk, Marketing


  @ServicesWIP
  Scenario Outline: Verify the options in the Service module
    Given user is on the AgileProCRM web page
    When user enters the username "<username>" and password "<password>"
    And user should be able to click logIn button
    Then user navigates to the service module
    Then the user should see the following options in order:
      | Meeting Room Booking |
      | Ideas                |
      | Lists                |
      | e-Orders             |
      | Training             |
      | Wiki                 |
      | Contact Center       |
      | FAQ                  |
      | Polls                |
      | Technical Support    |
      | Link Directory       |
      | Subscription         |
      | Change Log           |
      | Classifieds          |
    And the user should see HIDDEN and SETTINGS sections with Configure Menu and Reset Menu options
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk5@cydeo.com  | UserUser |
      | marketing5@cydeo.com | UserUser |


  @ServicesWIP2
  Scenario Outline: Verify users can access FAQ documents
    Given user is on the AgileProCRM web page
    When user enters the username "<username>" and password "<password>"
    And user should be able to click logIn button
    Then user navigates to the service module
    When the user navigates to the FAQ section
    Then the user should see "Work Process" with 4 documents
    And the user should see "Files and Documents" with 2 documents
    And the user should see "Using portal services" with 5 documents
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk5@cydeo.com  | UserUser |
      | marketing5@cydeo.com | UserUser |


  @ServicesWIP3
  Scenario Outline: Verify users can interact with FAQ questions
    Given user is on the AgileProCRM web page
    When user enters the username "<username>" and password "<password>"
    And user should be able to click logIn button
    Then user navigates to the service module

    When the user navigates to the FAQ section

    And user clicks on "Work Process"
    Then user should see "Work Process" with 4 documents
    And user verifies like buttons are working

    When user clicks on "Files and Documents"
    Then user should see "Files and Documents" with 2 documents
    And user verifies like buttons are working

    When user clicks on "Using Portal Services"
    Then user should see "Using portal services" with 5 documents
    And user verifies like buttons are working
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk5@cydeo.com  | UserUser |
      | marketing5@cydeo.com | UserUser |

