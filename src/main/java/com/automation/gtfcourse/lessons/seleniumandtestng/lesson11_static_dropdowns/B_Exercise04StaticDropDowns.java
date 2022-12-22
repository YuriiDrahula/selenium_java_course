package com.automation.gtfcourse.lessons.seleniumandtestng.lesson11_static_dropdowns;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_Exercise04StaticDropDowns extends Manager {

    @Test
    public void exercise04StaticDropDowns(){
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='select-demo']"));
        WebElement selectedDay = driver.findElement(By.cssSelector("p[class='selected-value']"));

        new Select(dropDown).selectByIndex(6);
        Assert.assertEquals(selectedDay.getText(), "Day selected :- Friday", "The test failed, you didn't select Friday");
    }
}
