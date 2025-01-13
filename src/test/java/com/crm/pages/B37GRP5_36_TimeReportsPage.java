package com.crm.pages;

import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B37GRP5_36_TimeReportsPage extends AgileProCRMBasePage {


    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/ul[1]/li[10]/a[1]/span[1]")
    public WebElement timeAndReports;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> modules;

    public void selectModule(String module) {
        String locator = "//*[contains(@class, 'main-buttons-item-link')]//*[.='"+module+"']";
        WebElement moduleEl = Driver.getDriver().findElement(By.xpath(locator));
        moduleEl.click();
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkbox;

    @FindBy(xpath = "//input[@name='stats']")
    public WebElement statsCheckBox;

}
