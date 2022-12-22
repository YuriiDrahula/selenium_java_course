package com.automation.gtfcourse.lessons.seleniumandtestng.lesson20_pom_design_pattern.input_form_submit_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Factory extends Constants{

    @FindBy(css = FIRST_NAME_INPUT_FIELD_CSS)
    public WebElement firsNameInputField;
    @FindBy(css = LAST_NAME_INPUT_FIELD_CSS)
    public WebElement lastNameInputField;
    @FindBy(css = EMAIL_INPUT_FIELD_CSS)
    public WebElement emailInputField;
    @FindBy(css = PHONE_NUMBER_INPUT_FIELD_CSS)
    public WebElement phoneInputField;
    @FindBy(css = ADDRESS_INPUT_FIELD_CSS)
    public WebElement addressInputField;
    @FindBy(css = CITY_INPUT_FIELD_CSS)
    public WebElement cityInputField;
    @FindBy(css = STATE_DROPDOWN_CSS)
    public WebElement stateDropDown;
    @FindBy(css = ZIP_CODE_INPUT_FIELD_CSS)
    public WebElement zipCodeInputField;
    @FindBy(css = WEBSITE_OR_DOMAIN_INPUT_FIELD_CSS)
    public WebElement websiteOrDomainInputField;

    @FindBy(css = YES_RADIO_BUTTON_CSS)
    public WebElement yesRadioButton;

    @FindBy(css = NO_RADIO_BUTTON_CSS)
    public WebElement noRadioButton;

    @FindBy(css = PROJECT_DESCRIPTION_INPUT_FIELD_CSS)
    public WebElement projectDescriptionInputField;

    @FindBy(css = SEND_BUTTON_CSS)
    public WebElement sendButton;

    Factory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    /* Example of how works this class, normally this should not be here
    @Test
    public void exampleUsingThePageFactoryClass(){
        PageFactory.initElements(driver, this);
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
        this.firsNameInputField.sendKeys("First name");
        this.yesRadioButton.click();
    } */
}
