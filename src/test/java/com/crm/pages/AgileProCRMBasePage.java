package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileProCRMBasePage {


    //Constructor created:
    public AgileProCRMBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Base page WebElements list:
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputUserNameField;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputUserPasswordField;

    @FindBy(css = ".login-text.login-item>label")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;


    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotYourPasswordButton;


    //Base page Labels list:
    @FindBy(xpath = "//label[@class='login-item-checkbox-label']")
    public WebElement rememberMeCheckBoxLabel;

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement authorizationLabel;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotYourPasswordLabel;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement invCredMassage;

    // main page in
    @FindBy(xpath = "//span[@id='user-name'][1]")
    public WebElement checkUserName ;

    public void inputUserName(String userName, String password) {
        this.inputUserNameField.sendKeys(userName);
        this.inputUserPasswordField.sendKeys(password);
        this.logInButton.click();

    }

}