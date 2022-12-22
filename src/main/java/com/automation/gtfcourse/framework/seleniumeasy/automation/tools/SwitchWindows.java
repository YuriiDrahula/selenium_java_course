package com.automation.gtfcourse.framework.seleniumeasy.automation.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class SwitchWindows {

    public WebDriver driver;
    public String mainWindow;

    public SwitchWindows(WebDriver driver){
        this.driver = driver;

    }

    public void setMainWindow(){
       mainWindow = driver.getWindowHandle();
    }

    public void switchToNewWindow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> storedWindows = driver.getWindowHandles();
        for (String storedWindow : storedWindows){
            if(!storedWindow.equals(mainWindow))
                driver.switchTo().window(storedWindow);
        }
    }

    public void switchToNewWindow(String urlToSwitchTo){
        Set<String> storedWindows = driver.getWindowHandles();
        for (String storedWindow : storedWindows){
            driver.switchTo().window(storedWindow);
            System.out.println(driver.getCurrentUrl());
            if(driver.getCurrentUrl().equals(urlToSwitchTo)){
                break;
            }
        }
    }

    public void switchToMainWindow(){
        driver.switchTo().window(mainWindow);
    }


}
