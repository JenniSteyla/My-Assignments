package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamic extends ProjectSpecificDynamic
{
	@Test(dataProvider = "getData")
    public void runSalesForce(String name, String cname, String description) throws InterruptedException
    { 
		//To click on the app launcher
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[@title = 'App Launcher']")).click();
    	//To click on the view all 
    	driver.findElement(By.xpath("//button[@aria-label = 'View All Applications']")).click();
    	Thread.sleep(2000);
    	//To click on the legal entities option
    	WebElement legal = driver.findElement(By.xpath("//p[text() = 'Legal Entities']"));
    	driver.executeScript("arguments[0].click();", legal);
    	//To click on the dropdown in the legal entities tab
    	WebElement legal2 = driver.findElement(By.xpath("(//lightning-icon[@icon-name = 'utility:chevrondown']//ancestor::a)[14]"));
    	driver.executeScript("arguments[0].click();", legal2);
    	//To click on the new legal entity
    	WebElement New = driver.findElement(By.xpath("//span[text() = 'New Legal Entity']"));
    	driver.executeScript("arguments[0].click();", New);
    	//To enter the legal entity name 
    	driver.findElement(By.xpath("//input[@name = 'Name']")).sendKeys(name);
    	//To enter the company name 
    	driver.findElement(By.xpath("//input[@name = 'CompanyName']")).sendKeys(cname);
    	//To enter the description
    	driver.findElement(By.xpath("(//textarea[@class = 'slds-textarea'])[2]")).sendKeys(description);
    	//To click on the Save button
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[@name = 'SaveEdit']")).click();
    	//To verify the legal entity name 
    	String name1 = driver.findElement(By.xpath("(//span[@class = 'test-id__field-value slds-form-element__static slds-grow word-break-ie11'])[1]")).getText();
    	String ExpectedName = name;
        if (name1.equals(ExpectedName)) 
        {
			System.out.println("The legal entity name is verifed");
		} 
        else
        {
            System.out.println("The legal entity name is not verified");
		}
			
		}
   @DataProvider(name = "getData")
   public String[][] sendData() throws IOException
   {
	   return ReadExcel.readExcelData();
   }

}
