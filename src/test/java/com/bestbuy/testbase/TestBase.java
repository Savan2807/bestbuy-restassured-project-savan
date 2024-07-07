package com.bestbuy.testbase;

import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by Savan Kakadiya
 */
public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;

    }
}
