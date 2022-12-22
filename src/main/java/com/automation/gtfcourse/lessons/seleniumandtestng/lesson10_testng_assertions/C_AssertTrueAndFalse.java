package com.automation.gtfcourse.lessons.seleniumandtestng.lesson10_testng_assertions;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C_AssertTrueAndFalse extends Manager {

    @Test
    public void tc01_AssertTrue(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputAValue = driver.findElement(By.cssSelector("input[id='sum1']"));
        WebElement inputBValue = driver.findElement(By.cssSelector("input[id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        WebElement totalValue = driver.findElement(By.xpath(".//span[@id='displayvalue']"));

        inputAValue.sendKeys("5");
        inputBValue.sendKeys("1");
        getTotalButton.click();
        System.out.println("The total value of A + B = " + totalValue.getText());

        Assert.assertTrue(totalValue.getText().equals("6"), "The total value is incorrect");
    }

    @Test
    public void tc02_AssertFalse(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputAValue = driver.findElement(By.cssSelector("input[id='sum1']"));
        WebElement inputBValue = driver.findElement(By.cssSelector("input[id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        WebElement totalValue = driver.findElement(By.xpath(".//span[@id='displayvalue']"));

        inputAValue.sendKeys("5");
        inputBValue.sendKeys("1");
        getTotalButton.click();
        System.out.println("The total value of A + B = " + totalValue.getText());

        Assert.assertFalse(totalValue.getText().equals("6"), "The total value of A and B = 6");
    }
}
