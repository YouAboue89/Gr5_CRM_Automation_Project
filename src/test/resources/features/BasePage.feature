Feature: AgileProCRM base page WebElements verification

  Agile story: As a user, I should see buttons and labels on a base page and be able to click on them

  @BasePageWIP
  Scenario: Base page buttons and labels verification
    When user is on the AgileProCRM web page
    Then user should see authorization label
    And user should see remember me on this computer label
    And user should see forgot your password label
    And user should be able to click ForgotPassword button
    Then user should be able to return to base page
    And user should be able to click on checkBox
    And user should be able to enter valid userName
    And user should be able to enter valid userPassword
    And user should be able to click logIn button
    Then user should be successfully log in and verify title




