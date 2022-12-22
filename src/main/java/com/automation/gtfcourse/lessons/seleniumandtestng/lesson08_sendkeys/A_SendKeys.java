package com.automation.gtfcourse.lessons.seleniumandtestng.lesson08_sendkeys;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A_SendKeys extends Manager {

    @Test
    public void sendKeys(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputFieldOne = driver.findElement(By.cssSelector("input[id='user-message']"));
        inputFieldOne.sendKeys("Hello World!");

        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showMessageButton.click();
        inputFieldOne.clear();

        inputFieldOne.sendKeys("Second time entering the text");
        showMessageButton.click();
        inputFieldOne.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        inputFieldOne.sendKeys("The third message");
        showMessageButton.click();
    }
}
