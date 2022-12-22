package com.automation.gtfcourse.lessons.seleniumandtestng.lesson03_start_with_bigger_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_BiggerWindowWithDriver {
    static final String CHROMEDRIVER_KEY = "webdriver.chrome.driver";
    static final String CHROMEDRIVER_VALUE = "src\\main\\resources\\chromedriver.exe";

    public static void main(String[] args) {
        System.setProperty(CHROMEDRIVER_KEY, CHROMEDRIVER_VALUE);
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
    }
}
