package com.orangehrm.cucumber;

import com.cucumber.listener.Reporter;
import com.orangehrm.basepage.BasePage;
import com.orangehrm.browserselector.BrowserSelector;
import com.orangehrm.loadproperty.LoadProperty;
import com.orangehrm.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */

public class Hook extends BasePage {


    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseURL = loadProperty.getProperty("baseURL");

    // cucumber before class must need to selected
    @Before
    public void openBrowser() {

        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
        // assign author
        Reporter.assignAuthor("OrangeHRM ", "GS-RM");
    }

    @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenShotPath = UtilityRM.getScreenshot(driver, scenario.getName());
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

}
