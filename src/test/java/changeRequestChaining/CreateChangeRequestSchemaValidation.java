package changeRequestChaining;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class CreateChangeRequestSchemaValidation extends BaseClassCR{
	
	@Test
	public void CreateCRSchema() {
		
	RestAssured
		.given()
		.log().all()
		//.body("{\"short_description\": \"Created on 0820 File\",\"active\": \"true\"}")
		.contentType(ContentType.JSON)
		.post()
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(new File("./data/ValidateSchemaCR.json")));

	}

}
