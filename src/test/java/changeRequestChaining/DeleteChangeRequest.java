package changeRequestChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteChangeRequest extends BaseClassCR{
	
	@Test(dependsOnMethods = {"changeRequestChaining.UpdateChangeRequest.updateCR"})
	public void deleteCR() {
		
		Response delete = RestAssured
		.given()
		.log().all()
		.delete(sysID);
		
		System.out.println(delete.statusCode());

	}

}
