package com.crm.step_definitions;

import com.crm.pages.B37GRP5_39_ServiceModulePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.datatable.DataTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class B37GRP5_39_ServiceModuleFunctionality_StepDefinition {

    B37GRP5_39_ServiceModulePage serviceModulePage = new B37GRP5_39_ServiceModulePage();


    //User is Clicking on Services Module Button
    @Then("user navigates to the service module")
    public void user_navigates_to_the_service_module() {
        serviceModulePage.servicesModuleButton.click();
    }

    //User should see 14 modules
    @Then("the user should see the following options in order:")
    public void the_user_should_see_the_following_options_in_order(io.cucumber.datatable.DataTable dataTable) {
        //Clicking More Button
        serviceModulePage.moreButton.click();

        // Retrieve the text from all module buttons, which stored as List<Webelement> -> <ListString>
        List<String> allModulesNames = BrowserUtils.getElementsText(serviceModulePage.getAllModulesList);

        // Remove empty strings and trim leading/trailing whitespace from each element
        List<String> cleanedAllModulesNames = allModulesNames.stream()
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .collect(Collectors.toList());

        Assert.assertEquals(dataTable.asList(), cleanedAllModulesNames);
        System.out.println("List of actual modules = " + cleanedAllModulesNames);
    }


    //Hidden and Setting options:
    @Then("the user should see HIDDEN and SETTINGS sections with Configure Menu and Reset Menu options")
    public void the_user_should_see_hidden_and_settings_sections() {
        Assert.assertTrue(serviceModulePage.hiddenSection.isDisplayed());
        Assert.assertTrue(serviceModulePage.settingsSection.isDisplayed());
        Assert.assertTrue(serviceModulePage.configureMenuButton.isDisplayed());
        Assert.assertTrue(serviceModulePage.resetMenuButton.isDisplayed());
    }


    //User is navigating to FAQ module:
    @When("the user navigates to the FAQ section")
    public void the_user_navigates_to_the_faq_section() {
        serviceModulePage.faqSection.click();
    }

    //Documents count
    @Then("the user should see {string} with {int} documents")
    public void the_user_should_see_with_documents(String sectionName, int expectedCount) {

        int actualCount = 0;

        // Determine the actual count based on the section name
        WebElement element = null;
        switch (sectionName) {
            case "Work Process":
                element = serviceModulePage.workProcessAmount;
                break;

            case "Files and Documents":
                element = serviceModulePage.filesAndDocumentsAmount;
                break;

            case "Using portal services":
                element = serviceModulePage.portalServicesDocumentsAmount;
                break;

            default:
                throw new IllegalArgumentException("Unknown section name: " + sectionName);
        }

        // Extract the document count directly from the element
        if (element != null) {
            String text = element.getText();
            System.out.println("Text content of element: " + text); // For debugging

            // Extract numeric value within parentheses
            String numberString = text.replaceAll("[^0-9]", "");
            if (numberString.isEmpty()) {
                throw new NumberFormatException("No numeric value found in the element text: " + text);
            }
            actualCount = Integer.parseInt(numberString);
        }

        // Assert that the actual count matches the expected count
        Assert.assertEquals("Document count mismatch for section: " + sectionName, expectedCount, actualCount);
    }

    @When("user clicks on {string}")
    public void userClicksOnCategory(String category) {
        switch (category) {
            case "Work Process":
                serviceModulePage.workProcessDocumentsCategory.click();
                break;
            case "Files and Documents":
                serviceModulePage.filesAndDocumentsCategory.click();
                break;
            case "Using Portal Services":
                serviceModulePage.portalServicesDocumentCategory.click();
                break;
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }

//Documents count
    @Then("user should see {string} with {int} documents")
    public void user_should_see_with_documents(String sectionName, int expectedCount) {
        int actualCount = 0;
        WebElement element = null;

        // Determine which document count element to use
        switch (sectionName) {
            case "Work Process":
                element = serviceModulePage.workProcessAmount;
                break;
            case "Files and Documents":
                element = serviceModulePage.filesAndDocumentsAmount;
                break;
            case "Using portal services":
                element = serviceModulePage.portalServicesDocumentsAmount;
                break;
            default:
                throw new IllegalArgumentException("Unknown section name: " + sectionName);
        }


        // Extract numeric count from the text content
        String text = element.getText();
        String numberString = text.replaceAll("[^0-9]", "");
        actualCount = Integer.parseInt(numberString);

        Assert.assertEquals("Document count mismatch for section: " + sectionName, expectedCount, actualCount);
    }

    // Like button verification
    @Then("user verifies like buttons are working")
    public void user_verifies_like_buttons_are_working() {
        List<WebElement> likeButtons = serviceModulePage.faqLikeButtons;
        for (WebElement likeButton : likeButtons) {
            Assert.assertTrue("Like button is not clickable", likeButton.isEnabled());
        }

    }


}