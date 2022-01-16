package changeRequestChaining;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateChangeRequest extends BaseClassCR{
	
	@Test
	public void CreateCR() {
		
		sysID = RestAssured
		.given()
		.log().all()
		.body("{\"short_description\": \"Created on 0820 File\",\"active\": \"true\"}")
		.contentType(ContentType.JSON)
		.post()
		.jsonPath()
		.get("result.sys_id");

	}

}
