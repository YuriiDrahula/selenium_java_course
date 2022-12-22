package com.automation.gtfcourse.lessons.seleniumandtestng.lesson21_enums_for_dropdowns;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.testng.annotations.Test;

public class TestEnum extends Manager {

    @Test
    public void testInputFormSubmitPage() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");

        inputFormSubmitPage.selectState(StateEnum.ARKANSAS.byVisibleText);
        Thread.sleep(2000);
        inputFormSubmitPage.selectState(StateEnum.CALIFORNIA.byValue);
        Thread.sleep(2000);
        inputFormSubmitPage.selectState(StateEnum.ALASKA.byIndex);
    }
}
