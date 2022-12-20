package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[1]")
    WebElement maleGenderButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[2]")
    WebElement femaleGenderButton;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccessfulText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterRegistrationComplete;

    //This method will get  text
    public String getRegisterPageText() {
        log.info("Getting text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    //This method will select element
    public void selectGenderOnRegistrationPage(String gender) {
        Reporter.log("Select Gender ");
        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleGenderButton);
            log.info("Clicking on " + maleGenderButton.toString());
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOnElement(femaleGenderButton);
            log.info("Clicking on " + femaleGenderButton.toString());
        }
    }

    //This method will send text
    public void sendTextToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Entering text " + firstNameField.toString());
    }

    //This method will send text
    public void sendTextToLastNameField(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Entering text " + lastNameField.toString());
    }

    //This method will select element
    public void selectDayOfBirth(String day) {
        selectByValueFromDropDown(dateOfBirthDay, day);
        log.info("Selecting date " + dateOfBirthDay.toString());
    }

    //This method will select element
    public void selectDayOfMonth(String month) {
        selectByValueFromDropDown(dateOfBirthMonth, month);
        log.info("Selecting month " + dateOfBirthMonth.toString());
    }

    //This method will select element
    public void selectDayOfYear(String year) {
        selectByValueFromDropDown(dateOfBirthYear, year);
        log.info("Selecting year " + dateOfBirthYear.toString());
    }

    //This method will send text
    public void sendTextToEmailField(String email) {
        sendTextToElement(emailId, email + getAlphaNumericString(2) + "@gmail.com");
        log.info("Entering text " + email);
    }

    //This method will send text
    public void sendTextToPasswordField(String rPassword) {
        sendTextToElement(password, rPassword);
        log.info("Entering text " + password);
    }

    //This method will send text
    public void sendTextToConfirmPasswordField(String cPassword) {
        sendTextToElement(confirmPassword, cPassword);
        log.info("Entering text " + cPassword);
    }

    //This method will click
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on " + registerButton);
    }

    //This method will get  text
    public String getRegistrationSuccessfulText() {
        log.info("Getting text " + registrationSuccessfulText);
        return getTextFromElement(registrationSuccessfulText);
    }

    //This method will click
    public void clickOnContinueButtonAfterRegistrationComplete() {
        clickOnElement(continueButtonAfterRegistrationComplete);
        log.info("Clicking on " + continueButtonAfterRegistrationComplete);
    }
}