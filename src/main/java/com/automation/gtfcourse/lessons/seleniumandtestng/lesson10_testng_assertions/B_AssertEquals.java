package com.automation.gtfcourse.lessons.seleniumandtestng.lesson10_testng_assertions;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_AssertEquals extends Manager {

    @Test
    public void tc01_AssertEquals(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputAValue = driver.findElement(By.cssSelector("input[id='sum1']"));
        WebElement inputBValue = driver.findElement(By.cssSelector("input[id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        WebElement totalValue = driver.findElement(By.xpath(".//span[@id='displayvalue']"));

        inputAValue.sendKeys("2");
        inputBValue.sendKeys("1");
        getTotalButton.click();
        System.out.println("The total value of A + B = " + totalValue.getText());

        Assert.assertEquals(totalValue.getText(), "3", "The total value of input fields A and B is incorrect");
        System.out.println("The total value of input field A and B is correct");
    }
}
