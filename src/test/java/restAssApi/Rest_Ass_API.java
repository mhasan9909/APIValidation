package restAssApi;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Rest_Ass_API {
  
	
	@Test
	  
	  public void getApi() {
		  //how to receive responds with get method
		  
		  Response getIt=get("https://reqres.in/api/users?page=2");
		  getIt.prettyPrint();
		  System.out.println(getIt.getStatusCode());
		  System.out.println(getIt.getTime());
		  
		  //to validate
		  int validGstatus=getIt.getStatusCode();
		  Assert.assertEquals(validGstatus,200);
		  
	  }  
		  @Test
		  public void postApi() {
			  
			  File inPut=new File("/Users/mdhasan/eclipse-workspace/LearnSel/dataEntry.json");
			  Response postIt=given().contentType(ContentType.JSON).body(inPut).post("https://reqres.in/api/users");
			  postIt.prettyPrint();
			  System.out.println(postIt.getStatusCode());
			  System.out.println(postIt.getTime());
			  
			  //to validate
			  int validPstatus=postIt.getStatusCode();
			  Assert.assertEquals(validPstatus,201);
	  
  }
}
