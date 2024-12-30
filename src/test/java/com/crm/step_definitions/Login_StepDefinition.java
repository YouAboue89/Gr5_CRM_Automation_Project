package com.crm.step_definitions;

import com.crm.pages.AgileProCRMBasePage;
import com.crm.pages.B37GRP5_32_LoginVerification;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class Login_StepDefinition {
    AgileProCRMBasePage agileProCRMBasePage = new AgileProCRMBasePage();
    B37GRP5_32_LoginVerification loginVerification = new B37GRP5_32_LoginVerification();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("agileProCRMUrl"));
    }

    @When("user enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String username, String password) {

        agileProCRMBasePage.inputUserNameField.sendKeys(username);
        agileProCRMBasePage.inputUserPasswordField.sendKeys(password);

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        agileProCRMBasePage.logInButton.click();
    }

    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
       // BrowserUtils.sleep(1);
         System.out.println("mainPageHR15.checkUserName.getText() = " + loginVerification.checkUserName.getText());

        BrowserUtils.verifyTitleContains("Portal");

    }

    @And("user see {string} error message is displayed for invalid credentials")
    public void userSeeErrorMessageIsDisplayedForInvalidCredentials(String expectedErrorMessage) {
        System.out.println("agileProCRMBasePage.invCredMassage.getText() = " + agileProCRMBasePage.invCredMassage.getText());
        String actualErrorMessage = agileProCRMBasePage.invCredMassage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @And("user see  {string} error message is displayed if the password or username is empty")
    public void userSeeErrorMessageIsDisplayedIfThePasswordOrUsernameIsEmpty(String arg0) {
    }

    @Then("Verify that the password is in bullet signs by default.")
    public void verifyThatThePasswordIsInBulletSignsByDefault() {
        WebElement passwordBox = agileProCRMBasePage.inputUserPasswordField;
        String actualTypeofPasswordBox = passwordBox.getAttribute("type");
        String expectedTypeofPasswordBox = "password";

        if (actualTypeofPasswordBox.equals(expectedTypeofPasswordBox)) {
            System.out.println("Password is in bullet signs by default");
        } else {
            System.out.println("Password is not in bullet signs by default");
        }
    }

    @And("Verify that Remember me on this computer link exists and is clickable on the login page")
    public void verifyThatRememberMeOnThisComputerLinkExistsAndIsClickableOnTheLoginPage() {


        BrowserUtils.sleep(2);
       // agileProCRMBasePage.rememberMeCheckBoxLabel.click();

        if (agileProCRMBasePage.rememberMeCheckBoxLabel.isEnabled()) {
            System.out.println("Checkbox is selected. Verification PASSED!");
        } else {
            System.out.println("Checkbox is NOT selected. Verification FAILED!");
        }
    }

    @And("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.waitForTitle("Authorization", 10);
        BrowserUtils.verifyTitle("Authorization");

        // String expectedTitle = "Authorization";
        // Assert.assertTrue(expectedTitle.);

        // Assert.assertEquals("Title verification is failed!","Authorization",Driver.getDriver().getTitle());
        // String expectedTitle = "Authorization";

        //  String actualTitle = Driver.getDriver().getTitle();

        //  Assert.assertEquals("Title verification is failed!",  expectedTitle, actualTitle);
    }
}