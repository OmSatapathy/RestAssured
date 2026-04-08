import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITestSuite {

	@Test
	public void getApiTest() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://fake-json-api.mock.beeceptor.com/users").then().extract().response();

		res.asPrettyString();

		JSONArray jsonArray = new JSONArray(res.asString());

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			System.out.println(obj.getString("name"));
		}

	}

	@Test
	public void getCompnayList() {

		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://fake-json-api.mock.beeceptor.com/companies").then().extract().response();

		JSONArray arr = new JSONArray(res.asString());

		for (int i = 0; i < arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			System.out.println(obj.getString("ceoName"));
		}

	}

	@Test
	public void getApiTest1() {

		Response res = RestAssured.given().when().get("https://fake-json-api.mock.beeceptor.com/users");

		JsonPath js = res.jsonPath();

		// Example validations
		String name = js.getString("[0].name");
		System.out.println(name);

		int size = js.getList("$").size();
		System.out.println("Total users: " + size);
	}

	@Test
	public void verifyBlogpost() {

		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://api.restful-api.dev/objects/7").then().extract().response();

		JsonPath obj = res.jsonPath();
		String ob = obj.getString("name");

		System.out.println(ob);
	}

	@Test
	public void verifyBlogpost1() {

		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://api.restful-api.dev/objects").then().extract().response();

		List<String> lst = res.jsonPath().getList("name");

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));

		}

		
		List<Map<String, Object>> list = res.jsonPath().getList("data");

	    for (Map<String, Object> obj : list) {
	        System.out.println(obj);
	    }
	}

}
