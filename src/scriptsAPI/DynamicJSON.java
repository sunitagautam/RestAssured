package scriptsAPI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import files.ReUsableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJSON {
	
	@Test(dataProvider ="ParentDetails")
	public void PayU(String name, String email) {
		RestAssured.baseURI="https://staging-admissions.footprintseducation.in";
	    String response = given().log().all().queryParam("fkey", "pd0MmAEEMvIB3uvaEB6LcrCGanNhJNWi").header("Content-Type","application/json")
	    .body(Payload.AddPlaceU("Sunita","test@gmail.com")).
	    when().post("api/Eventlistener/payUMoneyEvents/")  
	    .then().log().all().assertThat().statusCode(200).body("paymentId", equalTo("796417")).header("Content-Type","application/json").extract().response()
	    .asString();
	    //Add Place-> Update the place with New Address->Get place to validate if New Address is present in response;
	
	    System.out.println(response);
	    JsonPath js1=ReUsableMethods.rawToJson(response);
		String paymentID =js1.getString("paymentId");
		System.out.println(paymentID);
		Assert.assertEquals(paymentID, "796417");
	    
	}

	@DataProvider(name="ParentDetails")
	public Object[][] getData(){
		//array = collections of elements
		//multidimensional array = collection of array
		return new Object[][] {{"parul","parul@gmail.com"},{"Sunita","sunita@gmail.com"},{"divya","divya@gmail.com"}};
	}
}
