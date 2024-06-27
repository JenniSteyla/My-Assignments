package week2.day3;

public class WebElement {
	
	public void click() {
		System.out.println("Click on the WebElement");
		
	}
	
	public void setText(String Text) {
		System.out.println("Set up a Text");
		
	}
	public static void main(String[] args) {
		WebElement web = new WebElement();
		web.click();
		web.setText("Jenni");
	}

}
