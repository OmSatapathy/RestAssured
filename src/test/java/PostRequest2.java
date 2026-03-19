import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.InnerData;
import pojo.Outerdata;

public class PostRequest2 {

	@Test
	public void createproduct() {

		InnerData dp = new InnerData(2023, 150000, "Mac OS seias", "Mac");
		Outerdata ds = new Outerdata("Lenevo 5i", dp);

		Response resp = RestAssured.given().contentType("application/json").body(ds).when()
				.post("https://api.restful-api.dev/objects").then().extract().response();

		resp.asPrettyString();

		System.out.println(resp.asPrettyString());

		JsonPath path = resp.jsonPath();
		String year = path.getString("data.year");

		System.out.println(year);

	}

}
