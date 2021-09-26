package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static common.CommonConstants.EMPTY;
import static common.UrlHelper.BASE_URL;
import static io.restassured.RestAssured.given;

public class AuthenticationApi {

    private static String token = "";
    private static String USERNAME = "admin";
    private static String PASSWORD = "password123";

    public static String getToken(String username, String password) {
        if (EMPTY.equals(token)) {
            token =
                    given()
                            .contentType(ContentType.JSON)
                            .param("username", USERNAME)
                            .param("password", PASSWORD)
                            .when()
                            .post(BASE_URL)
                            .then()
                            .extract()
                            .jsonPath()
                            .get("token");
        }
        return token;
    }

    public RequestSpecification authenticatedRequest() {
        return given()
                .headers(
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON,
                        "Accept-Language", "pl");
    }
}
