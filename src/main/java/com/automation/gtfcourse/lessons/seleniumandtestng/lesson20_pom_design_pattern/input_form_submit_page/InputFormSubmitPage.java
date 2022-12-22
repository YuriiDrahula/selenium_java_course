package com.automation.gtfcourse.lessons.seleniumandtestng.lesson20_pom_design_pattern.input_form_submit_page;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson21_enums_for_dropdowns.StateEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class InputFormSubmitPage {

    public WebDriver driver;
    public Factory elements;

    public InputFormSubmitPage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
    }

    public void enterFirstName(String firstName){
        elements.firsNameInputField.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        elements.lastNameInputField.sendKeys(lastName);
    }

    public void enterEmail(String email){
        elements.emailInputField.sendKeys(email);
    }

    public void enterPhoneNumber(String phoneNumber){
        elements.phoneInputField.sendKeys(phoneNumber);
    }

    public void enterAddress(String address){
        elements.addressInputField.sendKeys(address);
    }

    public void enterCity(String city){
        elements.cityInputField.sendKeys(city);
    }

    public void selectState(String stateByVisibleTextOrValue){
        try {
            new Select(elements.stateDropDown).selectByVisibleText(stateByVisibleTextOrValue);
        }catch (Exception e){
            new Select(elements.stateDropDown).selectByValue(stateByVisibleTextOrValue);
        }
    }

    public void selectState(int stateByIndex){
        new Select(elements.stateDropDown).selectByIndex(stateByIndex);
    }

    public void selectState(StateEnum stateEnum){
        try {
            new Select(elements.stateDropDown).selectByVisibleText(stateEnum.byVisibleText);
        }catch (Exception e1){
            try{
                new Select(elements.stateDropDown).selectByValue(stateEnum.byValue);
            }catch (Exception e2){
                new Select(elements.stateDropDown).selectByIndex(stateEnum.byIndex);
            }
        }
    }

    public void enterZipCode(String zipCode){
        elements.zipCodeInputField.sendKeys(zipCode);
    }

    public void enterWebsiteName(String websiteOrDomainName){
        elements.websiteOrDomainInputField.sendKeys(websiteOrDomainName);
    }

    public void clickYesRadioButton(){
        elements.yesRadioButton.click();
    }

    public void clickNoRadioButton(){
        elements.noRadioButton.click();
    }

    public void enterProjectDescription(String projectDescription){
        elements.projectDescriptionInputField.sendKeys(projectDescription);
    }

    public void clickSendButton(){
        elements.sendButton.click();
    }

    public void validateIfPhoneNumberContainsOnlyNumbers(SoftAssert softAssert){
        softAssert.assertTrue(elements.phoneInputField.getAttribute("value").matches("\\d+"), "The phone number doesn't consist of digits only");
    }

    public void validateIfCorrectStateIsSelected(SoftAssert softAssert, String expectedValue){
        softAssert.assertEquals(elements.stateDropDown.getAttribute("value"), expectedValue, "Another state was chosen");
    }

    public void validateIfYesButtonIsChecked(SoftAssert softAssert){
        softAssert.assertEquals(elements.yesRadioButton.getAttribute("checked"), "true", "The Yes radio button isn't chosen");
    }
}
