package com.automation.gtfcourse.lessons.seleniumandtestng.lesson03_start_with_bigger_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B_BiggerWindowWithDriver {
    static final String CHROMEDRIVER_KEY = "webdriver.chrome.driver";
    static final String CHROMEDRIVER_VALUE = "src\\main\\resources\\chromedriver.exe";

    public static void main(String[] args) {
        System.setProperty(CHROMEDRIVER_KEY, CHROMEDRIVER_VALUE);

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
    }
}
