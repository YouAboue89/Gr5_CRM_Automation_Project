package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageSearch {

    public GooglePageSearch(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = ".gLFyf")
    public WebElement searchButton;
}
