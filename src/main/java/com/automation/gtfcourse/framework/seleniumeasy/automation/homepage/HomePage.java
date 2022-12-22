package com.automation.gtfcourse.framework.seleniumeasy.automation.homepage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage{

    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;
    private Logger logger;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);
        this.logger = LogManager.getLogger(getClass());
    }

    public void clickWelcomeButton(){
        adjustedInteractions.click(elements.welcomeButton);
    }
    public void clickBasicButton(){
        logger.debug("Entered method clickBasicButton");
        adjustedInteractions.click(elements.basicButton);
        logger.debug("Clicked Basic Button");
    }
    public void clickIntermediateButton(){
        adjustedInteractions.click(elements.intermediateButton);
    }
    public void clickAdvancedButton(){
        adjustedInteractions.click(elements.advancedButton);
    }
    public void clickCompletedButton(){
        adjustedInteractions.click(elements.completedButton);
    }
    public void clickSimpleFormDemoButtonBody(){
        logger.debug("Entered method clickSimpleFormDemoButtonBody");
        adjustedInteractions.click(elements.simpleFormDemoButtonBody);
        logger.debug("Clicked Simple Form Demo Button");
    }
    public void clickCheckBoxDemoButtonBody(){
        adjustedInteractions.click(elements.checkBoxDemoButtonBody);
    }
    public void clickInputFormWithValidationsButtonBody(){
        adjustedInteractions.click(elements.inputFormWithValidationsButtonBody);
    }
    public void clickDataListFilterButtonBody(){
        adjustedInteractions.click(elements.dataListFilterButtonBody);
    }
    public void clickChartsDemoButtonBody(){
        adjustedInteractions.click(elements.chartsDemoButtonBody);
    }
}


