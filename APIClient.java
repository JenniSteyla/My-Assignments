package week2.day3;

public class APIClient {

	public void sendRequest(String Endpoint) {
		System.out.println(Endpoint);
		
	}
	
	public void sendRequest(String Endpoint, String requestBody, boolean requestStatus) {
		System.out.println(Endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("TestLeaf");
		client.sendRequest("Hii", "Hello", true);
	}

}
