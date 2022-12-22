package com.automation.gtfcourse.lessons.seleniumandtestng.lesson06_selenium_locators;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class B_LocateWithXPath extends Manager {

    private void detailedOverviewOfXPath(){

        //Absolute XPath
        driver.findElement(By.xpath("/html/body/div/div/div/div/a/img"));

        //Relative XPath
        /* General XPath formula - important to know
        <a id="btn_basic_example" class="btn btn-success btn-outline-rounded green"> Start Practising
        <span style="margin-left:10px;" class="glyphicon glyphicon-send"></span></a>  */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//a[@id='btn_basic_example']"));

        /* We can use wildcards for the tagName or AttributeName, we are searching for
        We can implement the wildcard with asterisks "*"
        <a id="btn_basic_example" class="btn btn-success btn-outline-rounded green"> Start Practising
        <span style="margin-left:10px;" class="glyphicon glyphicon-send"></span></a>*/
        driver.findElement(By.xpath(".//*[@*='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//*[@*='btn_basic_example']"));

        // We can add functions to XPath to help our search

        /* Starts-with(): looks for the string that's at the beginning (only) within a certain elements attribute
        <div id="name-and-slogan"></div>*/
        driver.findElement(By.xpath(".//tagName[starts-with(@attributeName, 'startingValueOfTheAttribute')]"));
        driver.findElement(By.xpath(".//div[starts-with(@id, 'name')]"));

        /* Contains(): looks for a string that's anywhere within the certain elements attributes
        <div id="name-and-slogan"></div>*/
        driver.findElement(By.xpath(".//tagName[contains(@attributeName, 'partialValueOfTheAttribute')]"));
        driver.findElement(By.xpath(".//div[contains(@id, '-and-')]"));

        /* Text(): works the same way as linkText locator,
        but linkText was only available for anchor tags
        With the text function we can locate elements via XPath visible text matches in any tag
        <a href="/">Demo Home</a>
        <div id="site-slogan" class="site-slogan">Complete Automation Testing Tutorials</div>
        */
        driver.findElement(By.xpath(".//tagName[text()='visibleTextToSearchFor]"));
        driver.findElement(By.xpath(".//a[text()=\"Demo Home\"]"));
        driver.findElement(By.xpath(".//div[text()='Complete Automation Testing Tutorials']"));

        /* Search with conditions AND or OR
        Searching with "and" expects both conditions to be true
        Searching with "or" expects one condition to be true
        <input name="city" placeholder="city" class="form-control" type="text" data-bv-field="city">
        */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute' and @attributeName='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//input[@class='form-control' and @name='city']"));

        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute' or @attributeName='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//input[@class='form-control' or @name='city']"));

        /* Searching fo the child of the element
        We can implement this by adding a slash "#" at the and of the query and the tagName of the child
        Or the wildcard "*" if it's the only one, otherwise it will select all of the child's
        <div id="site-name" class="site-name"><a href="/" title="Home" rel="home">Selenium Easy</a></div>
        <a href="/" title="Home" rel="home">Selenium Easy</a>
        */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute']/childTagName"));
        driver.findElement(By.xpath(".//div[@id='site-name']/a"));
        driver.findElement(By.xpath(".//div[@id='site-name']/*"));

        /* Searching fo the parent element using the child of the element;
        We can implement this by adding a slash and two dots at the and of the query
        <div id="site-name" class="site-name"><a href="/" title="Home" rel="home">Selenium Easy</a></div>
        <a href="/" title="Home" rel="home">Selenium Easy</a>
        */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//a[@rel='home']/.."));
    }

    @Test
    public void findingElement(){
        driver.get("https://demo.seleniumeasy.com/");
        driver.findElement(By.xpath(".//a[@id='btn_basic_example']"));
        driver.findElement(By.xpath(".//div[starts-with(@id, 'name')]"));
        driver.findElement(By.xpath(".//div[contains(@id, '-and-')]"));
        driver.findElement(By.xpath(".//div[text()='Complete Automation Testing Tutorials']"));

        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath(".//input[@class='form-control' and @name='city']"));
        driver.findElement(By.xpath(".//input[@class='form-control' or @name='city']"));

        driver.get("https://demo.seleniumeasy.com/");
        driver.findElement(By.xpath(".//div[@id='site-name']/a"));
        driver.findElement(By.xpath(".//div[@id='site-name']/*"));
        driver.findElement(By.xpath(".//a[@rel='home']/.."));
        driver.quit();
    }
}
