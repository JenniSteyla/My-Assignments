package week2.day3;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Enter the necessary credentials");
		
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigate to the home page");
		
	}
	
	public static void main(String[] args) {
		TestData test = new TestData();
		test.enterCredentials();
		test.navigateToHomePage();
	}

}
