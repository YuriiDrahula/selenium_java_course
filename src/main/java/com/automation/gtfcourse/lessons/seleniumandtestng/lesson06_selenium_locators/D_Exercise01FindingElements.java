package com.automation.gtfcourse.lessons.seleniumandtestng.lesson06_selenium_locators;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class D_Exercise01FindingElements extends Manager {

    @Test
    public void exercise01FindingElements(){
        driver.get("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html");

        driver.findElement(By.cssSelector("#save.btn.btn-default"));
        driver.findElement(By.xpath(".//p[text()='Loading icon will be displayed until the request is processed']"));
        driver.findElement(By.linkText("Selenium Tutorials"));
        driver.findElement(By.partialLinkText(" Selenium Tutorials"));

        driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
        driver.findElement(By.cssSelector("div[id='todrag'] :nth-child(4)"));
        driver.findElement(By.xpath(".//div[@id='todrag']/span[2]"));
        driver.findElement(By.xpath(".//div[@class='w25 moveleft']/../.."));

        driver.get("https://demo.seleniumeasy.com/charts-mouse-hover-demo.html");
        driver.findElement(By.cssSelector("div[class='change text-center'] i[class='fa fa-plus']"));

        driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
        driver.findElement(By.cssSelector("table[id='example'] :nth-child(7) :nth-child(3)"));
        driver.findElement(By.cssSelector("table[id='example'] tbody>:nth-child(5)>:nth-child(3)")); //also can use such syntax
    }
}
