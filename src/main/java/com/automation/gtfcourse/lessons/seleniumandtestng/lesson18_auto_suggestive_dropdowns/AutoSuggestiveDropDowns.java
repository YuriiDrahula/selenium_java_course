package com.automation.gtfcourse.lessons.seleniumandtestng.lesson18_auto_suggestive_dropdowns;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestiveDropDowns extends Manager {

    private String highlightedValue;
    private String previousValue;

    @Test
    public void exampleDropDown(){
        driver.get("https://alphagov.github.io/accessible-autocomplete/examples/");
        selectFromExampleDropDown("Tu", "Turkey");
        selectFromExampleDropDown("a", "Country does not exist");
        selectFromExampleDropDown("U", "Ukraine");
    }

    private void selectFromExampleDropDown(String textSendToDropDown, String expectedValueInTheList){
        WebElement inputCountryDropDown = driver.findElement(By.cssSelector("input[name='input-autocomplete'][id='autocomplete-default']"));

        //inputCountryDropDown.clear(); if it's failing use the while loop with code below
        while (!inputCountryDropDown.getAttribute("value").isEmpty()){
            inputCountryDropDown.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        }

        inputCountryDropDown.sendKeys(textSendToDropDown);
        inputCountryDropDown.sendKeys(Keys.DOWN);

        WebElement highlightedWebElement = driver.findElement(By.cssSelector("ul[id='autocomplete-default__listbox'] li[aria-selected='true']"));
        highlightedValue = highlightedWebElement.getText();

        while (!highlightedValue.equals(expectedValueInTheList)){
            previousValue = highlightedValue;
            highlightedWebElement.sendKeys(Keys.DOWN);
            highlightedWebElement = driver.findElement(By.cssSelector("ul[id='autocomplete-default__listbox'] li[aria-selected='true']"));
            highlightedValue = highlightedWebElement.getText();
            if(highlightedValue.equals(expectedValueInTheList)) {
                highlightedWebElement.sendKeys(Keys.ENTER);
                break;
            }
            if(previousValue.equals(highlightedValue)){
                Assert.fail("There is not country " + expectedValueInTheList + "inside the dropdown list");
            }
        }
    }

}
