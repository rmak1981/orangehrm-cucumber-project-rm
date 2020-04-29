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
public class Homepage extends UtilityRM {

    // log4j properties

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _enterUsername;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _enterPassword;

    @FindBy(id = "btnLogin")
    WebElement _loginClick;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanelText;




    public void enterUsernametoField(String username){
        Reporter.addStepLog("enter user name"+username+"to the field"+_enterUsername.toString()+"<br>");
        sendTextToElement(_enterUsername,username);
        log.info("enter user name"+username+"to the field"+_enterUsername.toString());
    }
    public void enterPasswordtoField(String password){
        Reporter.addStepLog("enter password"+password+"to the field"+_enterPassword.toString()+"<br>");
        sendTextToElement(_enterPassword,password);
        log.info("enter password"+password+"to the field"+_enterPassword.toString());
    }
    public void clickOnLoginBtn(){
        Reporter.addStepLog("click on log in brn"+_loginClick.toString()+"<br>");
        clickOnElement(_loginClick);
        log.info("click on log in brn"+_loginClick.toString());
    }
    public String getLoginPanelText(){
        Reporter.addStepLog("get login panel text"+_loginPanelText.toString());
        log.info("get login panel text"+_loginPanelText.toString());
        return getTextFromElement(_loginPanelText);
    }
    public void doLogin(String username,String password){

        enterUsernametoField(username);
        enterPasswordtoField(password);
        clickOnLoginBtn();
    }



}

