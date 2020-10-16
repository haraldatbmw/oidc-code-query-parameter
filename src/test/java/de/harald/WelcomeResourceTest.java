package de.harald;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class WelcomeResourceTest {

    @Test
    public void testHelloEndpoint() {
        given().header("X-Requested-With", "XMLHttpRequest")
            .when().get("/hello")
            .then().statusCode(499);
    }

    @Test
    public void testHelloEndpointWithQueryParameterTest() {
        given().header("X-Requested-With", "XMLHttpRequest")
            .when().get("/hello?test=abc")
            .then().statusCode(499);
    }

    @Test
    public void testHelloEndpointWithQueryParameterCode() {
        given().header("X-Requested-With", "XMLHttpRequest")
            .when().get("/hello?code=abc")
            .then().statusCode(499);
    }

}