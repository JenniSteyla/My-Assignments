package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leaftaps.com/opentaps/");
         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.linkText("CRM/SFA")).click();
         Thread.sleep(2000);
         driver.close();
	}

}
