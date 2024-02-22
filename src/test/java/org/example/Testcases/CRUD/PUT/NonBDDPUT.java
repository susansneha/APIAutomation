package org.example.Testcases.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPUT {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token="f0541b87987422a";
    @Test
    public void testPUTRequest(){
        //id-3238
        //token-
        //heade-json
        //payload-

        String payload="{\n" +
                "    \"firstname\" : \"Sneha\",\n" +
                "    \"lastname\" : \"Sabu\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/3103");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("Token",token);
        requestSpecification.body(payload).log().all();

        //calling put method.=>Response
        Response response=requestSpecification.when().put();

        //validate
        validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("first name", Matchers.equalTo("Sneha"));
        validatableResponse.body("last name", Matchers.equalTo("Sabu"));


    }
}
