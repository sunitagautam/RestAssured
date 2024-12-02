package files;

public class Payload {
	
	public static String AddPlace() {
		
		return "{"
				+ "\"productInfo\":\"Footprints Education Program\", \"hash\":\"\", \"customerName\":\"Sunil\", \"customerEmail\":\"rakeshm@gmail.com\", \"merchantTransactionId\":\"290782aac709a48a9667\", \"additionalCharges\":\"\", \"customerPhone\":\"9876453279\", \"amount\":\"7500.00\", \"udf1\":\"49192\", \"udf2\":\"Corporate Tie-up Discount\", \"udf3\":\"Alpha 2, Greater Noida\", \"udf4\":\"\", \"notificationId\":\"20240927\", \"paymentMode\":\"CC\", \"split_info\":\"813490\", \"error_Message\":\"No Error\", \"status\":\"Success\", \"paymentId\":\"796417\"}\r\n"
				+ "\r\n"
				+ "";
	}

public static String AddPlaceU(String name, String email ) {
		
		return "{"
				+ "\"productInfo\":\"Footprints Education Program\", \"hash\":\"\", \"customerName\":\""+name+"\", \"customerEmail\":\""+email+"\", \"merchantTransactionId\":\"290782aac709a48a9667\", \"additionalCharges\":\"\", \"customerPhone\":\"9876453279\", \"amount\":\"7500.00\", \"udf1\":\"49192\", \"udf2\":\"Corporate Tie-up Discount\", \"udf3\":\"Alpha 2, Greater Noida\", \"udf4\":\"\", \"notificationId\":\"20240927\", \"paymentMode\":\"CC\", \"split_info\":\"813490\", \"error_Message\":\"No Error\", \"status\":\"Success\", \"paymentId\":\"796417\"}\r\n"
				+ "\r\n"
				+ "";
	}
}
