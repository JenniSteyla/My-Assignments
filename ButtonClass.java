package week2.day3;

public class ButtonClass extends WebElement {
	
	public void submit() {
		System.out.println("Click on the Submit button");
		
	}
	public static void main(String[] args) {
		ButtonClass button = new ButtonClass();
		button.submit();
		button.setText("Hi");
		button.click();
	}

}
