package week3.day2;

public class JavaConnections extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Queries Accepted");
		
	}
public static void main(String[] args) {
	
	JavaConnections box = new JavaConnections();
	box.connect();
	box.disconnect();
	box.executeUpdate();
	box.executeQuery();
}
}
