package week2.day3;

public class LoginTestData extends TestData {
	
	public void  enterUsername() {
		System.out.println("Enter the username as demosalesmanager");
		
	}
	
	public void  enterPassword() {
		System.out.println("Enter the Password as crmsfa");
		
	}
	
	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.enterPassword();
		data.enterUsername();
		data.enterCredentials();
		data.navigateToHomePage();
	}

}
