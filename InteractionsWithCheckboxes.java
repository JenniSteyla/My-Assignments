package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         //To get the URL
         driver.get("https://leafground.com/checkbox.xhtml");
         //To maximize the window
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         //To click the basic check box
         driver.findElement(By.xpath("(//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
         //To click on the notification check box
         driver.findElement(By.xpath("//div[@id = 'j_idt87:j_idt91']//div[@class ='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
         //To verify the expected message is displayed
         WebElement expectedMsg = driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/span[text() = 'Checked']"));
         boolean displayed = expectedMsg.isDisplayed();
         System.out.println("The Expected message is displayed "+displayed);
         //To click on the favorite language
         driver.findElement(By.xpath("(//table[@role = 'presentation']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
         //To click on the tri-state check box
         driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
         //To check whether the tri-state check box is chosen
         WebElement triState = driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/span"));
         boolean state = triState.isDisplayed();
         System.out.println("tri-state option has been chosen "+state);
         //To click on the toggle switch
         driver.findElement(By.xpath("//div[@class = 'ui-toggleswitch-slider']")).click();
         //To verify the expected message is displayed
         expectedMsg = driver.findElement(By.xpath("//span[text() = 'Checked']"));
         displayed = expectedMsg.isDisplayed();
         System.out.println("The Expected message is displayed "+displayed);
         //To verify if the check box is disabled
         WebElement checkBox = driver.findElement(By.xpath("//input[@name = 'j_idt87:j_idt102_input']"));
         boolean disabled = checkBox.isEnabled();
         System.out.println("The checkbox is enabled "+disabled);
         //To select multiple options
         WebElement selectCities = driver.findElement(By.xpath("//ul[@data-label = 'Cities']"));
         selectCities.click();
         driver.findElement(By.xpath("//li[@data-item-value = 'London']//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
         driver.findElement(By.xpath("//li[@data-item-value = 'Paris']//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	     //To close multiple options box 
         driver.findElement(By.xpath("//a[@aria-label = 'Close']")).click();
	}

}
