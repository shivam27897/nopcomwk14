package com.nopcommerce14.steps;

import com.nopcommerce14.pages.HomePage;
import com.nopcommerce14.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogin();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String actualMessage = new LoginPage().verifWelcomText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage,expectedMessage,"Text Verified");
    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should navigate to profile page$")
    public void iShouldNavigateToProfilePage() {
        String actual=new LoginPage().verifyErroreMsg();
        String expected= "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with inavalid credentials");
    }

    @Then("^I should navigate to profileA page$")
    public void iShouldNavigateToProfileAPage() {
        String actual = new LoginPage().verifyLogoutText();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }

    @And("^I click on logout Button$")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogout();
    }

    @Then("^I should navigate to login page again$")
    public void iShouldNavigateToLoginPageAgain() {
        String actual = new HomePage().loginLinkText();
        String expected = "Log in";
        Assert.assertEquals(actual, expected, "Log in");
    }

    @And("^I Enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailField(email);
    }


    @And("^I Enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }
}
