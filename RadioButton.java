package week2.day3;

public class RadioButton extends ButtonClass{
      
	public void selectRadioButton() {
		System.out.println("Select the Radio Button");
		
	}
	public static void main(String[] args) {
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		radio.submit();
		radio.click();
	}
}
