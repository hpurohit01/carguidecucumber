package com.carsguide.cucumber.steps;

import com.carsguide.pages.NewAndUsedCarPage;
import com.carsguide.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on by\\+sell tab$")
    public void iMouseHoverOnBySellTab() {

        new Homepage().mouseHoverOnBuySellTab();
    }

    @And("^I click Search Cars$")
    public void iClickSearchCars() {

        new Homepage().mouseHoverAndClickOnSearchCarsLinks();
    }

    @Then("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String expectedPageNavigationText) {

        Assert.assertEquals(expectedPageNavigationText, new NewAndUsedCarPage().getNewAndUsedCarSearchPageNavigationText());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {

        new NewAndUsedCarPage().selectCarMakeFromDropDownMenu(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {

        new NewAndUsedCarPage().selectCarModelFromDropDownMenu(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {

        new NewAndUsedCarPage().selectCarLocationFromDropDownMenu(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {

        new NewAndUsedCarPage().selectCarPriceFromDropDownMenu(price);
    }

    @And("^I click on Find My Next Car Tab$")
    public void iClickOnFindMyNextCarTab() {

        new NewAndUsedCarPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in result$")
    public void iShouldSeeTheMakeInResult(String make) {

        Assert.assertTrue(make,new NewAndUsedCarPage().getSearchTitleText().contains(make));

    }


    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
    }

    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage() {
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
    }

    @And("^I select make “<make>”$")
    public void iSelectMakeMake() {
    }

    @And("^I select model “<model>”$")
    public void iSelectModelModel() {
    }

    @And("^I select location “<location>”$")
    public void iSelectLocationLocation() {
    }
}
