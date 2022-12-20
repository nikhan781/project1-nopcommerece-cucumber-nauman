package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ComputerSteps {
    @And("^I select sort by position Name Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new ProductSelectionPage().selectSortByType("Name: Z to A");
    }

    @Then("^I should see products in descending order$")
    public void iShouldSeeProductsInDescendingOrder() {
        Assert.assertEquals(new ProductSelectionPage().beforeSortTheProducts(), new ProductSelectionPage().afterSortingTheProducts());
    }

    @And("^I select sort by position Name A to Z$")
    public void iSelectSortByPositionNameAToZ() throws InterruptedException {
        new ProductSelectionPage().selectSortByType("Name: A to Z");
        Thread.sleep(1500);

    }

    @And("^I click on the Add to Cart on selected product$")
    public void iClickOnTheAddToCartOnSelectedProduct() throws InterruptedException {
        new ProductSelectionPage().selectAddToCartProduct("Build your own computer");
    }


    @And("^I click on GHz Intel Pentium Dual-Core using Select class$")
    public void iClickOnGHzIntelPentiumDualCoreUsingSelectClass() {
        new OrderPage().selectAProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
    }

    @And("^I click  RAM$")
    public void iClickRAM() {
        new OrderPage().SelectARam("8GB [+$60.00]");
    }

    @And("^I click on HDD radio\"$")
    public void iClickOnHDDRadio() {
        new OrderPage().clickAndSelectHDD();
    }

    @And("^I click OS radio Vista Premium$")
    public void iClickOSRadioVistaPremium() {
        new OrderPage().clickAndSelectOsPremium();
    }

    @And("^I click on Microsoft Office$")
    public void iClickOnMicrosoftOffice() {

    }

    @And("^I click on Total Commander$")
    public void iClickOnTotalCommander() throws InterruptedException {
        new OrderPage().clickAndSelectTotalCommander();
        Thread.sleep(1500);
    }

    @And("^I can verify the price as$")
    public void iCanVerifyThePriceAs() throws InterruptedException {
        Assert.assertEquals("$1,475.00", new OrderPage().getPrice());
    }

    @And("^I click on ADD TO CARD Button$")
    public void iClickOnADDTOCARDButton() {
        new OrderPage().clickOnAddToCartButton();
    }

    @And("^I can verify the Message The product has been added to your shopping cart on Top green Bar$")
    public void iCanVerifyTheMessageTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar() throws InterruptedException {
        Assert.assertEquals("The product has been added to your shopping cart", new OrderPage().getMessageAfterAddingToCart());
    }

    @And("^I click on close the bar clicking on the cross button$")
    public void iClickOnCloseTheBarClickingOnTheCrossButton() {
        new OrderPage().clickOnCloseButtonOnMessage();
    }

    @And("^I hover MouseHover on Shopping cart$")
    public void iHoverMouseHoverOnShoppingCart() throws InterruptedException {
        new HomePage().hoverMouseOverShoppingCartLink();
    }

    @And("^I click on GO TO CART button\\.$")
    public void iClickOnGOTOCARTButton() {
        new HomePage().clickOnGoToCartLink();
    }

    @And("^I can see the message Shopping cart$")
    public void iCanSeeTheMessageShoppingCart() throws InterruptedException {
        Assert.assertEquals("Shopping cart", new ShoppingCartPage().getShoppingCartText());
    }

    @And("^I change the Qty to \"([^\"]*)\"$")
    public void iChangeTheQtyTo(String arg0) {
        new ShoppingCartPage().sendTextToQuantityField("2");
    }

    @And("^I click on Update shopping cart$")
    public void iClickOnUpdateShoppingCart() {
        new ShoppingCartPage().clickOnUpdateCartButton();
    }

    @And("^I can verify the Total price$")
    public void iCanVerifyTheTotalPrice() {
        Assert.assertEquals("$2,950.00", new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermAndConditions();
    }

    @And("^I click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^I can verify the Text Welcome, Please Sign In!$")
    public void iCanVerifyTheTextWelcomePleaseSignIn() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().getWelcomeText());
    }

    @And("^I can click on CHECKOUT AS GUEST Tab$")
    public void iCanClickOnCHECKOUTASGUESTTab() {
        new LoginPage().clickOnCheckoutAsGuestButton();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        new CheckOutPage().sendTextToFirstNameField("Prime");
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        new CheckOutPage().sendTextToLastNameField("Testing");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new CheckOutPage().sendTextTOEmailField("prime");
    }

    @And("^I select country$")
    public void iSelectCountry() {
        new CheckOutPage().selectACountryInCountryField("United Kingdom");
    }

    @And("^I enter city$")
    public void iEnterCity() {
        new CheckOutPage().sendTextToCityField("London");
    }

    @And("^I enter address$")
    public void iEnterAddress() {
        new CheckOutPage().sendTextToAddressField("1 London Road");
    }

    @And("^I enter postcode$")
    public void iEnterPostcode() {
        new CheckOutPage().sendTextToPostCodeField("BB1 1CC");
    }

    @And("^I enter phone number$")
    public void iEnterPhoneNumber() {
        new CheckOutPage().sendTextToPhoneField("01234567887");
    }

    @And("^I click on CONTINUE$")
    public void iClickOnCONTINUE() {
        new CheckOutPage().clickOnContinueButtonCheckout();
    }

    @And("^I click on Radio Button Next Day Air$")
    public void iClickOnRadioButtonNextDayAir() {
        new CheckOutPage().clickOnNextDayAirDelivery();
    }

    @And("^I click on CONTINUE delivery$")
    public void iClickOnCONTINUEDelivery() {
        new CheckOutPage().clickOnContinueButtonDelivery();
    }

    @And("^I select Radio Button Credit Card$")
    public void iSelectRadioButtonCreditCard() {
        new CheckOutPage().clickOnCreditCardPaymentMethod();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new CheckOutPage().clickOnContinueButtonPayment();
    }

    @And("^I select Master card From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {
        new CheckOutPage().selectCreditCard(1);
    }

    @And("^I enter Cardholder name$")
    public void iEnterCardholderName() {
        new CheckOutPage().sendTextToCardholderNameField("Prime");
    }

    @And("^I enter card number$")
    public void iEnterCardNumber() {
        new CheckOutPage().sendTextToCardNumberField("5555555555554444");
    }

    @And("^I select expiry month$")
    public void iSelectExpiryMonth() {
        new CheckOutPage().selectExpiryMonth("5");
    }

    @And("^I select expiry year$")
    public void iSelectExpiryYear() {
        new CheckOutPage().selectExpiryYear("2024");
    }

    @And("^I enter card code$")
    public void iEnterCardCode() {
        new CheckOutPage().sendTextToCardCodeField("123");

    }

    @And("^I click on CONTINUE card$")
    public void iClickOnCONTINUECard() {
        new CheckOutPage().clickOnContinueButtonCreditCard();
    }

    @And("^I verify Payment Method is Credit Card$")
    public void iVerifyPaymentMethodIsCreditCard() {
        Assert.assertEquals("Payment Method: Credit Card", new CheckOutPage().getPaymentMethodText());

    }

    @And("^I verify Shipping Method is Next Day Air$")
    public void iVerifyShippingMethodIsNextDayAir() {
        Assert.assertEquals("Shipping Method: Next Day Air", new CheckOutPage().getDeliveryMethodText());
    }

    @And("^I verify Total price$")
    public void iVerifyTotalPrice() {
        Assert.assertEquals("$2,950.00", new CheckOutPage().getTotalPriceText());
    }

    @And("^I click on CONFIRM$")
    public void iClickOnCONFIRM() {
        new CheckOutPage().clickOnConfirmButton();
    }

    @And("^I verify the Text Thank You$")
    public void iVerifyTheTextThankYou() {
        Assert.assertEquals("Your order has been successfully processed!", new CheckOutPage().getOrderProcessedSuccessfullyTextAfterOrderConfirmation());
    }

    @And("^I verify the message Your order has been successfully processed!$")
    public void iVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        Assert.assertEquals("Your order has been successfully processed!", new CheckOutPage().getOrderProcessedSuccessfullyTextAfterOrderConfirmation());

    }

    @And("^I click on CONTINUE button$")
    public void iClickOnCONTINUEButton()  {
        new CheckOutPage().clickOnContinueButtonOnThankYouNote();
    }


    @And("^I verify the text Welcome to our store$")
    public void iVerifyTheTextWelcomeToOurStore() {
        Assert.assertEquals("Welcome to our store", new HomePage().getWelcomeTextMessage());
    }

    @Then("^I have order th desktop successfully$")
    public void iHaveOrderThDesktopSuccessfully() {

    }

}
