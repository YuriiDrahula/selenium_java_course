package com.automation.gtfcourse.lessons.seleniumandtestng.lesson13_javascript_alerts;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptAlerts extends Manager {

    private static final String URL = "https://demo.seleniumeasy.com/javascript-alert-box-demo.html";

    // Simple alert displays some information or a warning on the screen
    @Test
    public void simpleAlert(){
        driver.get(URL);
        WebElement simpleAlertButton = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        simpleAlertButton.click();
        driver.switchTo().alert().accept();
    }

    // The confirmation alert asks for permission to do some type of operation
    @Test
    public void confirmationAlert(){
        driver.get(URL);
        WebElement confirmationAlertButton = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirmationAlertButton.click();
        driver.switchTo().alert().dismiss();
    }

    // The prompt alert asks for some input from the user
    @Test
    public void promptAlert(){
        driver.get(URL);
        WebElement promptAlertButton = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        promptAlertButton.click();
        driver.switchTo().alert().sendKeys("Yurii");
        driver.switchTo().alert().accept();
    }

}
