package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StepDefinitionCR {
	
	public  Response response ;
	
	
	@Given("Set EndPoint or URI for the server")
	public void set_end_point_or_uri_for_the_server() {
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/change_request";
	}

	@Given("Setup Authentication")
	public void setup_authentication() {
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
	}

	@When("Place the POST Reqest for ChangeRequest")
	public void place_the_post_reqest_for_change_request() {
		response = RestAssured
		.given()
		.log().all()
		.body("{\"short_description\": \"Created on 0820 File\",\"active\": \"true\"}")
		.contentType(ContentType.JSON)
		.post();
	}

	@Then("Verify the Statu Code")
	public void verify_the_statu_code() {
	   response.then()
		.assertThat()
		.statusCode(201);
	}

	@Then("Print the Response Body")
	public void print_the_response_body() {
		response.prettyPrint();
	}

}
