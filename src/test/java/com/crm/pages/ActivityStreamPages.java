package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class ActivityStreamPages {

    public ActivityStreamPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/ul[1]/li[11]/a[1]/span[1]")
    public WebElement Employees;

    @FindBy(xpath = "//div[@id='top_menu_id_company']//span[@class='main-buttons-item-text']/span[2]")
    public List<WebElement> mainButtonItems;

    @FindBy(xpath = "//span[contains(text(),'Drag here to hide')]")
    public WebElement hiddenSection;

    @FindBy(xpath = "//span[contains(text(),'Configure Menu')]")
    public WebElement configureMenuButton;
    @FindBy(xpath = "//span[contains(text(),'Reset menu')]")
    public WebElement ResetMenuButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text'][normalize-space()='More'])[1]")
    public WebElement moreButton;


    @FindBy(xpath ="//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/a[1]/span[2]")
    public WebElement addDepartementButton;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departementName;
    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement selectDepartement;

    @FindBy(xpath ="//body/div[@id='BXStructure']/div[3]/span[1]")
    public WebElement addButton;

    @FindBy(xpath = "//a[contains(text(),'Cyber Tech')]")
    public WebElement cyberTechDepartement;
}
