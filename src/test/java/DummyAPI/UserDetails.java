package DummyAPI;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserDetails {

	@Test
	public void getUser() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://jsonplaceholder.typicode.com/users").then().extract().response();

		Map<String, String> cookies = res.getCookies();

		System.out.println(cookies);

	}

}
