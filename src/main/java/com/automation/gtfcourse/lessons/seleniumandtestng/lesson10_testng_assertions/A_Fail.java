package com.automation.gtfcourse.lessons.seleniumandtestng.lesson10_testng_assertions;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_Fail extends Manager {

    /* Requirements:
    - The text must only show one digit
    = The total value may not be a 3 */
    @Test
    public void tc01_fail (){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputAValue = driver.findElement(By.cssSelector("input[id='sum1']"));
        WebElement inputBValue = driver.findElement(By.cssSelector("input[id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        WebElement totalValue = driver.findElement(By.cssSelector("span[id='displayvalue']"));

        inputAValue.sendKeys("2");
        inputBValue.sendKeys("2");
        getTotalButton.click();
        System.out.println("The total value of A + B = " + totalValue.getText());

        /* \\d ---> one digit
            \\d+ ---> one or more digit */
        if(!totalValue.getText().matches("\\d"))
            Assert.fail("The total value does not meet the requirement of having one digit only");
        System.out.println("The total value meets the requirement of having 1 digit only");

        if(totalValue.getText().matches("[3]"))
            Assert.fail("The total value is 3! It doesn't meet the requirements");
        System.out.println("The total value is not 3, the functionality meets all requirements");

    }
}
