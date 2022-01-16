package incidentInvidual;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClass {
	
	@BeforeSuite
	public void setUp() {
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/incident";
		
		RestAssured.authentication=RestAssured.basic("admin", "India@123");

	}

}
