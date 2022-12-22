package com.automation.gtfcourse.lessons.seleniumandtestng.lesson12_simple_form;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exercise05SimpleForm extends Manager {

    @Test
    public void simpleForm(){
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
        WebElement firsNameInputField = driver.findElement(By.cssSelector("input[name='first_name']"));
        WebElement lastNameInputField = driver.findElement(By.cssSelector("input[name='last_name']"));
        WebElement emailInputField = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement phoneInputField = driver.findElement((By.cssSelector("input[name='phone']")));
        WebElement addressInputField = driver.findElement(By.cssSelector("input[name='address']"));
        WebElement cityInputField = driver.findElement(By.cssSelector("input[name='city']"));
        WebElement selectStateDropDown = driver.findElement(By.cssSelector("select[name='state']"));
        WebElement zipInputField = driver.findElement(By.cssSelector("input[name='zip']"));
        WebElement websiteOrDomainInputField = driver.findElement(By.cssSelector("input[name='website']"));
        WebElement yesRadioButton = driver.findElement(By.cssSelector("input[value='yes']"));
        WebElement noRadioButton = driver.findElement(By.cssSelector("input[value='no']"));
        WebElement projectDescriptionInputField = driver.findElement(By.cssSelector("textarea[name='comment']"));
        WebElement sendButton = driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-default']"));

        firsNameInputField.sendKeys("John");
        lastNameInputField.sendKeys("Doe");
        emailInputField.sendKeys("johndoe@mail.com");
        phoneInputField.sendKeys("1221122222");
        addressInputField.sendKeys("12, Springfield St.");
        cityInputField.sendKeys("Springfield");
        new Select(selectStateDropDown).selectByVisibleText("Virginia");
        zipInputField.sendKeys("1234");
        websiteOrDomainInputField.sendKeys("johndoe.org");
        yesRadioButton.click();
        projectDescriptionInputField.sendKeys("This is my first form");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(phoneInputField.getAttribute("value").matches("\\d+"), "The phone number doesn't consist of digits only");
        softAssert.assertEquals(selectStateDropDown.getAttribute("value"), "Virginia", "Another state was chosen");
        softAssert.assertEquals(yesRadioButton.getAttribute("checked"), "true", "The Yes radio button isn't chosen");

        softAssert.assertAll();

    }

}
