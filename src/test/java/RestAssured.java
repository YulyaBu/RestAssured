import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;


public class RestAssured {

    @Test
    public void restAssured() {
        Response response = RestAssured
                .get("http://regres.in/api/users?page=2")
                .andReturn();
        response.prettyPrint();
    }

    @Test
    public void getListUsersWithParam() {
        ValidatableResponse response = RestAssured
                .given()
                .queryParam("page", "2")
                .when()
                .get("http://regres.in/api/users")
                .then()
                .statusCode(200);

    }


}
