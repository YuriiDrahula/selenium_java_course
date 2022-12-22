package com.automation.gtfcourse.lessons.seleniumandtestng.lesson20_pom_design_pattern.input_form_submit_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Constants {

    public static final String FIRST_NAME_INPUT_FIELD_CSS = "input[name='first_name']";
    public static final String LAST_NAME_INPUT_FIELD_CSS = "input[name='last_name']";
    public static final String EMAIL_INPUT_FIELD_CSS = "input[name='email']";
    public static final String PHONE_NUMBER_INPUT_FIELD_CSS = "input[name='phone']";
    public static final String ADDRESS_INPUT_FIELD_CSS = "input[name='address']";
    public static final String CITY_INPUT_FIELD_CSS = "input[name='city']";
    public static final String STATE_DROPDOWN_CSS = "select[name='state']";
    public static final String ZIP_CODE_INPUT_FIELD_CSS = "input[name='zip']";
    public static final String WEBSITE_OR_DOMAIN_INPUT_FIELD_CSS = "input[name='website']";
    public static final String YES_RADIO_BUTTON_CSS = "input[value='yes']";
    public static final String NO_RADIO_BUTTON_CSS = "input[value='no']";
    public static final String PROJECT_DESCRIPTION_INPUT_FIELD_CSS = "textarea[name='comment']";
    public static final String SEND_BUTTON_CSS = "button[type='submit'][class='btn btn-default']";
}
