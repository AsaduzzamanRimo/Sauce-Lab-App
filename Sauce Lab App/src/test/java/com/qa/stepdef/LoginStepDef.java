package com.qa.stepdef;

import com.qa.Pages.LoginPage;
import com.qa.Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {


    @When("I enter  Invalid username as \"([^\"]*)\"$")
    public void iEnterInvalidUsernameAs(String Invalidusername) throws InterruptedException {
        new LoginPage().enterUserName(Invalidusername);
    }

    @When("I enter  Valid username as \"([^\"]*)\"$")
    public void iEnterValidUsernameAs(String validUsername) throws InterruptedException {
        new LoginPage().enterUserName(validUsername);
    }


    @And("I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("I enter InValidpassword as \"([^\"]*)\"$")
    public void iEnterInValidpasswordAs(String invalidPass) {
        new LoginPage().enterPassword(invalidPass);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        new LoginPage().pressLoginBtn();
    }

    @Then("Login should fail with an error message \"([^\"]*)\"$")
    public void loginShouldFailWithAnErrorMessage(String errText) {
        new LoginPage().getErrTxt().equals(errText);
    }

    @Then("Login should sueccesfull and show Tittle \"([^\"]*)\"$")
    public void loginShouldSueccesfullAndShowTittle(String tittle) {
        new ProductPage().getTitle().equals(tittle);
    }

}
