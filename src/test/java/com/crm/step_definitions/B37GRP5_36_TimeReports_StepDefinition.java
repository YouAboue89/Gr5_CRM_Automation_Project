package com.crm.step_definitions;

import com.crm.pages.AgileProCRMBasePage;
import com.crm.pages.B37GRP5_36_TimeReportsPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B37GRP5_36_TimeReports_StepDefinition extends AgileProCRMBasePage {
    B37GRP5_36_TimeReportsPage timeReportsPage = new B37GRP5_36_TimeReportsPage();





    @When("user logs in as {string}")
    public void userLogsInAs(String userType) {
        timeReportsPage.login(userType);
    }


    @And("user clicks {string}")
    public void userClicks(String option) {
        timeReportsPage.selectOption(option);
        BrowserUtils.sleep(1);
    }


    @Then("user should see following {int} options on the Time and Reports page")
    public void userShouldSeeFollowingOptionsOnTheTimeAndReportsPage(int expectedModuleNumbers, List<String>expectedModules) {
        List<String> actualModules = BrowserUtils.getElementsText(timeReportsPage.modules);
        Assert.assertEquals(expectedModuleNumbers, actualModules.size());
        Assert.assertEquals(expectedModules, actualModules);
        BrowserUtils.sleep(1);
    }

    @When("user selects {string} option")
    public void userSelectsOption(String module) {
        timeReportsPage.selectModule(module);
    }

    @Then("user should see {int} checkboxes")
    public void userShouldSeeCheckboxes(int expectedCheckboxCount) {
        List<WebElement> checkboxes = timeReportsPage.checkbox;
        Assert.assertEquals("Checkbox count is incorrect", expectedCheckboxCount, checkboxes.size());
    }


    @Then("The statistics checkbox is selected by default")
    public void theStatisticsCheckboxIsSelectedByDefault() {
        Assert.assertTrue(timeReportsPage.statsCheckBox.isSelected());

    }
}
