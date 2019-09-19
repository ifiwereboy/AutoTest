package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本在注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的");
    }
    @BeforeSuite//在类运行之前
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite//在类运行之后
    public void afterSuite(){
        System.out.println("afterSuite");

    }

}
