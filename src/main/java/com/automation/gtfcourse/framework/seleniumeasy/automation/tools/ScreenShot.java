package com.automation.gtfcourse.framework.seleniumeasy.automation.tools;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public WebDriver driver;

    public ScreenShot(WebDriver driver){
        this.driver = driver;
    }

    public void takeAndSave(String screenShotName){
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShotFile, new File("src\\test\\java\\com\\automatiom\\gtfcourse\\framework\\seleniumeasy\\screenshots\\" +
                    screenShotName + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
