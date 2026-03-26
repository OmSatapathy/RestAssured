package DummyAPI;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class SpecificationBuilder {

	
	@BeforeClass
	public void requiredSpecification() {

		RequestSpecBuilder reqSec = new RequestSpecBuilder();
		reqSec.setContentType("application/json");
		reqSec.setBaseUri("https://jsonplaceholder.typicode.com").build();

		ResponseSpecBuilder resSpec = new ResponseSpecBuilder();
		resSpec.expectContentType("appliaction/json");
		resSpec.expectStatusCode(200).build();

	}
	
	

}
