package com.automation.gtfcourse.lessons.seleniumandtestng.lesson11_static_dropdowns;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_StaticDropdowns extends Manager {

    @Test
    public void handleStaticDropdowns(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        WebElement optionOne = driver.findElement(By.cssSelector("select[id='dropdown'] :nth-child(2)"));
        WebElement optionTwo = driver.findElement(By.cssSelector("select[id='dropdown'] :nth-child(3)"));

        //select vy visible text
        new Select(dropDown).selectByVisibleText("Option 1");
        Assert.assertEquals(optionOne.getAttribute("selected"), "true", "Option 1 is not selected in the dropdown list");
        System.out.println(optionOne.getAttribute("selected"));

        //select by value
        new Select(dropDown).selectByValue("2");
        Assert.assertEquals(optionTwo.getAttribute("selected"), "true", "Option 2 is not selected in the dropdown list");

        //select by index
        new Select(dropDown).selectByIndex(1);
        Assert.assertEquals(optionOne.getAttribute("selected"), "true", "Option 1 is not selected in the dropdown list");
    }
}
