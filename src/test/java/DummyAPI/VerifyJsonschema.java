package DummyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.util.List;
import java.util.Map;

public class VerifyJsonschema {

	@Test
	public void verifyjson() {

		Response res = RestAssured.given().contentType("application.json").when()
				.get("https://billpay-api.gauravkhurana-practice-api.workers.dev/health").then().assertThat()
				.body(matchesJsonSchemaInClasspath("schema.json")).extract().response();

		JsonPath path = res.jsonPath();

		

	}

}
