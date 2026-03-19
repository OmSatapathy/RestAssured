import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall {

	@Test
	public void postApi() {

		Response res = RestAssured.given().accept(ContentType.JSON).when().post("https://api.restful-api.dev/objects")
				.then().extract().response();
		
		
		System.out.println(res.asPrettyString());
	}
	
	


}
