package api;

import dto.BookingId;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static common.CommonConstants.EMPTY;
import static common.UrlHelper.AUTH;
import static common.UrlHelper.BASE_URL;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class AuthenticationApi {



    private static String token = "";
    private static String USERNAME = "admin";
    private static String PASSWORD = "password123";

    public static String getToken() {
        if (EMPTY.equals(token)) {
            token = given()
                            .contentType(ContentType.URLENC + ";  charset=utf-8")
                            .param("username", USERNAME)
                            .param("password", PASSWORD)
                            .when()
                            .post(AUTH)
                            .then()
                            .extract()
                            .path("token");
        }
        return token;
    }

    public RequestSpecification authenticatedRequest() {
        return given()
                .headers(
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON);
    }
}
