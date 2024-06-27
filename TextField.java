package week2.day3;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("Get the Text from DOM");
		
	}
	public static void main(String[] args) {
		TextField text = new TextField();
		text.getText();
		text.setText("TestLeaf");
		text.click();
	}
	

}
