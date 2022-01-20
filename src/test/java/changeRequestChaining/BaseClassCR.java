package changeRequestChaining;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClassCR {
	
	public static String sysID;
	
	@BeforeSuite
	public void baseClassChangeRequest() {
		
		RestAssured.baseURI="https://dev74847.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
		

	}

}
