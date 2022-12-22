package com.automation.gtfcourse.lessons.seleniumandtestng.lesson07_clicks;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A_Clicks extends Manager {

    @Test
    public void clicks() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        //driver.findElement(By.cssSelector("input[value='Male'][name='optradio']")).click(); //or
        WebElement firstMaleRadioButton = driver.findElement(By.cssSelector("input[value='Male'][name='optradio']"));
        firstMaleRadioButton.click();
        Thread.sleep(1000);

        WebElement firstFemaleRadioButton = driver.findElement(By.cssSelector("input[value='Female'][name='optradio']"));
        firstFemaleRadioButton.click();

        WebElement getCheckedValueButton = driver.findElement(By.cssSelector("button[id='buttoncheck']"));
        getCheckedValueButton.click();
    }
}
