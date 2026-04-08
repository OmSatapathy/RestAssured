package DummyAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ProductList {
	@Test
	public void getProductList() {

		Response res = RestAssured.given().contentType("application/json").when().get("https://dummyjson.com/products")
				.then().extract().response();

		// System.out.println(res.asPrettyString());

		JsonPath path = res.jsonPath();

		String value = path.getString("products.title");

		System.out.println(value);

		List<Map<String, Object>> lst = res.jsonPath().getList("products.dimensions");

		for (Map<String, Object> obj : lst) {
			System.out.println(obj);
		}
	}

	@Test
	public void getProductTags() {
		Response resp = RestAssured.given().contentType("application/json").when().get("https://dummyjson.com/posts")
				.then().extract().response();

		System.out.println(resp.asPrettyString());

		List<Map<String, Object>> lst = resp.jsonPath().getList("posts.reactions");

		for (Map<String, Object> mp : lst) {
			// System.out.println(mp);
		}

	}

	@Test
	public void fetchHistory() {

		Response res = RestAssured.given().contentType("application/json").when().get("https://dummyjson.com/posts")
				.then().extract().response();
		
		Cookies allCookies = res.getDetailedCookies();

		for (Cookie c : allCookies) {
		    System.out.println(c.getName() + " = " + c.getValue());
		}

		List<List<String>> lst = res.jsonPath().getList("posts.tags");
		for (List<String> mp : lst) {
			System.out.println(mp);
		}
	}

}
