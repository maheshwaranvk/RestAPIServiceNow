package incidentInvidual;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class GetAllIncidentXML {

	@Test
	public void getIncidentXML() {
		
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/incident";
		
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
		
		Response response = RestAssured
		.given()
		.accept(ContentType.XML)
		.queryParam("sysparm_fields", "number,sys_id,short_description")
		.queryParam("sysparm_limit", "20")
		.get();
		
		response.prettyPrint();
		
		XmlPath xmlPath = response.xmlPath();
		
		List<String> list = xmlPath.getList("response.result.number");
		
		for (String string : list) {
			System.out.println(string);
		}
		

	}

}
