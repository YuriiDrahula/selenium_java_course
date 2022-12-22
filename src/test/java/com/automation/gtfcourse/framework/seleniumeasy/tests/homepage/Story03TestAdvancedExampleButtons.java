package com.automation.gtfcourse.framework.seleniumeasy.tests.homepage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Story03TestAdvancedExampleButtons extends ManagerSeleniumEasy {

    @Test
    public void tc01_chartsDemoButtonToCorrectURL(){
        homePage.clickAdvancedButton();
        homePage.clickChartsDemoButtonBody();
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demo.seleniumeasy.com/charts-mouse-hover-demo.html");
    }
}
