package incidentInvidual;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LearningBodyAssertion extends BaseClass{
	
	@Test
	public void bodyAssertion() {
		
		Response post = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.post()
		.then()
		.body("result.upon_reject", Matchers.equalTo("cancel"))
		.extract()
		.response();
		
		post.prettyPrint();

	}

}
