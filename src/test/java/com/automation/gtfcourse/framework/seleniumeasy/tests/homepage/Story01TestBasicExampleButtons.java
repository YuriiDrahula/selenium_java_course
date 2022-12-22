package com.automation.gtfcourse.framework.seleniumeasy.tests.homepage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Story01TestBasicExampleButtons extends ManagerSeleniumEasy {

    @Test
    public void tc01_simpleFormDemoButtonToCorrectURL(){
        logger.debug("Entered tc01_simpleFormDemoButtonToCorrectURL");
        homePage.clickBasicButton();
        homePage.clickSimpleFormDemoButtonBody();
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demo.seleniumeasy.com/basic-first-form-demo.html");
        screenShot.takeAndSave("simpleFormDemoButtonToCorrectURL");
    }

    @Test
    public void tc02_checkBoxDemoButtonToCorrectURL(){
        homePage.clickBasicButton();
        homePage.clickCheckBoxDemoButtonBody();
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        switchWindows.setMainWindow();
        switchWindows.switchToNewWindow();
        switchWindows.switchToMainWindow();
    }
}
