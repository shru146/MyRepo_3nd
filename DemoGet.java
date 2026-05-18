package apistest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class DemoGet 
{
	@Test
	public void getDetails()
	{
		given()
		     .headers("Connection"," keep-alive")
		     
		     .headers("x-api-key" ,"free_user_3DNgS7ptEypqZade84FVlF3PN0t")
		     .when()
		         .get("https://reqres.in/api/users/")
		     .then()
		         .statusCode(200)
		         .log().all();
	}
	

}
