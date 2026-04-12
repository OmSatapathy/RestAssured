package DummyAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Verifyproduct {

	RequestSpecification req = new RequestSpecBuilder().addHeader("Content-Type", "application/json")
			.setBaseUri("https://dummyjson.com/").build();

	ResponseSpecification resp = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
			.build();

	@Test
	public void verifyproduct() {

		Response res = RestAssured.given().spec(req).when().get("product").then().spec(resp).extract().response();

		List<Object> value = res.jsonPath().getList("products.tags");

		for (Object s : value) {
			//System.out.println(s);
		}

		List<List<Map<String, Object>>> lst = res.jsonPath().getList("products.reviews");
		
		List<Map<String, Object>> allReviews = lst.stream()
		        .flatMap(List::stream)
		        .collect(Collectors.toList());

		for (Map<String, Object> review : allReviews) {
		    System.out.println(review.get("rating"));
		    System.out.println(review.get("reviewerName"));
		    System.out.println(review.get("reviewerEmail"));
		    System.out.println(review.get("comment"));
		}
	}

}
