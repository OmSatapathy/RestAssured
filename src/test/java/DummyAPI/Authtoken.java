package DummyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authtoken {

	@Test
	public void generateAuthtoken() {

		String payload = "{\r\n"
				+ "    \r\n"
				+ "    \"username\": \"emilys\",\r\n"
				+ "    \"password\": \"emilyspass\",\r\n"
				+ "    \"expiresInMins\": 30,\r\n"
				+ "   \"credentials\": \"include\"\r\n"
				+ "}";

		Response res = RestAssured.given().contentType("application/json").body(payload).when()
				.post("https://dummyjson.com/auth/login").then().extract().response();
		
		System.out.println(res.asPrettyString());
	}

}
