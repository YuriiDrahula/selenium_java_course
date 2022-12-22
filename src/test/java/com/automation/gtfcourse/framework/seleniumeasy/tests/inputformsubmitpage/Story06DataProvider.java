package com.automation.gtfcourse.framework.seleniumeasy.tests.inputformsubmitpage;

import org.testng.annotations.DataProvider;

public class Story06DataProvider {
    // 1. phoneNumber 2. state
    @DataProvider(name = "Story06 tc01")
    public static Object[][] exampleOfUsingDataProvider(){
        return new Object[][] {
                {"0123456789", "Nevada"},
                {"876543das", "Arizona"},
                {"987659876", "Alabama"}
        };
    }
}
