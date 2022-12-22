package com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson20_pom_design_pattern.input_form_submit_page.InputFormSubmitPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Manager {

    public WebDriver driver;
    private ChromeOptions chromeOptions;
    public SoftAssert softAssert;
    public InputFormSubmitPage inputFormSubmitPage;

    @BeforeSuite
    public void prepareTestEnvironment(){
    // loading environment variables
    // loading test user and passwords to log in
        System.out.println("Loading in usernames and passwords");
    }

    @BeforeMethod
    public void executeBeforeTestMethod(){
    // setup the driver
        System.out.println("Setting up the chromedriver");
        WebDriverManager.chromedriver().setup();

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        softAssert = new SoftAssert();
        inputFormSubmitPage = new InputFormSubmitPage(driver);
    }

    @AfterMethod
    public void executeAfterTestMethod(){
    //quit the driver
       //System.out.println("Terminating the driver");
       //driver.quit();
    }

    @Test(enabled = false)
    public void testCase01(){
        System.out.println("Executing testCase01");
    }

    @Test(enabled = false)
    public void testCase02(){
        System.out.println("Executing testCase02");
    }

    public void closePossibleAd(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='at4win-header'] a"))).click();
        } catch (Exception e){
            e.getMessage();
        }
    }
}
