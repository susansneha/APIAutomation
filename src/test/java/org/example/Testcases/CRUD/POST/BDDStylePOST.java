package org.example.Testcases.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOST {
    @Test
    public void testBDDStylePostPositive(){
        //POST-URL,Body-JSon,Header,
        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .body(payload)
                .when().post()
                .then().log().all().statusCode(200);
    }
}
