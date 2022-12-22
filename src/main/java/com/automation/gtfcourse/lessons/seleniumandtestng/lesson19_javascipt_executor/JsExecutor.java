package com.automation.gtfcourse.lessons.seleniumandtestng.lesson19_javascipt_executor;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JsExecutor extends Manager {

    /* 2 examples of using Javascript Executor
    1.  JavascriptExecutor JsExecutor = (JavascriptExecutor)driver;
        JsExecutor.executeScript("script", "object(s)");
    2. ((JavascriptExecutor)driver).executeScript("script", "object(s)"); */

    @Test
    public void clickWithJsExecutor(){
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        closePossibleAd();

        WebElement radioButtonOne = driver.findElement(By.cssSelector("input[value='Male'][name='optradio']"));
        WebElement radioButtonTwo = driver.findElement(By.cssSelector("input[value='Female'][name='gender']"));

        JavascriptExecutor JsE = (JavascriptExecutor)driver;
        //JsE.executeScript("arguments[0].click();", radioButtonOne);
        JsE.executeScript("arguments[0].click(); arguments[1].click();", radioButtonOne, radioButtonTwo);
    }

    @Test
    public void sendTextWithJsExecutor(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        closePossibleAd();
        WebElement inputField = driver.findElement(By.cssSelector("input[id='user-message']"));
        String textToSend = "write the text you want to send in here";

        //((JavascriptExecutor)driver).executeScript("arguments[0].value = 'write the text you want to send in here';", inputField);
        ((JavascriptExecutor)driver).executeScript("arguments[0].value = arguments[1];", inputField, textToSend);
    }

    @Test
    public void getAttributeValuesWithJsExecutor(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        closePossibleAd();

        // Sending the text copied from the last method
        WebElement inputField = driver.findElement(By.cssSelector("input[id='user-message']"));
        String textToSend = "write the text you want to send in here";
        ((JavascriptExecutor)driver).executeScript("arguments[0].value = arguments[1];", inputField, textToSend);

        // Getting the text by getting the attribute value
        Object attributeValueOfTheAttributeValue = ((JavascriptExecutor)driver).executeScript("return arguments[0].value;", inputField);
        Object attributeValueOfTheAttributeType = ((JavascriptExecutor)driver).executeScript("return arguments[0].type;", inputField);
        Object attributeValueOfTheAttributeId = ((JavascriptExecutor)driver).executeScript("return arguments[0].id;", inputField);
        System.out.println(attributeValueOfTheAttributeValue);
        System.out.println(attributeValueOfTheAttributeType);
        System.out.println(attributeValueOfTheAttributeId);
    }

    @Test
    public void getInnerTextWithJsExecutor(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        closePossibleAd();

        WebElement panelHeading = driver.findElement(By.cssSelector("div[class='panel-heading']"));
        System.out.println(((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", panelHeading));
    }

    @Test
    public void getPageTitleWithJsExecutor(){
        driver.get("https://demo.seleniumeasy.com/");
        closePossibleAd();
        System.out.println(((JavascriptExecutor)driver).executeScript("return document.title;"));
    }

    @Test
    public void scrollWithJavascriptExecutor(){
        driver.get("https://demo.seleniumeasy.com/");
        closePossibleAd();

        WebElement elementOnTheBottomOfThePage = driver.findElement(By.cssSelector("a[href='../maven-tutorials']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elementOnTheBottomOfThePage);
    }
}
