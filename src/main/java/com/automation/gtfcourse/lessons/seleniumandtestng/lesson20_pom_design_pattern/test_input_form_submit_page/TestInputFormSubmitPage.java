package com.automation.gtfcourse.lessons.seleniumandtestng.lesson20_pom_design_pattern.test_input_form_submit_page;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.testng.annotations.Test;

public class TestInputFormSubmitPage extends Manager {

    @Test
    public void testInputFormSubmitPage(){
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
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
