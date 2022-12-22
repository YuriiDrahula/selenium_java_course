package com.automation.gtfcourse.lessons.seleniumandtestng.lesson04_testng_basic_annotations;

import org.testng.annotations.Test;

public class A_TestAnnotation {

    /*
    public static void main(String[] args) {
        testCase01();
        testCase02();
        testCase03();
    }
    */

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
}
