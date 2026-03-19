import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest {

	
	@Test
	public void createproduct() {

		String payload = "{\r\n" + "  \"name\": \"Apple MacBook Pro 16\",\r\n" + "  \"data\": {\r\n"
				+ "    \"year\": 2019,\r\n" + "    \"price\": 1849.99,\r\n"
				+ "    \"CPU model\": \"Intel Core i9\",\r\n" + "    \"Hard disk size\": \"1 TB\"\r\n" + "  }\r\n"
				+ "}";

		Response resp = RestAssured.given().contentType("application/json").body(payload).when()
				.post("https://api.restful-api.dev/objects").then().extract().response();
		
		resp.asPrettyString();
		
		System.out.println(resp.asPrettyString());
		
		
	JsonPath path =	resp.jsonPath();
	String year = path.getString("data.year");
	
	System.out.println(year);
		

	}

}
