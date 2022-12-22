package com.automation.gtfcourse.framework.seleniumeasy.tests.inputformsubmitpage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.annotations.Test;

public class Story04TestInputFormSubmitPage extends ManagerSeleniumEasy {

    @Test
    public void tc01_testInputFormSubmitPageWithSoftAsserts(){
        homePage.clickIntermediateButton();
        homePage.clickInputFormWithValidationsButtonBody();
        inputFormSubmitPage.enterFirstName("John");
        inputFormSubmitPage.enterLastName("Doe");
        inputFormSubmitPage.enterEmail("johndoe@mail.com");
        inputFormSubmitPage.enterPhoneNumber("1231231231");
        inputFormSubmitPage.enterAddress("123, Baker st.");
        inputFormSubmitPage.enterCity("Nevada");
        inputFormSubmitPage.selectState("Nevada");
        inputFormSubmitPage.enterZipCode("1234");
        inputFormSubmitPage.enterWebsiteName("johndoe.org");
        inputFormSubmitPage.clickYesRadioButton();
        inputFormSubmitPage.enterProjectDescription("This is my new project");

        inputFormSubmitPage.validateIfPhoneNumberContainsOnlyNumbers(softAssert);
        inputFormSubmitPage.validateIfCorrectStateIsSelected(softAssert, "Nevada");
        inputFormSubmitPage.validateIfYesButtonIsChecked(softAssert);

        softAssert.assertAll();
    }
}
