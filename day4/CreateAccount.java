package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leaftaps.com/opentaps/");
         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Accounts")).click();
         driver.findElement(By.linkText("Create Account")).click();
         driver.findElement(By.id("accountName")).sendKeys("Jennifer");
         driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
         driver.findElement(By.id("numberEmployees")).sendKeys("10");
         driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
         driver.findElement(By.className("smallSubmit")).click();
         String Title = driver.getTitle();
         System.out.println("The title of current page is : "+Title);
         String ExpectedTitle = "Create Account|opentaps CRM";
         if(ExpectedTitle == Title)
         {
        	 System.out.println("The ExpectedTitle and the Acutal Title are same");
         }
         else
         {
        	System.out.println("The ExpectedTitle and the Actual Title are different"); 
         }
         Thread.sleep(5000);
         driver.close();
         }


}
