package com.automation.gtfcourse.lessons.seleniumandtestng.lesson16_smart_waits;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SmartWaits extends Manager {

    /* Pauses the thread for X amount of time
       People don't prefer to use it
       1) The actions you are waiting for executed faster! The rest of the time is a waste!
       2) The actions you are waiting for took longer! The test case failed! */
    @Test
    public void threadSleep() throws InterruptedException {
        Thread.sleep(5000);
    }

    /* Defines a wait time globally in the project.
       Telling the driver to wait an X amount of time before throwing an exception */
    @Test
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("This element does not exist"));
    }

    /* Define an object first to wait an amount of seconds
       Then we can target specific elements to wait for that amount of seconds */
    @Test
    public void explicitWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://google.com");
        WebElement exampleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("The element does not exist")));

    }

}
