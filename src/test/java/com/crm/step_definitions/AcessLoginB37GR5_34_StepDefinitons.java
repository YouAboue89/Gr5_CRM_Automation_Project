package com.crm.step_definitions;

import com.crm.pages.AgileProCRMBasePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class AcessLoginB37GR5_34_StepDefinitons {

    AgileProCRMBasePage agileProCRMBasePage = new AgileProCRMBasePage();

    @And("user enters valid userName {string}")
    public void userEntersValidUserName(String username) {
        agileProCRMBasePage.inputUserNameField.sendKeys(username);

    }
   // @Given("user enters valid userName")
   // public void user_enters_valid_user_name() {
   //
    //    BrowserUtils.sleep(2);
//
   // }

    @And("user enters  valid password {string}")
    public void userEntersValidPassword(String password) {
        agileProCRMBasePage.inputUserPasswordField.sendKeys(password);
    }
    // @Given("user enters userPassword")
    //public void user_enters_user_password() {
     //   agileProCRMBasePage.inputUserPasswordField.sendKeys(ConfigurationReader.getProperty//("password"));
      //  BrowserUtils.sleep(2);

    //}
    @Given("user clicks on checkBox {string}")
    public void user_clicks_on_check_box(String rememberMeCheckBox) {
        agileProCRMBasePage.rememberMeCheckBox.click();
        BrowserUtils.sleep(2);
    }
    @And("user clicks login button")
    public void userClicksLoginButton() {
        agileProCRMBasePage.logInButton.click();
        BrowserUtils.sleep(5);

    }
    @Given("user closes the window.")
    public void user_closes_the_window() {

        Driver.closeDriver();
      //  JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
       // executor.executeScript("window.close();");

    }

   @When("user opens the application again")
   public void user_opens_the_application_again() {
 Driver.getDriver().get(ConfigurationReader.getProperty("loginSuccessfullyURL"));

    }

    @Then("user should lands on HOME page")
    public void user_should_lands_on_home_page() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
    }

    // @Then("user should land on HOME page automatically and see {string} as title")
   // public void userShouldLandOnHOMEPageAutomaticallyAndSeeAsTitle(String expectedTitle) {
   //     String actualTitle = Driver.getDriver().getTitle();
   //     Assert.assertEquals(actualTitle, expectedTitle);
  //  }

    @When("user clicks in to {string}")
    public void userClicksInTo(String ForgotPassword) {
        agileProCRMBasePage.forgotYourPasswordButton.click();
    }


    @Then("user should lands on Get Password")
    public void userShouldLandOnHOMEPage() {
        System.out.println(Driver.getDriver().getTitle());
    }


}
