package incidentInvidual;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostIncidentUsingString {
	
	
	@Test
	public void PostIncidentString() {
			
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/incident";
		
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
		
		Response post = RestAssured
		.given()
		.log().all()
		.contentType(ContentType.JSON)
		.body("{\"short_description\":\"Created on 0820\",\"active\":\"true\"}")
		.post();

		
		post.prettyPrint();
		
		System.out.println(post.statusCode());
	}

}
