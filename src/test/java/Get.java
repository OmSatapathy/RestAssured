import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.equalTo;

public class Get {

//	@Test
	public void getAPI() {

		RestAssured.get("https://www.my-api.com/resource/123").then().assertThat().statusCode(200).and()
				.contentType(ContentType.JSON).and().body("id", equalTo(123));
	}

	@Test
	public void getItems() {

		RestAssured.given().accept(ContentType.JSON).when().get("https://api.restful-api.dev/objects").then().log()
				.all();
	}

	@Test
	public void singleItem() {

		Response res = RestAssured.given().accept(ContentType.JSON).when().get("https://api.restful-api.dev/objects/7")
				.andReturn();
		
		System.out.println(res.asPrettyString());
	}

	
	
}
