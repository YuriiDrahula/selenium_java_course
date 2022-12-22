package com.automation.gtfcourse.lessons.seleniumandtestng.lesson15_switch_windows;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindows extends Manager {

    @Test
    public void switchWindows(){
        driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");

        // Setting the main window
        String mainWindow = driver.getWindowHandle();

        // Click on the link or button that opens a new page in a new window
        WebElement followOnTwitterButton = driver.findElement(By.cssSelector("a[title='Follow @seleniumeasy on Twitter']"));
        followOnTwitterButton.click();

        // Switching to the new window
        Set<String> storedWindows = driver.getWindowHandles();
        for(String storedWindow : storedWindows){
            driver.switchTo().window(storedWindow);
            System.out.println(driver.getCurrentUrl());
            if(driver.getCurrentUrl().contains("twitter")){
                System.out.println("Finding the twitter url and switching to the window");
                break;
            } else
                System.out.println("Sorry, didn't find the expected value inside this window");
        }

        // Performing user actions on that new page in the new window
        WebElement signUpButton = driver.findElement(By.xpath(".//span[text()='Sign up']"));
        signUpButton.click();

        // Close the window and switch back to the main window
        driver.close();
        driver.switchTo().window(mainWindow);
        followOnTwitterButton.click();
    }
}
