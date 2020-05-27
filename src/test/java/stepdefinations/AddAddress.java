package stepdefinations;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;
import resources.AddPlacePayLoad;
import utilites.Support;

import static org.hamcrest.Matchers.*;

import groovyjarjarantlr.Utils;

import static io.restassured.RestAssured.*;

public class AddAddress {
	String placeId;

	@Given("^User hit POST API$")
	public void User_hit_POST_API() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").contentType(ContentType.JSON)
				.body(AddPlacePayLoad.addplaceBody()).when().post("/maps/api/place/add/json").then().log().all()
				.assertThat().statusCode(200).log().all().body("status", equalTo("OK")).body("scope", equalTo("APP"))
				.header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		JsonPath js = Support.rawToJson(response);
		placeId = js.getString("place_id");
	}

	@When("^User updated place details with PUT method$")
	public void User_updated_place_details_with_PUT_method() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", placeId).contentType(ContentType.JSON)
				.body(AddPlacePayLoad.updatePlaceBody(placeId, "Bangalore")).when().log().all()
				.put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

	}

	@SuppressWarnings("deprecation")
	@Given("^User send GET request and verify response in API$")
	public void User_hit_GET_API() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().with().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().log().all().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200)
				.extract().response().asString();
		JsonPath js = Support.rawToJson(response);
		String actual = js.getString("address");
		System.out.println(actual);
	}

	@Then("^User delete the place with DELETE method$")
	public void User_delete_the_place_with_DELETE_method() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").body(AddPlacePayLoad.deletePlaceBody(placeId)).when().log()
				.all().delete("/maps/api/place/delete/json").then().log().all().assertThat()
				.body("status", equalTo("OK")).statusCode(200);
	}

}
