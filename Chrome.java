package week2.day3;

public class Chrome extends BrowserSc {
	  public void OpenIncognito() {
		  System.out.println("Open the Incognito");
		
	}
	  public void clearCache() {
		  System.out.println("Clear the Cache");
		
	}
	  public static void main(String[] args) {
		Chrome ch = new Chrome();
		System.out.println(ch.browserName);
		System.out.println(ch.browserVersion);
		ch.openURL();
		ch.clearCache();
		ch.navigateBack();
		ch.closeBrowser();
		ch.OpenIncognito();
		
	}

}
