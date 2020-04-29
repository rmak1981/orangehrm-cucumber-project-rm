package com.orangehrm.cucumber.stepdefs;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class DashboardSteps {

    @And("^I click on pim button$")
    public void iClickOnPimButton() {
        new DashboardPage().clickOnPIMBtn();
    }

    @And("^I click on add button$")
    public void iClickOnAddButton() {
        new DashboardPage().clickOnAddButton();
    }
    @Then("^I am on add employee page$")
    public void iAmOnAddEmployeePage() {
        Assert.assertEquals(new DashboardPage().getAddEmployeeText(),"Add Employee");
    }
    // home page button are added in do log in background
    @Given("^I am on employee page$")
    public void iAmOnEmployeePage() {
        new Homepage().doLogin("Admin","admin123");
        new DashboardPage().iAmOnAddEmployeePage();
    }
    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname)  {
        new DashboardPage().enterFirstNametoField(firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname)  {
        new DashboardPage().enterLastNametoField(lastname);
    }

    @Then("^I click on save button$")
    public void iClickOnSaveButton() {
        new DashboardPage().clickOnSaveButton();
    }
}
