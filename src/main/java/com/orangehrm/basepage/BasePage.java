package com.orangehrm.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class BasePage  {

    public static WebDriver driver;

    //constructor

    public BasePage(){

        //log4j & page factory

        PageFactory.initElements(driver,this);

        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/orangehrm/resources/properties/log4j.properties");
    }

}
