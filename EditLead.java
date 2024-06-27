package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         driver.get("http://leaftaps.com/opentaps/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.partialLinkText("CRM")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
         driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("TestLeaf");
         driver.findElement(By.xpath("//div[@class = 'fieldgroup']//input[@id = 'createLeadForm_firstName']")).sendKeys("Jenni");
         driver.findElement(By.xpath("//div[@class = 'fieldgroup']//input[@id = 'createLeadForm_lastName']")).sendKeys("Steyla");
         driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("Jennifer");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jennifersteyla@gmail.com");
         WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select stateDD = new Select(state);
         stateDD.selectByVisibleText("New York");
         driver.findElement(By.className("smallSubmit")).click();
         driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
         driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_description']")).clear();
         driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_importantNote']")).sendKeys("I am a Selenium Automation Tester");
         driver.findElement(By.xpath("//input[@value = 'Update']")).click();
         String Title = driver.getTitle();
         System.out.println(Title);
         Thread.sleep(20000);
         driver.close();
         
	}

}
