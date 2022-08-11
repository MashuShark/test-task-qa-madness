package StarshipAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class StarshipAPITest {

    final String BASE_URL = "https://swapi.dev/api/";
    final String STARSHIPS_URL = "starships";
    final String PATHPARAM = "/{id}";


    @Test(dataProvider = "generateShipIDAndExpectedName")
    public void getRequest(String ship_id, String expectedName) {

        ValidatableResponse response = RestAssured.given()
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .pathParam("id", ship_id)
                .when()
                .get(BASE_URL + STARSHIPS_URL + PATHPARAM)
                .then()
                .body("name", containsString(expectedName));
    }

    @DataProvider(name = "generateShipIDAndExpectedName")
    public static Object[][] generateShipIDAndExpectedName() {
        List<Object[]> testData = new ArrayList<>();
        testData.add(new Object[]{"9", "Death Star"});
        return testData.toArray(new Object[][]{});
    }
}