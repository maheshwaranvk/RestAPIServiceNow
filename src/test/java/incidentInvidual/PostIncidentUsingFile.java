package incidentInvidual;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostIncidentUsingFile {
	
	@Test
	public void postIncidentFile() {


		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "India@123");
		
		 File file = new File("./data/PostIncident.json");
		 	 
		Response post = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(file)
		.post();
		
		post.prettyPrint();
		
		System.out.println(post.statusCode());
		

	}

}
