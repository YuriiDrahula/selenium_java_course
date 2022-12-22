package com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager;

import org.testng.annotations.Test;

public class UsingManager extends Manager{

    @Test
    public void testCase01(){
        driver.get("https://google.com");

    }
}
