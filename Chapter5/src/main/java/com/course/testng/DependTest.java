package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 Run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})//被依赖方法如果执行失败了，依赖的方法将会被忽略



    public void test2(){
        System.out.println("test2 Run");
    }
}
