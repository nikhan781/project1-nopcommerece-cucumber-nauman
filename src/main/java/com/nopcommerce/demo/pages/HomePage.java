package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeTextMessage;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("CLicking on Login Link " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("CLicking on Register Link " + registerLink.toString());

    }

    //This method will hover mouse
    public void hoverMouseOverShoppingCartLink() throws InterruptedException {
        Thread.sleep(1500);
        mouseHoverToElement(shoppingCartLink);
        log.info("Hovering Mouse over Shopping Cart Link " + shoppingCartLink.toString());

    }

    //This method will click
    public void clickOnGoToCartLink() {
        clickOnElement(goToCartLink);
        log.info("CLicking on Go To Cart Link " + goToCartLink.toString());
    }

    //This method will get text
    public String getWelcomeTextMessage() {
        log.info("Getting text from " + welcomeTextMessage.toString());
        return getTextFromElement(welcomeTextMessage);

    }

    //This method will click
    public void clickOnLogOutLink() {
        clickOnElement(logoutLink);
        log.info("CLicking on Login Link " + logoutLink.toString());
    }

    //This method will get url
    public String currentUrl() {
        String url = driver.getCurrentUrl();
        log.info("Getting URL from " + url);
        return url;
    }
}
