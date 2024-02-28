package org.example.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test003 {
    //PUT
    String token;
    Integer bookingID;

    public String getToken(){
        token="123";
        return token;
    }
    @BeforeTest
    public void getTokeAndBookingID(){
       token= getToken();
       bookingID=123;
    }

    @Test
    public void testPUTReq(){
        System.out.println(token);
        System.out.println(bookingID);
    }
}
