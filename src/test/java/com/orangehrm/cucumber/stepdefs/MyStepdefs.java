package com.orangehrm.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class MyStepdefs {

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
        Reporter.addStepLog("I am on home page baseURL = https://opensource-demo.orangehrmlive.com/ ");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new Homepage().enterUsernametoField(username);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new Homepage().enterPasswordtoField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new Homepage().clickOnLoginBtn();
    }

    @Then("^I should log in successfully$")
    public void iShouldLogInSuccessfully() {
        Assert.assertEquals(new DashboardPage().getWelcomeToAdminText(),"Welcome Steven");

    }

    @And("^I click on welcome to admin menu$")
    public void iClickOnWelcomeToAdminMenu() {
        new DashboardPage().clickOnWelcomeToAdmin();
  }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new DashboardPage().clickOnLogoutBtn();
    }

    @Then("^I should log out successfully$")
    public void iShouldLogOutSuccessfully() {
        Assert.assertEquals(new Homepage().getLoginPanelText(),"LOGIN Panel");
    }
}
