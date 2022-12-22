package com.automation.gtfcourse.lessons.seleniumandtestng.lesson17_list_of_elements;

import com.automation.gtfcourse.lessons.seleniumandtestng.lesson05_manager.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements extends Manager {

    int loopNumber = 1;

    @Test
    public void handleListOfElements() throws NoSuchFieldException {
        driver.get("https://demo.seleniumeasy.com/");
        closePossibleAd();
        clickOnTreeMenuElement("Date pickers");
        clickOnTreeMenuElement("Input Forms");
        clickOnTreeMenuElement("others");
    }

    private void clickOnTreeMenuElement(String innerTextOfTreeMenuElement) throws NoSuchFieldException {
        List<WebElement> treeMenu = driver.findElements(By.cssSelector("li[class='tree-branch'][style='display: list-item;']"));
        for(WebElement treeMenuElement : treeMenu){
            if(treeMenuElement.getText().equals(innerTextOfTreeMenuElement)){
                System.out.println("Found the element with the inner text");
                treeMenuElement.click();
                System.out.println("Clicked " + innerTextOfTreeMenuElement);
                break;
            } else {
                if(loopNumber == treeMenu.size()){
                    throw new NoSuchFieldException("Sorry, no element inside this list has the inner text you are searching for " + innerTextOfTreeMenuElement);}
            }

            loopNumber++;
        }
    }
}
