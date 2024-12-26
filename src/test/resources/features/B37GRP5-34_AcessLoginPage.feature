Feature: Some of the general login functionality
  Agile story : As a user, I should be able to access login page features.

  Scenario:
    Given user is on the AgileProCRM web page
    And user enters valid userName
    And user enters userPassword
    And user clicks on checkBox "Remember me on this computer"
    And user closes the window.
    When user opens the application again
   Then user should land on HOME page automatically without using credentials.


