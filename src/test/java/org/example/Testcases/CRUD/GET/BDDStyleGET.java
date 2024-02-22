package org.example.Testcases.CRUD.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/560037").when().get().then().statusCode(200);

    }
}
