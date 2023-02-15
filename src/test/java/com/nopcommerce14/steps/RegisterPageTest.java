package com.nopcommerce14.steps;

import com.nopcommerce14.pages.HomePage;
import com.nopcommerce14.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterPageTest {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegister();
    }

    @Then("^I Should navigate to Register page$")
    public void iShouldNavigateToRegisterPage() {
        String actualMessage= new RegisterPage().verifyRegisterText();
        String expectedMessage = "Register";
        Assert.assertEquals(actualMessage,expectedMessage,"Register verfied");
    }

    @Then("^I should verify Error message$")
    public void iShouldVerifyErrorMessage() {
        String actualMessage1=new RegisterPage().verifyfirstNameError();
        String expedctedMessage1 = "First name is required.";
        Assert.assertEquals(actualMessage1,expedctedMessage1,"Error verified");

        String actualMessage2=new RegisterPage().verifyLastNameError();
        String expedctedMessage2 = "Last name is required.";
        Assert.assertEquals(actualMessage2,expedctedMessage2,"Error verified");

        String actualMessage3=new RegisterPage().verifyemailErrorr();
        String expedctedMessage3 = "Email is required.";
        Assert.assertEquals(actualMessage3,expedctedMessage3,"Error verified");

        String actualMessage4=new RegisterPage().verifyPasswordErrorr();
        String expedctedMessage4 = "Password is required.";
        Assert.assertEquals(actualMessage4,expedctedMessage4,"Error verified");

        String actualMessage5=new RegisterPage().verifyConfirmPasswordErrorr();
        String expedctedMessage5 = "Password is required.";
        Assert.assertEquals(actualMessage5,expedctedMessage5,"Error verified");
    }

    @And("^I select Female$")
    public void iSelectFemale() {
        new RegisterPage().clicckOnGenderCheckbox();
    }

    @And("^I enter Firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname) {
        new RegisterPage().enterFirstname(firstname);
    }

    @And("^I enter Lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname) {
        new RegisterPage().enterLastname(lastname);
    }

    @And("^I select Day \"([^\"]*)\"$")
    public void iSelectDay(int day ) {
        new RegisterPage().selectDay(day);
    }

    @And("^I select Month \"([^\"]*)\"$")
    public void iSelectMonth(int month) {
       new RegisterPage().selectMonth(month);
    }

    @And("^I select Year \"([^\"]*)\"$")
    public void iSelectYear(int year) {
        new RegisterPage().selectYear(year);
    }

    @And("^I Enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("^I Enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("^I Enter password again \"([^\"]*)\"$")
    public void iEnterPasswordAgain(String confirm) {
        new RegisterPage().enterConfirmPassword(confirm);
    }

    @And("^I click on Register Button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should navigate to new profile page$")
    public void iShouldNavigateToNewProfilePage() {
        String actualMessage=  new RegisterPage().verifyRegisterCompleted();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals(actualMessage,expectedMessage,"Registration complete verfied");
    }
}
