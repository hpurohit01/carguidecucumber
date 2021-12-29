package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement pageNavigationText;

    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMake;

    @FindBy(xpath = "//select[@id='models']")
    WebElement carModel;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement carLocation;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carPrice;

    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement searchTitleText;


    public String getNewAndUsedCarSearchPageNavigationText(){

        log.info("Getting New & Used Car Search text from element "+pageNavigationText.toString());
        return pageNavigationText.getText();
    }

    public void selectCarMakeFromDropDownMenu(String make){

        selectByVisibleTextFromDropDown(carMake,make);
        log.info("Selecting Car Make form drop down menu list of select element "+carMake.toString());
    }

    public void selectCarModelFromDropDownMenu(String model){

        selectByVisibleTextFromDropDown(carModel,model);
        log.info("Selecting Car Model form drop down menu list of select element "+carModel.toString());
    }

    public void selectCarLocationFromDropDownMenu(String location){

        selectByVisibleTextFromDropDown(carLocation,location);
        log.info("Selecting Car Location form drop down menu list of select element "+carLocation.toString());
    }

    public void selectCarPriceFromDropDownMenu(String price){

        selectByVisibleTextFromDropDown(carPrice,price);
        log.info("Selecting Car Price form drop down menu list of select element "+carPrice.toString());
    }

    public void clickOnFindMyNextCarButton(){

        clickOnElement(findMyNextCarButton);
        log.info("Clicking on Find My Next Car button element "+findMyNextCarButton.toString());
    }

    public String getSearchTitleText(){

        return searchTitleText.getText();
    }
}

