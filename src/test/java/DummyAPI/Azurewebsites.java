package DummyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import pojo.azurePojo;

public class Azurewebsites {

	@Test
	public void getWebsiteList() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().statusCode(200).extract()
				.response();

		ObjectMapper obj=(ObjectMapper) new com.fasterxml.jackson.databind.ObjectMapper();
			
		//azurePojo empobj=((com.fasterxml.jackson.databind.ObjectMapper) obj).readValue(res,azurePojo.class);
	}
}
