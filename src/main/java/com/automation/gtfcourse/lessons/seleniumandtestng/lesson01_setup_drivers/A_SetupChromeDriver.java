package com.automation.gtfcourse.lessons.seleniumandtestng.lesson01_setup_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_SetupChromeDriver {

    static final String CHROMEDRIVER_KEY = "webdriver.chrome.driver";
    static final String CHROMEDRIVER_VALUE = "src\\main\\resources\\chromedriver.exe";


    public static void main(String[] args) {
        System.setProperty(CHROMEDRIVER_KEY, CHROMEDRIVER_VALUE);
        WebDriver driver = new ChromeDriver();
    }
}
