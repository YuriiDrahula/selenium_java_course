package com.automation.gtfcourse.framework.seleniumeasy.automation.tools;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdjustedInteractions {

    public WebDriver driver;
    public WebDriverWait wait;

    public AdjustedInteractions(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void click(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    public void sendKeys(WebElement element, String keysToSend){
        while(!element.getAttribute("value").isEmpty()){
            element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        }
        element.sendKeys(keysToSend);
    }
}
