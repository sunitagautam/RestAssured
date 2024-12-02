package scriptsAPI;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import files.Payload;


public class Basics {
	
	public static void main(String[] args) {
	
	// Validate If and Place API is working as expected
	//given : All input details
	//when : Submit the API , resource & HTTPS method(GET/POST)
	//then : validate the response
		//convert the content of file to String->content of file can convert in Byte->Byte Data to String
		//	  .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\SunitaGautam\\Desktop\\Automation\\PayU.json\")))).when().post("api/Eventlistener/payUMoneyEvents/")  

		
		//Finance Module: payUMoneyEvents API
		RestAssured.baseURI="https://staging-admissions.footprintseducation.in";
	    String response = given().log().all().queryParam("fkey", "pd0MmAEEMvIB3uvaEB6LcrCGanNhJNWi").header("Content-Type","application/json")
	  .body(Payload.AddPlace()).when().post("api/Eventlistener/payUMoneyEvents/")  
	    .then().log().all().assertThat().statusCode(200).body("paymentId", equalTo("796417")).header("Content-Type","application/json").extract().response()
	    .asString();
	    //Add Place-> Update the place with New Address->Get place to validate if New Address is present in response;
	
	    System.out.println(response);
	    
	    
	}
}
