package com.automation.gtfcourse.lessons.seleniumandtestng.lesson06_selenium_locators;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class A_OverviewOfLocators extends Manager {

    private void overviewOfSeleniumLocators(){
        /* Using the locator ID
        <div id="site-name" class="site-name"><a href="/" title="Home" rel="home">Selenium Easy</a></div> */
        driver.findElement(By.id("Enter the value of the ID attribute to search in here."));
        driver.findElement(By.id("site-name"));

        /* Using the locator NAME
        <input name="city" placeholder="city" class="form-control" type="text" data-bv-field="city">*/
        driver.findElement(By.name("Enter the value of the NAME to search for in here"));
        driver.findElement(By.name("city"));

        /* Using the locator CLASSNAME
        <input name="city" placeholder="city" class="form-control" type="text" data-bv-field="city">*/
        driver.findElement(By.className("Enter the value of the CLASS to search for in here"));
        driver.findElement(By.className("form-control"));

        /* Using the locator LINKTEXT
        can only be used for anchor tags <a> </a>
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Input Forms<b class="caret"></b></a>
        */
        driver.findElement(By.linkText("Enter the value of the visible text of the ANCHOR TAG (linkText) here"));
        driver.findElement(By.linkText("Input Forms"));

        /* Using the locator PARTIAL LINKTEXT
        can only be used for anchor tags <a> </a>
        <a href="#">Progress Bars & Sliders</a>
        */
        driver.findElement(By.partialLinkText("Enter the partial value of the visible text of the ANCHOR TAG (linkTEext) here"));
        driver.findElement(By.partialLinkText("& Sliders"));

        /* Using the locator TAG NAME
        used to search for the specific tag and the ammount of those TAGs in the DOM
        used with findElements method
        */
        driver.findElements(By.tagName("Enter the value of the TAG you want to search for"));
        driver.findElements(By.tagName("a"));

    }

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

        /* Starts-with(): looks for teh string that's at the beginning (only) within a certain elements attribute
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

        /* Searching for the child of the element
        We can implement this by adding a slash "#" at the and of the query and the tagName of the child
        Or the wildcard "*" if it's the only one, otherwise it will select all of the child's
        <div id="site-name" class="site-name"><a href="/" title="Home" rel="home">Selenium Easy</a></div>
        <a href="/" title="Home" rel="home">Selenium Easy</a>
        */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute']/childTagName"));
        driver.findElement(By.xpath(".//div[@id='site-name']/a"));
        driver.findElement(By.xpath(".//div[@id='site-name']/*"));

        /* Searching for the parent element using the child of the element;
        We can implement this by adding a slash and two dots at the and of the query
        <div id="site-name" class="site-name"><a href="/" title="Home" rel="home">Selenium Easy</a></div>
        <a href="/" title="Home" rel="home">Selenium Easy</a>
        */
        driver.findElement(By.xpath(".//tagName[@attributeName='valueOfTheAttribute']"));
        driver.findElement(By.xpath(".//a[@rel='home']/.."));
    }

    private void detailedOverviewOfCssSelectors(){

        /* Just searching for the ID
        We can implement this by placing a hash "#" in front of the value of the ID attribute we want to search for
        <a id="btn_basic_example" class="btn btn-success btn-outline-rounded green"> Start Practising
        <span style="margin-left:10px;" class="glyphicon glyphicon-send"></span></a>  */
        driver.findElement(By.cssSelector("#valueOfTheIDAttribute"));
        driver.findElement(By.cssSelector("#btn_basic_example"));

        /* Just searching for the CLASS NAME
        We can implement this by a dot "." in front of the value of the Class attribute we want to search for
        We also have to replace all the spaces in the value with dots "."
        <a id="btn_basic_example" class="btn btn-success btn-outline-rounded green"> Start Practising
        <span style="margin-left:10px;" class="glyphicon glyphicon-send"></span></a> */
        driver.findElement(By.cssSelector(".valueOfTheClassAttribute"));
        driver.findElement(By.cssSelector(".btn.btn-success.btn-outline-rounded.green"));

        /* Combination of searching the just ID and CLASS NAME
        In the example below we are combining two examples above
        */
        driver.findElement(By.cssSelector(".btn.btn-success.btn-outline-rounded.green#btn_basic_example"));
        driver.findElement(By.cssSelector("#btn_basic_example.btn.btn-success.btn-outline-rounded.green"));

        /* Regular expression for CSS - really important to know
        Search anywhere in the document for any attribute - just like relative XPath
        We also DON'T have to replace all the spaces in the classAttributeValue with dots "." using this formula
        <a id="btn_basic_example" class="btn btn-success btn-outline-rounded green"> Start Practising
        <span style="margin-left:10px;" class="glyphicon glyphicon-send"></span></a>*/
        driver.findElement(By.cssSelector("tagName[attribute='attributeValue']"));
        driver.findElement(By.cssSelector("a[id='btn_basic_example']"));
        driver.findElement(By.cssSelector("a[class='btn btn-success btn-outline-rounded green']"));

        /* Searching for the multiply attributes in the same tag
        <input name="email" placeholder="E-Mail Address" class="form-control" type="text" data-bv-field="email"> */
        driver.findElement(By.cssSelector("tagName[attribute='attributeValue'][attribute='attributeValue']"));
        driver.findElement(By.cssSelector("input[name='email'][class='form-control']"));

        /* Searching for the multiply attributes in parent and child tags
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <input name="email" placeholder="E-Mail Address" class="form-control" type="text" data-bv-field="email">
        </div> */
        driver.findElement(By.cssSelector("tagName[attribute='attributeValue'] tagName[attribute='attributeValue']"));
        driver.findElement(By.cssSelector("div[class='input-group'] input[name='email']"));

        // We can add functions to our css locator to help our search

        /* Starts with - looks for the string that's at the beginning (only) within a certain elements attribute
        We can implement it with the caret sign "^"
        <input name="email" placeholder="E-Mail Address" class="form-control" type="text" data-bv-field="email"> */
        driver.findElement(By.cssSelector("tagName[attribute^='startingValueOfTheAttribute']"));
        driver.findElement(By.cssSelector("input[placeholder^='E-M']"));

        /* Ends with - looks for the string that's at the end (only) within a certain elements attribute
        We can implement it with the dollar sign "$"
        <input name="email" placeholder="E-Mail Address" class="form-control" type="text" data-bv-field="email"> */
        driver.findElement(By.cssSelector("tagName[attribute$='endingValueOfTheAttribute']"));
        driver.findElement(By.cssSelector("input[placeholder$=' Address']"));

        /* Contains - looks for a string that's anywhere within the certain elements attributes
        We can implement this with the asterisk sign "*"
        <input name="website" placeholder="Website or domain name" class="form-control" type="text"> */
        driver.findElement(By.cssSelector("tagName[attribute*='partialValueOfTheAttribute']"));
        driver.findElement(By.cssSelector("input[placeholder*='e or d']"));

        /* Searching for the child of the element
        We can implement this by putting the slash at the end AND add :nth-child(x) to the css
        With the X being the child number of the parent tag we want to search for
         <ul class="list-group">
                <li class="list-group-item">bootstrap-duallist </li>
                <li class="list-group-item">Dapibus ac facilisis in</li>
                <li class="list-group-item">Morbi leo risus</li>
                <li class="list-group-item">Porta ac consectetur ac</li>
                <li class="list-group-item">Vestibulum at eros</li>
          </ul> */
        driver.findElements(By.cssSelector("tagName[attribute='attributeValue'] :nth-child(x)"));
        driver.findElements(By.cssSelector("ul[class='list-group']  :nth-child(3)"));
        driver.findElements(By.cssSelector(".list-group :nth-child(3)"));
    }

    @Test
    public void findingElements(){
        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.id("site-name"));
        System.out.println("The element sitename was found");
        driver.findElement(By.name("city"));
        System.out.println("The element city was found");
        driver.findElement(By.className("form-control"));
        System.out.println("The element first name was found");
        driver.findElement(By.linkText("Input Forms"));
        System.out.println("The element input forms was found");
        driver.findElement(By.partialLinkText("& Sliders"));
        System.out.println("The element Progress Bars & Sliders was found");
        List<WebElement> listForAnchorTagsElements = driver.findElements(By.tagName("a"));
        System.out.println("The size of the list with anchor tags is " + listForAnchorTagsElements.size());
    }
}
