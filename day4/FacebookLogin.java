package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("Tuna@321");
      driver.findElement(By.name("login")).click();
      driver.findElement(By.linkText("Find your account and log in.")).click();
      String title = driver.getTitle();
      System.out.println("The Title of current page is : "+title);
      Thread.sleep(2000);
      driver.close();
	}

}
