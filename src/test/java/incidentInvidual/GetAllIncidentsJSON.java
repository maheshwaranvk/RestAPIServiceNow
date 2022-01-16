package incidentInvidual;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAllIncidentsJSON {
	
	@Test
	public void getIncidentJson() {
		
		//Set EndPoint for the server
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/incident";

		//Set Authentication
		RestAssured.authentication= RestAssured.basic("admin", "India@123");

		//RequestType
		Response response = RestAssured
				.given()
				.queryParam("sysparm_fields", "number,sys_id,short_description")
				.queryParam("sysparm_limit", "20")
				.get();

		//Validate Response
		response.prettyPrint();

		//Print Response
		System.out.println(response.statusCode());
		
		//to extract particular parameter
		JsonPath jsonPath = response.jsonPath();
		List<String> list = jsonPath.getList("result.number");
		
		for (String string : list) {
			System.out.println(string);
		}
		

	}

}
