package com.automation.gtfcourse.lessons.seleniumandtestng.lesson04_testng_basic_annotations;

import org.testng.annotations.*;

public class C_MoreAnnotations {


    @Test
    public void testCase01(){
        System.out.println("I'm running testCase01");
    }

    @Test
    public void testCase02(){
        System.out.println("I'm running testCase02");
    }

    @Test
    public void testCase03(){
        System.out.println("I'm running testCase03");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I will run only once before the first @Test method - @BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I will run only once after the last @Test method - @AfterTest");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I will run every time before the @Test method - @BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I will run every time after the @Test method - @AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I will run only once before our @Test methods in the current class - @BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I will ruin only once after our @Test methods in the current class - @AfterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I will run only once before all the test methods in our whole suite - @BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I will ruin only once after all the test methods in our whole suite - @BeforeSuite");
    }
}
