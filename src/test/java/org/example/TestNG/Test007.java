package org.example.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test007 {
    //Data Driven Testing
@DataProvider
    public Object[][] getData(){
      return new Object[][]{
              new Object[]{ "admin", "admin"},
              new Object[]{"admin","password"}
        };
    }
    @Test(dataProvider = "getData")
    public void loginTest(String username,String password){
        System.out.println(username);
        System.out.println("admin");
    }
}
