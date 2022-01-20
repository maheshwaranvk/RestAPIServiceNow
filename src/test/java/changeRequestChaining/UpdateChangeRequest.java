package changeRequestChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateChangeRequest extends BaseClassCR{
	
	@Test(dependsOnMethods = {"changeRequestChaining.GetAllChangeRequest.getChangeRequest"})
	public void updateCR() {
	
		RestAssured
		.given()
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\"short_description\": \"Created on 1015 String\",\"active\": \"true\"}")
		//.pathParam("sysID", "00e91a7287010110c7b4ca280cbb35f3")
		.patch(sysID)
		.then()
		.assertThat()
		.statusCode(200)
		.extract()
		.response()
		.prettyPrint();
		
		

	}

}
