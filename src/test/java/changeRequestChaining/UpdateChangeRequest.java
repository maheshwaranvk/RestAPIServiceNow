package changeRequestChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateChangeRequest extends BaseClassCR{
	
	@Test(dependsOnMethods = {"changeRequestChaining.GetAllChangeRequest.getChangeRequest"})
	public void updateCR() {
	
		Response patch = RestAssured
		.given()
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\"short_description\": \"Created on 1015 String\",\"active\": \"true\"}")
		.patch(sysID);
		
		patch.prettyPrint();

	}

}
