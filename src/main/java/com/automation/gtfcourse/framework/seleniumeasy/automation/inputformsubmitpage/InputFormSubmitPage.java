package com.automation.gtfcourse.framework.seleniumeasy.automation.inputformsubmitpage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.tools.AdjustedInteractions;
import com.automation.gtfcourse.lessons.seleniumandtestng.lesson21_enums_for_dropdowns.StateEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class InputFormSubmitPage {

    public WebDriver driver;
    public Factory elements;
    public AdjustedInteractions adjustedInteractions;

    public InputFormSubmitPage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.adjustedInteractions = new AdjustedInteractions(driver);
    }

    public void enterFirstName(String firstName){
        adjustedInteractions.sendKeys(elements.firsNameInputField, firstName);
    }

    public void enterLastName(String lastName){
        adjustedInteractions.sendKeys(elements.lastNameInputField, lastName);
    }

    public void enterEmail(String email){
        adjustedInteractions.sendKeys(elements.emailInputField, email);
    }

    public void enterPhoneNumber(String phoneNumber){
        adjustedInteractions.sendKeys(elements.phoneInputField, phoneNumber);
    }

    public void enterAddress(String address){
        adjustedInteractions.sendKeys(elements.addressInputField, address);
    }

    public void enterCity(String city){
        adjustedInteractions.sendKeys(elements.cityInputField, city);
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
        adjustedInteractions.sendKeys(elements.zipCodeInputField, zipCode);
    }

    public void enterWebsiteName(String websiteOrDomainName){
        adjustedInteractions.sendKeys(elements.websiteOrDomainInputField, websiteOrDomainName);
    }

    public void clickYesRadioButton(){
        adjustedInteractions.click(elements.yesRadioButton);
    }

    public void clickNoRadioButton(){
        adjustedInteractions.click(elements.noRadioButton);
    }

    public void enterProjectDescription(String projectDescription){
        adjustedInteractions.sendKeys(elements.projectDescriptionInputField, projectDescription);
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
