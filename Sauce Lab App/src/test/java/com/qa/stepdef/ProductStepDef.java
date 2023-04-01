package com.qa.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {

    @Given("^I'm logged \"([^\"]*)\"$")
    public void iMLoggedIn() throws InterruptedException {
    }


    @Given("User is logged in to the application")
    public void userIsLoggedInToTheApplication() {
    }


    @Then("The product listed with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theProductListedWithAnd(String tittle, String price) {
    }


    @When("User clicks on the product \"([^\"]*)\"$")
    public void userClicksOnTheProduct(String product) {
    }

    @Then("The product details page is displayed")
    public void theProductDetailsPageIsDisplayed() {
    }


    @And("The product details page contains \"([^\"]*)\"  \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theProductDetailsPageContainsAnd(String tittle, String price, String description) {
    }
}
