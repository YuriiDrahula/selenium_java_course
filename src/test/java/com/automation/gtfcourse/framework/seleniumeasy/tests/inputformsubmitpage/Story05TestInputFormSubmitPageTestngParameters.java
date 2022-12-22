package com.automation.gtfcourse.framework.seleniumeasy.tests.inputformsubmitpage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Story05TestInputFormSubmitPageTestngParameters extends ManagerSeleniumEasy {

    @Parameters ({"phoneNumber", "state" })
    @Test
    public void tc01_testInputFormSubmitPageWithTestngParameters(String phoneNumber, String state){
        homePage.clickIntermediateButton();
        homePage.clickInputFormWithValidationsButtonBody();
        inputFormSubmitPage.enterFirstName("John");
        inputFormSubmitPage.enterLastName("Doe");
        inputFormSubmitPage.enterEmail("johndoe@mail.com");
        inputFormSubmitPage.enterPhoneNumber(phoneNumber);
        inputFormSubmitPage.enterAddress("123, Baker st.");
        inputFormSubmitPage.enterCity("Nevada");
        inputFormSubmitPage.selectState(state);
        inputFormSubmitPage.enterZipCode("1234");
        inputFormSubmitPage.enterWebsiteName("johndoe.org");
        inputFormSubmitPage.clickYesRadioButton();
        inputFormSubmitPage.enterProjectDescription("This is my new project");

        inputFormSubmitPage.validateIfPhoneNumberContainsOnlyNumbers(softAssert);
        inputFormSubmitPage.validateIfCorrectStateIsSelected(softAssert, "Alaska");
        inputFormSubmitPage.validateIfYesButtonIsChecked(softAssert);

        softAssert.assertAll();
    }
}
