package com.automation.gtfcourse.framework.seleniumeasy.automation.homepage;

public class Constants {

    //Body menu buttons
    public static final String WELCOME_BUTTON_CSS = "a[id='home_bar'] span";
    public static final String BASIC_BUTTON_CSS = "a[id='basic_example'] span";
    public static final String INTERMEDIATE_BUTTON_CSS = "a[id='inter_example'] span";
    public static final String ADVANCED_BUTTON_CSS = "a[id='advanced_example'] span";
    public static final String COMPLETED_BUTTON_CSS = "a[id='done_example'] span";

    //Buttons of the menu inside the Basic button
    public static final String SIMPLE_FORM_DEMO_BUTTON_BODY_CSS = "div[id='basic'] a[href='./basic-first-form-demo.html']";
    public static final String CHECK_BOX_DEMO_BUTTON_BODY_CSS = "div[id='basic'] a[href='./basic-checkbox-demo.html']";

    //Buttons of the menu inside the Intermediate button
    public static final String DATA_LIST_FILTER_BUTTON_BODY_CSS = "div[id='intermediate'] a[href='./data-list-filter-demo.html']";
    public static final String INPUT_FORM_WITH_VALIDATIONS_BUTTON_BODY_CSS = "div[id='intermediate'] a[href='./input-form-demo.html']";

    //Buttons of the menu inside the Advanced button
    public static final String CHARTS_DEMO_BUTTON_BODY_CSS = "div[id='advanced'] a[href='./charts-mouse-hover-demo.html']";

}
