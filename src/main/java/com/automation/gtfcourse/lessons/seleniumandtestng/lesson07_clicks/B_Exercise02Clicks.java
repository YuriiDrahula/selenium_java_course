package com.automation.gtfcourse.lessons.seleniumandtestng.lesson07_clicks;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class B_Exercise02Clicks extends Manager {

    @Test
    public void exercise02Clicks(){
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement secondMaleRadioButton = driver.findElement(By.xpath(".//input[@value='Male' and @name='gender']"));
        secondMaleRadioButton.click();

        WebElement ageGroup1550RadioButton = driver.findElement(By.xpath(".//input[@value='15 - 50']"));
        ageGroup1550RadioButton.click();

        WebElement getValuesButton = driver.findElement(By.xpath(".//button[@onclick='getValues();']"));
        getValuesButton.click();
    }
}
