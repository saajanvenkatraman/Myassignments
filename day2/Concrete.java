package week3.day2;

public class Concrete implements DatabseConnection {

	@Override
	public void connect() {
	System.out.println("Connected Successfully");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
	System.out.println("Data Updated");
	}
	public static void main(String[] args) {
		Concrete body = new Concrete();
		body.connect();
		body.disconnect();
		body.executeUpdate();
	}

}
