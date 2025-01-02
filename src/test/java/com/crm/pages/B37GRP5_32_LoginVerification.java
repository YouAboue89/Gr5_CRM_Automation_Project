package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B37GRP5_32_LoginVerification {
    public B37GRP5_32_LoginVerification() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='user-name'][1]")
    public WebElement checkUserName ;
}