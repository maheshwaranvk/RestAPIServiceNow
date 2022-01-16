package incidentInvidual;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateIncident extends BaseClass{
	
	
	@Test
	public void updateInci() {
	
		Response patch = RestAssured
		.given()
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\"short_description\":\"Created on 0952 Patch\",\"approval\":\"Approved2\"}")
		.pathParam("sysID", "46c88ac1a9fe1981014de1c831fbcf6d")
		.queryParam("sysparm_fields", "approval,sys_id,short_description")
		.patch("{sysID}");
		
		patch.prettyPrint();

	}

}
