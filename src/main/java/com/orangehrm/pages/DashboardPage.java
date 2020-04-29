package com.orangehrm.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class DashboardPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _welcomeToAdminText;

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeAdmin;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logOutBtn;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement _pimClick;

    @FindBy(css = "#btnAdd")
    WebElement _addButton;

    @FindBy(css = "div:nth-child(1) div:nth-child(3) div.box:nth-child(1) div.head > h1:nth-child(1)")
    WebElement _addEmployeeText;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement _enterFirstName;

    @FindBy(id = "lastName")
    WebElement _enterLastName;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement _saveButton;




    public String  getWelcomeToAdminText(){
        Reporter.addStepLog("get welcome to admin text"+_welcomeToAdminText.toString()+"<br>");
        log.info("get welcome to admin text"+_welcomeToAdminText.toString());
        return getTextFromElement(_welcomeToAdminText);

    }
    public void clickOnWelcomeToAdmin(){
        Reporter.addStepLog("click on Welcome to admin"+_welcomeAdmin.toString()+"<br>");
        clickOnElement(_welcomeAdmin);
        log.info("click on Welcome to admin"+_welcomeAdmin.toString());
    }
    public void clickOnLogoutBtn(){
        Reporter.addStepLog("click on log out "+_logOutBtn.toString());
        clickOnElement(_logOutBtn);
        log.info("click on log out "+_logOutBtn.toString());
    }

    public void clickOnPIMBtn(){
        Reporter.addStepLog("click on pim"+_pimClick.toString()+"<br>");
        clickOnElement(_pimClick);
        log.info("click on pim"+_pimClick.toString());
    }
    public void clickOnAddButton(){
        Reporter.addStepLog("click on add btn "+_addButton.toString()+"<br>");
        clickOnElement(_addButton);
        log.info("click on add btn "+_addButton.toString());
    }
    public String getAddEmployeeText(){
        Reporter.addStepLog("get text add employee"+_addEmployeeText.toString()+"<br>");
        log.info("get text add employee"+_addEmployeeText.toString());
        return getTextFromElement(_addEmployeeText);
    }
    public void enterFirstNametoField(String firstname){
        Reporter.addStepLog("enter first name"+firstname+"to the field"+_enterFirstName.toString()+"<br>");
        sendTextToElement(_enterFirstName,firstname);
        log.info("enter first name"+firstname+"to the field"+_enterFirstName.toString());
    }
    public void enterLastNametoField(String lastname){
        Reporter.addStepLog("enter last name"+lastname+"to the field"+_enterLastName.toString()+"<br>");
        sendTextToElement(_enterLastName,lastname);
        log.info("enter last name"+lastname+"to the field"+_enterLastName.toString());
    }
    public void clickOnSaveButton(){
        Reporter.addStepLog("click on add btn"+_saveButton.toString()+"<br>");
        clickOnElement(_saveButton);
        log.info("click on add btn"+_saveButton.toString());
    }

    public void iAmOnAddEmployeePage(){
        clickOnPIMBtn();
        //clickOnAddButton();
    }


    }




