package week1.day4;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.close();
	}

}
