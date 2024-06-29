package week2.day4;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connect the Database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the Database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the Update");
		
	}
	
	public static void main(String[] args) {
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate();
	}
	
	

}
