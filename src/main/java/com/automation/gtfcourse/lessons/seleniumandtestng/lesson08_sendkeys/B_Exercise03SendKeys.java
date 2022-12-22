package com.automation.gtfcourse.lessons.seleniumandtestng.lesson08_sendkeys;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class B_Exercise03SendKeys extends Manager {

    @Test
    public void exercise03SendKeys() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement enterAValueField = driver.findElement(By.xpath(".//input[@id='sum1']"));
        WebElement enterBValueField = driver.findElement(By.xpath(".//input[@id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.xpath(".//button[@onclick='return total()']"));

        //test case #1
        enterAValueField.sendKeys("7");
        enterBValueField.sendKeys("8");
        getTotalButton.click();
        Thread.sleep(1500);

        //test case #2
        enterBValueField.clear();
        enterBValueField.sendKeys("20");
        getTotalButton.click();
        Thread.sleep(1500);

        //test case #3
        enterAValueField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        enterAValueField.sendKeys("20");
        getTotalButton.click();

    }
}
