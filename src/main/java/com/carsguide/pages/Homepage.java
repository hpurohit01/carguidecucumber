package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {


    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement bySellTab;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;


    public void mouseHoverOnBuySellTab() {

        mouseHoverToElement(bySellTab);
        log.info("Mouse hover on By+Sell tab  element " + bySellTab.toString());
    }

    public void mouseHoverAndClickOnSearchCarsLinks() {

        mouseHoverToElementAndClick(searchCarsLink);
        log.info("Mouse hover and click on Search Cars element " + searchCarsLink.toString());

    }

}
