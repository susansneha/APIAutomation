package org.example.TestNG;

import org.testng.annotations.*;

public class Test001 {
    @BeforeSuite
    void demo0(){
        System.out.println("Before Suit");
    }
    @BeforeClass
    void demo1(){
        System.out.println("Before class");
    }
    @BeforeMethod
    void demo2(){
        System.out.println("Before method");
    }
    @Test
    void demo3(){
        System.out.println("Test1");
    }
    @Test
    void demo33(){
        System.out.println("Test2");
    }
    @AfterMethod
    void demo4(){
        System.out.println("After method");
    }
}
