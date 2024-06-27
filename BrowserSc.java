package week2.day3;

public class BrowserSc {
	String browserName = "Firefox";
	int browserVersion = 15;
	
	public void openURL() {
		System.out.println("Open the URL");
		}
	
	public void closeBrowser() {
		System.out.println("Close the Browser");
		}
	
	public void navigateBack() {
		System.out.println("Navigate back to the browser");
		}
	public static void main(String[] args) {
		BrowserSc browser = new BrowserSc();
		browser.openURL();
		System.out.println(browser.browserVersion);
		System.out.println(browser.browserName);
		
		
		
		
		
		
	}
	
		
	

}
