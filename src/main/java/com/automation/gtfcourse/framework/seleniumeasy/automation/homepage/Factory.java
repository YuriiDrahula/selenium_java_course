package com.automation.gtfcourse.framework.seleniumeasy.automation.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory extends Constants{

    @FindBy(css = WELCOME_BUTTON_CSS)
    public WebElement welcomeButton;
    @FindBy(css = BASIC_BUTTON_CSS)
    public WebElement basicButton;
    @FindBy(css = INTERMEDIATE_BUTTON_CSS)
    public WebElement intermediateButton;
    @FindBy(css = ADVANCED_BUTTON_CSS)
    public WebElement advancedButton;
    @FindBy(css = COMPLETED_BUTTON_CSS)
    public WebElement completedButton;
    @FindBy(css = SIMPLE_FORM_DEMO_BUTTON_BODY_CSS)
    public WebElement simpleFormDemoButtonBody;
    @FindBy(css = CHECK_BOX_DEMO_BUTTON_BODY_CSS)
    public WebElement checkBoxDemoButtonBody;
    @FindBy(css = INPUT_FORM_WITH_VALIDATIONS_BUTTON_BODY_CSS)
    public WebElement inputFormWithValidationsButtonBody;
    @FindBy(css = DATA_LIST_FILTER_BUTTON_BODY_CSS)
    public WebElement dataListFilterButtonBody;
    @FindBy(css = CHARTS_DEMO_BUTTON_BODY_CSS)
    public WebElement chartsDemoButtonBody;

    public Factory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
