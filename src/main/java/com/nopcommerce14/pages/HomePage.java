package com.nopcommerce14.pages;

import com.nopcommerce14.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']")
    WebElement allMenu;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(className = "ico-account")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOutLink;

    public void clickOnLogin (){
        clickOnElement(loginLink);
    }
    public String allmenuText(){
        log.info("getting Text From : "+allMenu);
        return getTextFromElement(allMenu);
    }
    public String loginLinkText(){
        log.info("getting Text From : "+loginLink);
        return getTextFromElement(loginLink);
    }
    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public void clickOnLogout(){
        clickOnElement(logOutLink);
    }
}
