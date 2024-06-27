package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[text()= 'Leads']")).click();
        driver.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
        driver.findElement(By.linkText("Phone")).click();
        driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("99");
        driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
        Thread.sleep(2000);
        WebElement leadId = driver.findElement( By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext']"));
        String Id = leadId.getText();
        leadId.click();
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys("Id");
        driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
        Thread.sleep(2000);
        WebElement verify = driver.findElement(By.xpath("//div[text() = 'No records to display']"));
        boolean display = verify.isDisplayed();
        System.out.println("This message confirms the deletion of record is successful and "+display);
	}

}
