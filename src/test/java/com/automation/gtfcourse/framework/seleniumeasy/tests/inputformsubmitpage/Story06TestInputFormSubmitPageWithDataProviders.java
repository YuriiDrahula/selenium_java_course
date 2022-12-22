package com.automation.gtfcourse.framework.seleniumeasy.tests.inputformsubmitpage;

import com.automation.gtfcourse.framework.seleniumeasy.automation.ManagerSeleniumEasy;
import org.testng.annotations.Test;

public class Story06TestInputFormSubmitPageWithDataProviders extends ManagerSeleniumEasy {

    /* 1. phoneNumber 2. state
    @DataProvider(name = "Story06 tc01")
    public Object[][] exampleOfUsingDataProvider(){
        return new Object[][] {
                {"0123456789", "Nevada"},
                {"876543das", "Arizona"},
                {"987659876", "Alabama"}
        };
    }*/

    @Test(dataProvider = "Story06 tc01", dataProviderClass = Story06DataProvider.class)
    public void tc01_testInputFormSubmitPageWithDataProviders(String phoneNumber, String state){
        homePage.clickIntermediateButton();
        homePage.clickInputFormWithValidationsButtonBody();
        inputFormSubmitPage.enterFirstName("John");
        inputFormSubmitPage.enterLastName("Doe");
        inputFormSubmitPage.enterEmail("johndoe@mail.com");
        inputFormSubmitPage.enterPhoneNumber(phoneNumber);
        inputFormSubmitPage.enterAddress("123, Baker st.");
        inputFormSubmitPage.enterCity("New York");
        inputFormSubmitPage.selectState(state);
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
