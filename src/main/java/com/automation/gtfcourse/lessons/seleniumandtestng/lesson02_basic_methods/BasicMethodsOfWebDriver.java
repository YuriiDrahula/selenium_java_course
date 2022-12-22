package com.automation.gtfcourse.lessons.seleniumandtestng.lesson02_basic_methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsOfWebDriver {

    static final String CHROMEDRIVER_KEY = "webdriver.chrome.driver";
    static final String CHROMEDRIVER_VALUE = "src\\main\\resources\\chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(CHROMEDRIVER_KEY, CHROMEDRIVER_VALUE);
        WebDriver driver = new ChromeDriver();

        /*
		get();
		It's used to go to the particular website,
		But it doesn't maintain the browser History and cookies so,
		we can't use forward and backward button.

		navigate();
		it's used to go to the particular website,
		but it maintains the browser history and cookies,
		so we can use forward and backward button to navigate between the pages during tests

		getCurentURl();
		Get a string representing the current URL that the browser is looking at.

		getTitle();
		The title of the current page.

		getPageSource();
		Get the source of the last loaded page.

		close();
		Close the current window, quitting the browser if it's the last window currently open.

		quit();
		Quits this driver, closing every associated window. */

        driver.get("https://www.google.com/");
        driver.navigate().to("https://uk-ua.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();

        System.out.println("The current url is - " + driver.getCurrentUrl());
        System.out.println("The title of this page is - " + driver.getTitle());
        System.out.println("The source of this page is - " + driver.getPageSource());

        ((JavascriptExecutor)driver).executeScript("window.open()");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
