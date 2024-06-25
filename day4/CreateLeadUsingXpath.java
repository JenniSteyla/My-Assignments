package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),  'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[@href =  '/crmsfa/control/leadsMain']")).click();
        driver.findElement(By.xpath("//a[text() =  'Create Lead']")).click();
        driver.findElement(By.xpath("//input[@id =  'createLeadForm_companyName']")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("//input[@id =  'createLeadForm_firstName']")).sendKeys("Jenni");
        driver.findElement(By.xpath("//input[@id =  'createLeadForm_lastName']")).sendKeys("Steyla");
        driver.findElement(By.xpath("//input[@id =  'createLeadForm_generalProfTitle']")).sendKeys("Software Tester");
        WebElement sourceWE = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
        Select sourceDD = new Select(sourceWE);
        sourceDD.selectByVisibleText("Website");
        WebElement marketingCampaignWE = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
        Select marketingCampaignDD = new Select( marketingCampaignWE);
        marketingCampaignDD.selectByVisibleText("Demo Marketing Campaign");
        WebElement currencyWE = driver.findElement(By.xpath("//select[@id = 'createLeadForm_currencyUomId']"));
        Select currencyDD = new Select(currencyWE);
        currencyDD.selectByVisibleText("INR - Indian Rupee");
        driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
        String Title = driver.getTitle();
        System.out.println("The title of the current page is : "+Title);
        String ExpectedTitle = "Create Lead|opentaps CRM";
        if(ExpectedTitle == Title)
        {
       	 System.out.println("The ExpectedTitle and the Actual Title are same");
        }
        else
        {
       	 System.out.println("The ExpectedTitle and the Actual Title are different");
        }
        Thread.sleep(5000);
        driver.close();
	}

}
