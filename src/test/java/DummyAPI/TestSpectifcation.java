package DummyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestSpectifcation extends SpecificationBuilder {

	@Test
	public void getUserDetails() {

		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("https://jsonplaceholder.typicode.com/");
		builder.setContentType(ContentType.JSON);

		RequestSpecification requestSpec = builder.build();

		ResponseSpecBuilder builders = new ResponseSpecBuilder();
		builders.expectStatusCode(200);
		builders.expectContentType(ContentType.JSON);

		ResponseSpecification resp = builders.build();

		Response resps = RestAssured.given().spec(requestSpec).when().get("/users").then().spec(resp).extract()
				.response();

		
		System.out.println(resps.asPrettyString());
	}

}
