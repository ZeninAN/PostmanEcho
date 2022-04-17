import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class TestApi {
    @Test
    void shouldReturnDemoAccounts() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("value"));
    }
}
