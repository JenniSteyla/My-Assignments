package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   ChromeDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("http://leaftaps.com/opentaps/");
	         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         driver.findElement(By.className("decorativeSubmit")).click();
	         driver.findElement(By.linkText("CRM/SFA")).click();
	         driver.findElement(By.linkText("Leads")).click();
	         driver.findElement(By.linkText("Create Lead")).click();
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jenni");
	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Steyla");
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	         driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test");
	         driver.findElement(By.className("smallSubmit")).click();
	         String Title = driver.getTitle();
	         System.out.println("The title of the current page is : "+Title);
	         String ExpectedTitle = "Create Lead|opentaps CRM";
	         if(ExpectedTitle == Title)
	         {
	        	 System.out.println("The ExpectedTitle and the Actual Title are same");
	         }
	         else
	         {
	        	 System.out.println("The ExpectedTitle and the Actual Ttle are different");
	         }
	         Thread.sleep(5000);
	         driver.close();
	         
	}

}
