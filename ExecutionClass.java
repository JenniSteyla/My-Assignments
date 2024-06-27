package week2.day3;

public class ExecutionClass extends ButtonClass {
	public void Elements() {
		System.out.println("Enter the Elements");
		
	}
	public static void main(String[] args) {
		ExecutionClass exe = new ExecutionClass();
		exe.Elements();
		exe.click();
		exe.setText("Selenium");
		exe.submit();
		exe.click();
	}

}
