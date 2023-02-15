package com.nopcommerce14.steps;

import com.nopcommerce14.pages.BuildYourOwnPage;
import com.nopcommerce14.pages.ComputerPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerPageTest {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputer();
    }

    @Then("^I should navigate to result page$")
    public void iShouldNavigateToResultPage() {
        String actualMessage = new ComputerPage().verifyComputerText();
        String expectedMessage = "Computers";
        Assert.assertEquals(actualMessage,expectedMessage,"Computers verfied");
    }

    @And("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("^I should navigate to desktop result page$")
    public void iShouldNavigateToDesktopResultPage() {
        String actualMessage = new ComputerPage().verifydesktopText();
        String expectedMessage = "Desktops";
        Assert.assertEquals(actualMessage,expectedMessage,"Desktops verfied");
    }

    @And("^I click on Build your own computer$")
    public void iClickOnBuildYourOwnComputer() {
        new BuildYourOwnPage().clickOnByoc();
    }

    @And("^I select Processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor){
        if (processor.equals("2.2 GHz Intel Pentium Dual-Core E2200")){
            new BuildYourOwnPage().selectProcessor(1);
        } else if (processor.equals("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]")) {
            new BuildYourOwnPage().selectProcessor(2);
        }
    }

    @And("^I select Ram \"([^\"]*)\"$")
    public void iSelectRam(String ram){
        switch (ram) {
            case "2 GB":
                new BuildYourOwnPage().selectRam(3);
                break;
            case "4GB [+$20.00]":
                new BuildYourOwnPage().selectRam(4);
                break;
            case "8GB [+$60.00]":
                new BuildYourOwnPage().selectRam(5);
                break;
        }
    }

    @And("^I select Hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd) {
        if (hdd.equals("320 GB")){
            new BuildYourOwnPage().select320gbhdd();
        }else {
            new BuildYourOwnPage().select400gbHdd();
        }
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        if (os.equals("Vista Home [+$50.00]")){
            new BuildYourOwnPage().selectOsVistaraHome();
        }else {
            new BuildYourOwnPage().selectOsVistaraPremium();
        }
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        switch (software) {
            case "Microsoft Office [+$50.00]":
                new BuildYourOwnPage().selectSoftwareMsOff();
                break;
            case "Acrobat Reader [+$10.00]":
                new BuildYourOwnPage().selectSoftwareAcroRead();
                break;
            case "Total Commander [+$5.00]":
                new BuildYourOwnPage().selectSoftwareTotal();
                break;
        }
    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() {
        new BuildYourOwnPage().clickOnAddCArt();
    }

    @Then("^I should verify product added into cart or not$")
    public void iShouldVerifyProductAddedIntoCartOrNot() {
        String actualMessage = new BuildYourOwnPage().verifyOrder();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage,expectedMessage,"order verfied");
    }
}
