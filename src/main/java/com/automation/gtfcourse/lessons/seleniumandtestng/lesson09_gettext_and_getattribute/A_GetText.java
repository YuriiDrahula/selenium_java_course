package com.automation.gtfcourse.lessons.seleniumandtestng.lesson09_gettext_and_getattribute;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class A_GetText extends Manager {

    @Test
    public void getText(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputFieldOne = driver.findElement(By.cssSelector("input[id='user-message']"));
        inputFieldOne.sendKeys("Hello World!");

        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showMessageButton.click();

         /* Get the visible (i.e. not hidden by CSS) text of this element, including sub-elements.
        <a href="https://w3c.github.io/webdriver/#get-element-text">"This text here is the inner text"</a> */
        WebElement mySentMessageVerification = driver.findElement(By.cssSelector("span[id='display']"));
        System.out.println(mySentMessageVerification.getText());

        WebElement enterAValueField = driver.findElement(By.xpath(".//input[@id='sum1']"));
        WebElement enterBValueField = driver.findElement(By.xpath(".//input[@id='sum2']"));
        WebElement getTotalButton = driver.findElement(By.xpath(".//button[@onclick='return total()']"));

        enterAValueField.sendKeys("7");
        enterBValueField.sendKeys("8");
        getTotalButton.click();

        WebElement getTotalValue = driver.findElement(By.xpath(".//span[@id='displayvalue']"));
        System.out.println(getTotalValue.getText());
    }
}
