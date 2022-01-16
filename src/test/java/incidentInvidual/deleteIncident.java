package incidentInvidual;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteIncident extends BaseClass{
	
	@Test
	public void deleteIncide() {
		
		Response delete = RestAssured
		.given()
		.log().all()
		.pathParam("sysID", "46c88ac1a9fe1981014de1c831fbcf6d")
		.delete("{sysID}");
		
		System.out.println(delete.statusCode());
		

	}
}
