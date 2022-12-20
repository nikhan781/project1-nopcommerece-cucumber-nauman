package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement shoppingCartText2;
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantityField;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary'][1]/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termAndConditions;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termAndConditions2;
    @CacheLookup
    @FindBy(name = "checkout")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(name = "checkout")
    WebElement checkoutButton2;

    //This method will get text
    public String getShoppingCartText() throws InterruptedException {
        log.info("Entering text " + shoppingCartText);
        Thread.sleep(1500);
        return getTextFromElement(shoppingCartText);
    }

    //This method will get New Customer text
    public void sendTextToQuantityField(String qty) {
        clearTextFromField(quantityField);
        sendTextToElement(quantityField, qty);
        log.info("Entering text " + qty);
    }

    //This method will click
    public void clickOnUpdateCartButton() {
        clickOnElement(updateCartButton);
        log.info("Clicking on " + updateCartButton);
    }

    //This method will get text
    public String getTotalPrice() {
        log.info("Getting text " + totalPrice);
        return getTextFromElement(totalPrice);
    }

    //This method will click
    public void clickOnTermAndConditions() {
        clickOnElement(termAndConditions);
        log.info("Clicking on " + termAndConditions);
    }

    //This method will click
    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Clicking on " + checkoutButton);
    }

    //This method will get text
    public String getQuantityInQtyField() {
        WebElement actualQuantity = quantityField;
        String actual = actualQuantity.getAttribute("value");
        log.info("Getting text " + actual);
        return actual;
    }

    //This method will get text
    public String getShoppingCartTextAgain() {
        log.info("Getting text " + shoppingCartText2);
        return getTextFromElement(shoppingCartText2);
    }

}
