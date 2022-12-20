package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerButton;

    //This method will get  text
    public String getWelcomeText() {
        log.info("Getting text from " + welcomeMessage.toString());
        return getTextFromElement(welcomeMessage);
    }

    //This method will send text
    public void enterEmailId(String userEmail) {
        sendTextToElement(emailField, userEmail);
        log.info("Sending text from " + userEmail);
    }

    //This method will send text
    public void enterPassword(String userPassword) {
        sendTextToElement(passwordField, userPassword);
        log.info("Getting text from " + userPassword);
    }

    //This method will click
    public void clickOnLogInButton() {
        clickOnElement(loginButton);
        log.info("Clicking on " + loginButton.toString());
    }

    //This method will get  text
    public String getErrorMessage() {
        log.info("Getting text from " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    //This method will click
    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
        log.info("Clicking on " + checkoutAsGuestButton.toString());
    }

    //This method will click
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on " + registerButton.toString());
    }
}
