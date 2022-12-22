package com.automation.gtfcourse.lessons.seleniumandtestng.lesson21_enums_for_dropdowns;

public enum StateEnum {

    ALABAMA("Alabma", "Alabama", 1),
    ALASKA("Alaska", "Alaska", 2),
    ARIZONA("Arizona", "Arizona", 3),
    ARKANSAS("Arkansas", "Arkansas", 4),
    CALIFORNIA("California", "California", 5);

    public String byVisibleText;
    public String byValue;
    public int byIndex;

    StateEnum(String byVisibleText, String byValue, int byIndex) {
        this.byVisibleText = byVisibleText;
        this.byValue = byValue;
        this.byIndex = byIndex;
    }

    public String getByVisibleText() {
        return byVisibleText;
    }

    public String getByValue() {
        return byValue;
    }

    public int getByIndex() {
        return byIndex;
    }
}
