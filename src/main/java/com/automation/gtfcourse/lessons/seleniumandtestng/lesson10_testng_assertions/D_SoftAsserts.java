package com.automation.gtfcourse.lessons.seleniumandtestng.lesson10_testng_assertions;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D_SoftAsserts extends Manager {

    @Test
    public void tc04_SoftAsserts(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputAValue = driver.findElement(By.cssSelector("input[id='sum1']"));
        WebElement inputBValue = driver.findElement(By.cssSelector("input[id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        WebElement totalValue = driver.findElement(By.xpath(".//span[@id='displayvalue']"));

        inputAValue.sendKeys("a");
        inputBValue.sendKeys("1");
        getTotalButton.click();
        System.out.println("The total value of A + B = " + totalValue.getText());

        SoftAssert softAssert = new SoftAssert();
        if(!inputAValue.getAttribute("value").matches("\\d+"))
            softAssert.fail("The value of the input field A is not a number");

        if(!inputBValue.getAttribute("value").matches("\\d+"))
            softAssert.fail("The value of the input field B is not a number");

        if(!totalValue.getText().matches("\\d+"))
            softAssert.fail("The value of the total value of A and B is not a number");

        softAssert.assertAll();
    }
}
