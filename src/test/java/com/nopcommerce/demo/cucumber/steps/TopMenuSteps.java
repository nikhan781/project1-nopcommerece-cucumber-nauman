package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException {
        Thread.sleep(1500);
    }

    @When("^I select an top menu option$")
    public void iSelectAnTopMenuOption() throws InterruptedException {
        new TopMenuPage().hoverOverMenu("Computers");
    }

    @And("^I click on submenu option$")
    public void iClickOnSubmenuOption() {
        new TopMenuPage().selectMenu("Desktops");
    }

    @Then("^I should see selected page name$")
    public void iShouldSeeSelectedPageName() {
        Assert.assertEquals("Desktops", new TopMenuPage().textOnEachPage());
    }
}
