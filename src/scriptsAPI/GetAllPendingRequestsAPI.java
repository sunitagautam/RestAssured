package scriptsAPI;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.ApiResponse; // Ensure you import the correct POJO

public class GetAllPendingRequestsAPI {
    public static void main(String[] args) {
        // Make the API call
        Response response = RestAssured.given()
            .baseUri("http://staging-admissions.footprintseducation.in") // Base URL of the API
            .queryParam("fkey", "F@@tpr!nt$ChargeBeeUpdate$") // Query parameter for authentication or filtering
            .when()
            .get("api/Financialprocess/getAllPendingRequests") // The endpoint for fetching pending requests
            .then()
            .extract().response(); // Extract the response object

     // Print the raw response to inspect it
        System.out.println(response.getBody().asString());
        
        // Deserialize the response into ApiResponse class
        ApiResponse apiResponse = response.as(ApiResponse.class); // Convert JSON to POJO

        // Output the status and the first item's ID to verify
        System.out.println("Status: " + apiResponse.getStatus());
        if (!apiResponse.getResponse().isEmpty()) {
            System.out.println("First Response Item ID: " + apiResponse.getResponse().get(0).getId());
        } else {
            System.out.println("No response items available.");
        }
        
        // Check if there are enough items in the response list before accessing the 6th item
        if (apiResponse.getResponse().size() > 5) {
            System.out.println("Request type: " + apiResponse.getResponse().get(5).getType());
        } else {
            System.out.println("The 6th item is not available in the response.");
        }
    }
}
