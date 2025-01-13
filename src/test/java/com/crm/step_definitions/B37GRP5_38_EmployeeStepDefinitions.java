package com.crm.step_definitions;

import com.crm.pages.ActivityStreamPages;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class B37GRP5_38_EmployeeStepDefinitions {

    ActivityStreamPages activityStreamPages = new ActivityStreamPages();


    @Given("user is on the Home page")
    public void user_is_on_the_home_page() {

        BrowserUtils.loginToAgilProCrm();
        BrowserUtils.sleep(2);
    }



    @Then("user should see the following Options in order")

    public void userShouldSeeTheFollowingOptionsinorder(List<String> expectedOptions) {

        List<String> menuItems = BrowserUtils.getElementsText(activityStreamPages.mainButtonItems);

        System.out.println("menuItems = " + menuItems);
        System.out.println("expectedOptions = " + expectedOptions);

        Assert.assertEquals(menuItems, expectedOptions);

        //  for (String eachItem : menuItems) {

        //    System.out.println(eachItem);
        //  }


    }

    @Then("user should see the HIDDEN section with the following Hidden option")
    public void userShouldSeeTheHIDDENSectionWithTheFollowingHiddenOption(String expected) {

        activityStreamPages.moreButton.click();

        String actual= activityStreamPages.hiddenSection.getText();

        System.out.println("actual = " + actual);
        Assert.assertEquals(actual,expected);

    }

    @Then("user should see SETTINGS with the following Setting options")
    public void userShouldSeeSETTINGSWithTheFollowingSettingOptions(List<String>expectedOptions) {

        activityStreamPages.moreButton.click();

        List<WebElement> elements = new ArrayList<>();
        elements.add(activityStreamPages.configureMenuButton);
        elements.add(activityStreamPages.ResetMenuButton);

        List<String> actualOptions= BrowserUtils.getElementsText(elements);


        System.out.println("setting option = " + actualOptions);
        System.out.println("expectedOptions = " + expectedOptions);

        Assert.assertEquals(actualOptions, expectedOptions);
    }


    @When("the employee module is selected")
    public void theEmployeeModuleIsSelected() {
        activityStreamPages.Employees.click();
        BrowserUtils.sleep(2);
    }

    @And("user clicks Add Department")
    public void userClicksAddDepartment() {
        activityStreamPages.addDepartementButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user enters department name {string}")
    public void userEntersDepartmentName(String nameOfDepartmenet) {
        activityStreamPages.departementName.sendKeys(nameOfDepartmenet);
    }

    @And("user selects parent department from the list")
    public void userSelectsParentDepartmentFromTheList() {
        Select selectDepartment= new Select(activityStreamPages.selectDepartement);
        selectDepartment.selectByIndex(1);
    }

    @And("user clicks add button")
    public void userClicksAddButton() {
        activityStreamPages.addButton.click();

        BrowserUtils.sleep(2);

    }


    @Then("user should see {string} displayed in the company structure system")
    public void userShouldSeeDisplayedInTheCompanyStructureSystem(String expectedNAME) {

        String actualDepartment= activityStreamPages.cyberTechDepartement.getText();

        Assert.assertEquals(actualDepartment,expectedNAME);


    }


}

