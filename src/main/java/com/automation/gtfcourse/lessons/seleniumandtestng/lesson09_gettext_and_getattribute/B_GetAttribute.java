package com.automation.gtfcourse.lessons.seleniumandtestng.lesson09_gettext_and_getattribute;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class B_GetAttribute extends Manager {

    /* This method will return the value of the property with the given name, if it exists.
    If it does not exist, then the value of the attribute with the given name is returned.
    If neither exists, null is returned. */

    @Test
    public void getPropertyValueOfCkeckbox(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkboxOne = driver.findElement(By.cssSelector("form[id='checkboxes'] :nth-child(1)"));
        checkboxOne.click();
        System.out.println(checkboxOne.getAttribute("checked"));
    }

    @Test
    public void getPropertyValueOfInputField(){
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");

        WebElement inputLastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        inputLastName.sendKeys("John Doe");
        System.out.println(inputLastName.getAttribute("value"));
    }

    @Test
    public void getAttribute(){
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");

        WebElement inputLastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        System.out.println(inputLastName.getAttribute("name"));
    }
}
