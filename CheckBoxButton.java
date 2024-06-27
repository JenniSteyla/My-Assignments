package week2.day3;

public class CheckBoxButton extends ButtonClass {
	public void clickCheckButton() {
		System.out.println("Click the Check Button");
	}
	public static void main(String[] args) {
		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();
		check.click();
		check.submit();
	}

}
