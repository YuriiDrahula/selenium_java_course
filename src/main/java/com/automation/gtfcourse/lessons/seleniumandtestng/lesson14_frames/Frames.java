package com.automation.gtfcourse.lessons.seleniumandtestng.lesson14_frames;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class Frames extends Manager {

    @Test
    public void singleFrame(){
        driver.get("http://the-internet.herokuapp.com/iframe");

        // Switch to frame with index(tab index)
        driver.switchTo().frame(0);

        // Switch to frame with ID
        // driver.switchTo().frame("mce_0_ifr");

        WebElement exampleTextArea = driver.findElement(By.cssSelector("body[id='tinymce']"));
        exampleTextArea.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.DELETE));
        exampleTextArea.sendKeys("My test text");
    }

    @Test
    public void nestedFrames(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleText = driver.findElement(By.cssSelector("div[id='content']"));
        System.out.println(middleText.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        WebElement rightText = driver.findElement(By.cssSelector("body"));
        System.out.println(rightText.getText());
    }
}
