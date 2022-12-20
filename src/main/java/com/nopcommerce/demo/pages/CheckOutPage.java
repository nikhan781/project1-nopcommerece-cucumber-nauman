package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telephoneNoField;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonCheckout;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayDelivery;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement nextSecondDayDelivery;
    @CacheLookup
    @FindBy(xpath = "//button[@class ='button-1 shipping-method-next-step-button']")
    WebElement continueButtonDelivery;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPayment;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCardFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardholderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonCreditCard;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]")
    WebElement totalFinalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderProcessedMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOnThankYouNote;

    //This method will send text
    public void sendTextToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Entering Text : " + fName);

    }

    //This method will send text
    public void sendTextToLastNameField(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Entering Text : " + lName);
    }

    //This method will send text
    public void sendTextTOEmailField(String gEmail) {
        sendTextToElement(emailIdField, gEmail + getAlphaNumericString(2) + "@gmail.com");
        log.info("Entering Text : " + gEmail);
    }

    //This method will send text
    public void sendTextToCityField(String gCity) {
        sendTextToElement(cityField, gCity);
        log.info("Entering Text : " + gCity);
    }

    //This method will select text
    public void selectACountryInCountryField(String gCountry) {
        selectByVisibleTextFromDropDown(countryField, gCountry);
        log.info("Entering Text : " + gCountry);
    }

    //This method will send text
    public void sendTextToAddressField(String gAddress) {
        sendTextToElement(addressField, gAddress);
        log.info("Entering Text : " + gAddress);
    }

    //This method will send text
    public void sendTextToPostCodeField(String gPostCode) {
        sendTextToElement(postCodeField, gPostCode);
        log.info("Entering Text : " + gPostCode);
    }

    //This method will send text
    public void sendTextToPhoneField(String gtele) {
        sendTextToElement(telephoneNoField, gtele);
        log.info("Entering Text : " + gtele);
    }

    //This method will click
    public void clickOnContinueButtonCheckout() {
        clickOnElement(continueButtonCheckout);
        log.info("Clicking on : " + continueButtonCheckout);
    }

    //This method will click
    public void clickOnNextDayAirDelivery() {
        clickOnElement(nextDayDelivery);
        log.info("Clicking on : " + nextDayDelivery);
    }

    //This method will click
    public void clickOnSecondDayAirDelivery() {
        clickOnElement(nextSecondDayDelivery);
        log.info("Clicking on : " + nextSecondDayDelivery);
    }

    //This method will click
    public void clickOnContinueButtonDelivery() {
        clickOnElement(continueButtonDelivery);
        log.info("Clicking on : " + continueButtonDelivery);
    }

    //This method will click
    public void clickOnCreditCardPaymentMethod() {
        clickOnElement(creditCardPaymentMethod);
        log.info("Clicking on : " + creditCardPaymentMethod);
    }

    //This method will click
    public void clickOnContinueButtonPayment() {
        clickOnElement(continueButtonPayment);
        log.info("Clicking on : " + continueButtonPayment);
    }

    //This method will select text
    public void selectCreditCard(int cCard) {
        selectByIndexFromDropDown(selectCreditCardFiled, cCard);
        log.info("Select card type : " + cCard);
    }

    //This method will send text
    public void sendTextToCardholderNameField(String cardholder) {
        sendTextToElement(cardholderNameField, cardholder);
        log.info("Entering Text : " + cardholder);
    }

    //This method will send text
    public void sendTextToCardNumberField(String cardNumber) {
        sendTextToElement(cardNumberFiled, cardNumber);
        log.info("Entering Text : " + cardNumber);
    }

    //This method will select text
    public void selectExpiryMonth(String month) {
        selectByValueFromDropDown(expiryMonthFiled, month);
        log.info("Select month : " + month);
    }

    //This method will select text
    public void selectExpiryYear(String year) {
        selectByValueFromDropDown(expiryYearFiled, year);
        log.info("Select year : " + year);
    }

    //This method will send text
    public void sendTextToCardCodeField(String cardCode) {
        sendTextToElement(cardCodeFiled, cardCode);
        log.info("Select card code : " + cardCode);
    }

    //This method will click
    public void clickOnContinueButtonCreditCard() {
        clickOnElement(continueButtonCreditCard);
        log.info("Clicking on : " + continueButtonCreditCard);
    }

    //This method will get  text
    public String getPaymentMethodText() {
        log.info("Getting text: " + paymentMethodText);
        return getTextFromElement(paymentMethodText);

    }

    //This method will get  text
    public String getDeliveryMethodText() {
        log.info("Getting text: " + shippingMethod);
        return getTextFromElement(shippingMethod);

    }

    //This method will get  text
    public String getTotalPriceText() {
        log.info("Getting text: " + totalFinalPrice);
        return getTextFromElement(totalFinalPrice);
    }

    //This method will get  text
    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
        log.info("Clicking on : " + confirmButton);
    }

    //This method will get  text
    public String getThankYouTextAfterOrderConfirmation() {
        log.info("Getting text : " + thankYouText);
        return getTextFromElement(thankYouText);
    }

    //This method will get  text
    public String getOrderProcessedSuccessfullyTextAfterOrderConfirmation() {
        log.info("Getting text : " + orderProcessedMessage);
        return getTextFromElement(orderProcessedMessage);
    }

    //This method will click
    public void clickOnContinueButtonOnThankYouNote() {
        clickOnElement(continueButtonOnThankYouNote);
        log.info("Clicking on : " + continueButtonOnThankYouNote);
    }
}
