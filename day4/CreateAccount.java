package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.xpath("(//input[@class = 'inputLogin'])[1]")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("(//input[@class = 'inputLogin'])[2]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
        driver.findElement(By.xpath("//img[@src = '/opentaps_images/integratingweb/crm.png']")).click();
        driver.findElement(By.xpath("//a[text() = 'Accounts']")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Jennifer Steyla");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        WebElement industryWE = driver.findElement(By.xpath("//select[@name = 'industryEnumId']"));
        Select industryDD = new Select(industryWE);
        industryDD.selectByVisibleText("Computer Software");
        WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDD = new Select(ownershipWE);
        ownershipDD.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElement(By.xpath("//select[@id = 'dataSourceId']"));
        Select sourceDD = new Select(source);
        sourceDD.selectByValue("LEAD_EMPLOYEE");
        WebElement marketing = driver.findElement(By.xpath("//select[@id = 'marketingCampaignId']"));
        Select marketingDD = new Select(marketing);
        marketingDD.selectByIndex(6);
        WebElement state = driver.findElement(By.xpath("//select[@id = 'generalStateProvinceGeoId']"));
        Select stateDD = new Select(state);
        stateDD.selectByValue("TX");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        String Title = driver.getTitle();
        System.out.println("The Actual Title is " +Title);
        String ExpectedTitle = "Create Account | opentaps CRM";
        if(ExpectedTitle == Title)
        {
        	System.out.println("The Expected Title and the Actual Title are same");
        }
        else
        {
        	System.out.println("The Expected Title and the Actual Title are different");
        }
        Thread.sleep(6000);
        driver.close();
     
}
}
