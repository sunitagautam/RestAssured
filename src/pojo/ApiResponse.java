package pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // This will ignore any unknown fields (like "error")
public class ApiResponse {
    private String status;
    private List<ResponseItem> response;   // List of response items
    private String error;  // Add this field to capture 'error' field from the JSON response

    // Getters and Setters
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public List<ResponseItem> getResponse() {
        return response;
    }
    public void setResponse(List<ResponseItem> response) {
        this.response = response;
    }

    public String getError() {  // Getter for the error field
        return error;
    }

    public void setError(String error) {  // Setter for the error field
        this.error = error;
    }
}
