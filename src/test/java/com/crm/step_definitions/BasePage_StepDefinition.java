package com.crm.step_definitions;

import com.crm.pages.AgileProCRMBasePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BasePage_StepDefinition {


    AgileProCRMBasePage agileProCRMBasePage = new AgileProCRMBasePage();


    @When("user is on the AgileProCRM web page")
    public void user_is_on_the_agile_pro_crm_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("agileProCRMUrl"));
    }

    @Then("user should see authorization label")
    public void userShouldSeeAuthorizationLabel() {
        String expectedAuthorizationLabelText = "Authorization";
        Assert.assertEquals(expectedAuthorizationLabelText, agileProCRMBasePage.authorizationLabel.getText());
    }

    @And("user should see remember me on this computer label")
    public void userShouldSeeRememberMeOnThisComputerLabel() {
        String expectedRememberMeCheckBoxLabelText = "Remember me on this computer";
        Assert.assertEquals(expectedRememberMeCheckBoxLabelText, agileProCRMBasePage.rememberMeCheckBoxLabel.getText());
    }

    @And("user should see forgot your password label")
    public void userShouldSeeForgotYourPasswordLabel() {
        String expectedForgotYourPasswordLabel = "FORGOT YOUR PASSWORD?";
        Assert.assertEquals(expectedForgotYourPasswordLabel, agileProCRMBasePage.forgotYourPasswordLabel.getText());
    }

    @When("user should be able to enter valid userName")
    public void user_should_be_able_to_enter_valid_user_name() {
        agileProCRMBasePage.inputUserNameField.sendKeys(ConfigurationReader.getProperty("hr_username"));
    }

    @When("user should be able to enter valid userPassword")
    public void user_should_be_able_to_enter_valid_user_password() {
        agileProCRMBasePage.inputUserPasswordField.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }

    @And("user should be able to click on checkBox")
    public void userShouldBeAbleToClickOnCheckBox() {
        agileProCRMBasePage.rememberMeCheckBox.click();
    }

    @And("user should be able to click ForgotPassword button")
    public void userShouldBeAbleToClickLogInButtonForgotPasswordButton() {
        agileProCRMBasePage.forgotYourPasswordButton.click();
    }

    @Then("user should be able to return to base page")
    public void userShouldBeAbleToReturnToBasePage() {
        Driver.getDriver().navigate().back();
    }

    @When("user should be able to click logIn button")
    public void user_should_be_able_to_click_log_in_button() {
        agileProCRMBasePage.logInButton.click();
    }

    @Then("user should be successfully log in and verify title")
    public void userShouldBeSuccessfullyLogInAndVerifyTitle() {

        BrowserUtils.verifyTitle("Portal");


    }

}
