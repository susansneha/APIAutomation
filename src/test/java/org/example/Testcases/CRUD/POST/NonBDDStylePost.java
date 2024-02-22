package org.example.Testcases.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDStylePost {
    @Test
    public void testNonBDDStylePostPositive(){
        //Prepration of the request
        RequestSpecification r= RestAssured.given();

        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        //Making Request
        Response response=r.when().post();

        //Validation part
        ValidatableResponse validatableResponse=response.then();
        String responseString= response.asString();
        System.out.println(responseString);

        validatableResponse.statusCode(200);

       // r.then().statusCode(200);




    }
}
