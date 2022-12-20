package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(OrderPage.class.getName());
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement selectHDD400GB;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement selectVistaPremium;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(css = "#price-value-1")
    WebElement price;

    @CacheLookup
    @FindBy(css = "#price-value-20")
    WebElement price2;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement messageAfterAddingToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButtonOnMessage;

    //This method will get  text
    public String getProductName() {
        log.info("Getting text from " + productName.toString());
        return getTextFromElement(productName);
    }

    //This method will select text
    public void selectAProcessor(String process) {
        selectByVisibleTextFromDropDown(selectProcessor, process);
        log.info("Selecting process " + selectProcessor.toString());
    }

    //This method will select text
    public void SelectARam(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
        log.info("Selecting ram " + selectRam.toString());
    }

    //This method will click
    public void clickAndSelectHDD() {
        clickOnElement(selectHDD400GB);
        log.info("Clicking on " + selectHDD400GB.toString());
    }

    //This method will click
    public void clickAndSelectOsPremium() {
        clickOnElement(selectVistaPremium);
        log.info("Clicking on " + selectVistaPremium.toString());
    }

    //This method will click
    public void clickAndSelectTotalCommander() {
        clickOnElement(selectTotalCommander);
        log.info("Clicking on " + selectTotalCommander.toString());
    }

    //This method will select text
    public String getPrice() throws InterruptedException {
        log.info("Getting Price " + price.toString());
        Thread.sleep(1500);
        return getTextFromElement(price);
    }

    public String getPriceOnElectronicsPage() throws InterruptedException {
        log.info("Clicking on " + price2.toString());
        Thread.sleep(1500);
        return getTextFromElement(price2);
    }

    //This method will click
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("Clicking on " + addToCartButton.toString());
    }

    //This method will select text
    public String getMessageAfterAddingToCart() throws InterruptedException {
        log.info("Getting text " + messageAfterAddingToCart.toString());
        Thread.sleep(1500);
        return getTextFromElement(messageAfterAddingToCart);
    }

    //This method will click
    public void clickOnCloseButtonOnMessage() {
        clickOnElement(closeButtonOnMessage);
        log.info("Clicking on " + closeButtonOnMessage.toString());
    }

    //This method will send text
    public void sentTextToQuantityField(String qty) {
        clearTextFromField(quantityField);
        sendTextToElement(quantityField, qty);
        log.info("Entering text " + qty);
    }
}
