package com.automation.gtfcourse.framework.seleniumeasy.tests.homepage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Story02TestIntermediateExampleButtons extends ManagerSeleniumEasy {

    @Test
    public void tc01_dataListFilerToCorrectURL(){
        homePage.clickIntermediateButton();
        homePage.clickDataListFilterButtonBody();
        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://demo.seleniumeasy.com/data-list-filter-demo.html");
    }
}
