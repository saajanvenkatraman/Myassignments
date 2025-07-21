package week3.day1;

public class APIClient {

	public void sendRequest(String end) {
		System.out.println(end);
	}
	public void sendRequest(String end,String requestBody,boolean requestStatus) {
		System.out.println("Endpoint : "+ end);
		System.out.println("Body:" + requestBody);
		System.out.println("Status:"+ requestStatus);

	}
	public static void main(String[] args) {
		APIClient body = new APIClient();
		body.sendRequest("String ended 1 ");
		body.sendRequest("String Ended ", "Letter", true);
	}
}
