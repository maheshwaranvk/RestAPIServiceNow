package changeRequestChaining;

import java.util.List;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllChangeRequest extends BaseClassCR{
	
	
	@Test(dependsOnMethods = {"changeRequestChaining.CreateChangeRequest.CreateCR"})
	public void getChangeRequest() {
	
		Response response = RestAssured
		.given()
		.log().all()
		.contentType(ContentType.JSON)
		.queryParam("sysparm_fields", "number,sys_id,short_description")
		.queryParam("sysparm_limit", "20")
		.get(sysID);
		
		response.prettyPrint();
		
	//	List<String> list = response.jsonPath().getList("result.sys_id");
		
	//	sysID=list.get(1);

	}

}
