package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B37GRP5_39_ServiceModulePage {

    public B37GRP5_39_ServiceModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Services Module Button
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[11]")
    public WebElement servicesModuleButton;


    //List of all 14 menu modules
    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> getAllModulesList;


    //More Button
    @FindBy(xpath = "(//span[@class='main-buttons-item-text'][normalize-space()='More'])[1]")
    public WebElement moreButton;


    // "Hidden" and "Setting" menu locators
    @FindBy(xpath = "(//span[contains(text(),'Hidden')])[2]")
    public WebElement hiddenSection;

    @FindBy(xpath = "(//span[contains(text(),'Settings')])[1]")
    public WebElement settingsSection;

    @FindBy(xpath = "(//span[contains(text(),'Configure Menu')])[1]")
    public WebElement configureMenuButton;

    @FindBy(xpath = "(//span[contains(text(),'Reset menu')])[1]")
    public WebElement resetMenuButton;


    // Services Menu Modules list(all 14):
    //FAQ section button
    @FindBy(xpath = "(//span[.='FAQ'])[1]")
    public WebElement faqSection;

    @FindBy(xpath = "(//span[.='Meeting Room Booking'])[1]")
    public WebElement meetingRoomBookingBTN;

    @FindBy(xpath = "(//span[.='Ideas'])[1]")
    public WebElement ideasBTN;

    @FindBy(xpath = "(//span[.='Lists'])[1]")
    public WebElement listsBtn;

    @FindBy(xpath = "(//span[.='e-Orders'])[1]")
    public WebElement eOrdersBtn;

    @FindBy(xpath = "(//span[.='Training'])[1]")
    public WebElement trainingBtn;

    @FindBy(xpath = "(//span[.='Wiki'])[1]")
    public WebElement wikiBtn;

    @FindBy(xpath = "(//span[.='Contact Center'])[1]")
    public WebElement contactCenterBtn;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']//span[@class='main-buttons-item-text-title'][normalize-space()='Polls']")
    public WebElement pollsBtn;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'][normalize-space()='Technical Support'])[2]")
    public WebElement technicalSupportBtn;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'][normalize-space()='Subscription'])[2]")
    public WebElement subscriptionBtn;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'][normalize-space()='Classifieds'])[2]")
    public WebElement classifiedsBtn;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'][normalize-space()='Link Directory'])[2]")
    public WebElement linkDirectoryBtn;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'][normalize-space()='Change Log'])[2]")
    public WebElement changeLogBtn;


    //FAQ Documents Section:
    @FindBy(xpath = "//a[normalize-space()='Work Process']")
    public WebElement workProcessDocumentsCategory;

    @FindBy(xpath = "//a[normalize-space()='Files and Documents']")
    public WebElement filesAndDocumentsCategory;

    @FindBy(xpath = "//a[normalize-space()='Using portal services']")
    public WebElement portalServicesDocumentCategory;


    // FAQ Questions and Like Buttons
    @FindBy(xpath = "//li[@class='point-faq']")
    public List<WebElement> faqQuestionsList;


    @FindBy(xpath = "//span[@class='faq-like']")
    public List<WebElement> faqLikeButtons;


    // FAQ Like Count
    @FindBy(xpath = "//span[@class='faq-like-count']")
    public List<WebElement> faqLikeCounts;


    //FAQ Documents files amount
    @FindBy(xpath = "//a[text()='Work Process']/parent::div")
    public WebElement workProcessAmount;

    @FindBy(xpath = "//a[text()='Files and Documents']/parent::div")
    public WebElement filesAndDocumentsAmount;

    @FindBy(xpath = "//a[text()='Using portal services']/parent::div")
    public WebElement portalServicesDocumentsAmount;
}





/*
//List of WebElements:
    public List<WebElement> getAllWebElements() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(meetingRoomBookingBTN);
        webElements.add(ideasBTN);
        webElements.add(listsBtn);
        webElements.add(eOrdersBtn);
        webElements.add(trainingBtn);
        webElements.add(wikiBtn);
        webElements.add(contactCenterBtn);
        webElements.add(faqBtn);
        webElements.add(pollsBtn);
        webElements.add(technicalSupportBtn);
        webElements.add(subscriptionBtn);
        webElements.add(classifiedsBtn);
        webElements.add(linkDirectoryBtn);
        webElements.add(changeLogBtn);
        return webElements;
    }
}
*/

