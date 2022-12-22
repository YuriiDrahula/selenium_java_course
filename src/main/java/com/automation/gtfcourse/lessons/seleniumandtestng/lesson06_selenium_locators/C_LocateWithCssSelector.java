package com.automation.gtfcourse.lessons.seleniumandtestng.lesson06_selenium_locators;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C_LocateWithCssSelector extends Manager {

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
        driver.get("https://demo.seleniumeasy.com/");
        driver.findElement(By.cssSelector("#btn_basic_example"));
        driver.findElement(By.cssSelector(".btn.btn-success.btn-outline-rounded.green"));
        driver.findElement(By.cssSelector(".btn.btn-success.btn-outline-rounded.green#btn_basic_example"));
        driver.findElement(By.cssSelector("#btn_basic_example.btn.btn-success.btn-outline-rounded.green"));
        driver.findElement(By.cssSelector("a[id='btn_basic_example']"));
        driver.findElement(By.cssSelector("a[class='btn btn-success btn-outline-rounded green']"));

        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.cssSelector("input[name='email'][class='form-control']"));
        driver.findElement(By.cssSelector("div[class='input-group'] input[name='email']"));
        driver.findElement(By.cssSelector("input[placeholder^='E-M']"));
        driver.findElement(By.cssSelector("input[placeholder$=' Address']"));
        driver.findElement(By.cssSelector("input[placeholder*='e or d']"));

        driver.get("https://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html");
        driver.findElements(By.cssSelector("ul[class='list-group']  :nth-child(3)"));
        driver.findElements(By.cssSelector(".list-group :nth-child(3)"));
    }
}
