package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());
    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }
    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']//ul/child::*")
    List<WebElement> topMenuBar;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitles;

    //This method will choose the options from main menu
    public void selectMenu(String menu) {

        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    log.info("Getting text " + list);
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }
    //This method will over the mouse
    public void hoverOverMenu(String mMenu) throws InterruptedException {
Thread.sleep(1500);
        Actions actions = new Actions(driver);
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(mMenu)) {
                    log.info("Getting text " + list);
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }

    //This method will return title of each page for verification purpose
    public String textOnEachPage() {
        log.info("Getting on " + pageTitles);
        return getTextFromElement(pageTitles);
    }

}
