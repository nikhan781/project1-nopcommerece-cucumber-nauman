package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicSteps {
    @When("^I Hover mouse`on Electronics Tab$")
    public void iHoverMouseOnElectronicsTab() throws InterruptedException {
        new TopMenuPage().hoverOverMenu("Electronics");
    }

    @And("^I click on Cell phones$")
    public void iClickOnCellPhones() {
        new TopMenuPage().selectMenu("Cell phones");
    }

    @And("^Verify the text “Cell phones”$")
    public void verifyTheTextCellPhones() {
        Assert.assertEquals("Cell phones", new TopMenuPage().textOnEachPage());
    }

    @And("^I verify the text “Cell phones”$")
    public void iVerifyTheTextCellPhones() {
        Assert.assertEquals("Cell phones", new TopMenuPage().textOnEachPage());
    }

    @And("^I click on List View Tab$")
    public void iClickOnListViewTab() {
        new ProductSelectionPage().clickOnListViewIcon();
    }

    @And("^I click on  Nokia Lumia link$")
    public void iClickOnNokiaLumiaLink() throws InterruptedException {
        new ProductSelectionPage().clickOnNokiaLumia();
    }

    @And("^I verify the text Nokia Lumia$")
    public void iVerifyTheTextNokiaLumia() {
        Assert.assertEquals("Nokia Lumia 1020", new OrderPage().getProductName());
    }

    @And("^I can verify the price$")
    public void iCanVerifyThePrice() throws InterruptedException {
        Assert.assertEquals("$349.00", new OrderPage().getPriceOnElectronicsPage());
    }

    @And("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String price) {
        new OrderPage().sentTextToQuantityField("2");
    }

    @And("^I verify the quantity$")
    public void iVerifyTheQuantity() throws InterruptedException {
        Assert.assertEquals("2", new ShoppingCartPage().getQuantityInQtyField());
    }

    @And("^I can verify the total price$")
    public void iCanVerifyTheTotalPrice() {
        Assert.assertEquals("$698.00", new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on REGISTER tab$")
    public void iClickOnREGISTERTab() {
        new LoginPage().clickOnRegisterButton();

    }

    @And("^I verify the text “Register”$")
    public void iVerifyTheTextRegister() {
        Assert.assertEquals("Register", new RegisterPage().getRegisterPageText());
    }

    @And("^I select on gender$")
    public void iSelectOnGender() {
        new RegisterPage().selectGenderOnRegistrationPage("Male");
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new RegisterPage().sendTextToFirstNameField("James");
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new RegisterPage().sendTextToLastNameField("Bond");
    }

    @And("^I enter day of birth name$")
    public void iEnterDayOfBirthName() {
        new RegisterPage().selectDayOfBirth("15");
    }

    @And("^I enter month of birth name$")
    public void iEnterMonthOfBirthName() {
        new RegisterPage().selectDayOfMonth("5");
    }

    @And("^I enter year of birth name$")
    public void iEnterYearOfBirthName() {
        new RegisterPage().selectDayOfYear("1990");
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        new RegisterPage().sendTextToEmailField("jamesbond");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new RegisterPage().sendTextToPasswordField("bond123");
    }

    @And("^I enter confirm password$")
    public void iEnterConfirmPassword() {
        new RegisterPage().sendTextToConfirmPasswordField("bond123");
    }

    @And("^Click on REGISTER Button$")
    public void clickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^Verify the message “Your registration completed”$")
    public void verifyTheMessageYourRegistrationCompleted() {
        Assert.assertEquals("Your registration completed", new RegisterPage().getRegistrationSuccessfulText());
    }

    @And("^Click on CONTINUE tab$")
    public void clickOnCONTINUETab() {
        new RegisterPage().clickOnContinueButtonAfterRegistrationComplete();
    }


    @And("^Click on Radio Button second Day Air$")
    public void clickOnRadioButtonSecondDayAir() {
        new CheckOutPage().clickOnSecondDayAirDelivery();
    }

    @And("^I select visa card From Select credit card dropdown$")
    public void iSelectVisaCardFromSelectCreditCardDropdown() {
        new CheckOutPage().selectCreditCard(0);
    }

    @And("^Verify Shipping Method is second Day Air$")
    public void verifyShippingMethodIsSecondDayAir() {
        Assert.assertEquals("Shipping Method: 2nd Day Air", new CheckOutPage().getDeliveryMethodText());
    }

    @And("^I verify total price$")
    public void iVerifyTotalPrice() {
        Assert.assertEquals("$698.00", new CheckOutPage().getTotalPriceText());
    }


    @And("^Click on Logout link$")
    public void clickOnLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @And("^Verify the URL is https://demo\\.nopcommerce\\.com/$")
    public void verifyTheURLIsHttpsDemoNopcommerceCom() {
        Assert.assertEquals("https://demo.nopcommerce.com/", new HomePage().currentUrl());
    }

    @Then("^I have order the cell phone successfully$")
    public void iHaveOrderTheCellPhoneSuccessfully() {
    }


}
