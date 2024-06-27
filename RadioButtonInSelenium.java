package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        //To get the URL
        driver.get("https://www.leafground.com/radio.xhtml");
        //To maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //To click on the most favorite browser
        driver.findElement(By.xpath("(//input[@name = 'j_idt87:console1']/ancestor :: div[@class = 'ui-radiobutton ui-widget'])[4]")).click();
        //To click again to verify that it is unselected
        WebElement select = driver.findElement(By.xpath("//input[@id = 'j_idt87:console1:3']/following::span[@class = 'ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']"));
        select.click();
        boolean unselect = select.isSelected();
        System.out.println("The favourite browser is unselected " +unselect);
        //To identify the button that is initially selected by default
        WebElement select2 = driver.findElement(By.xpath("//input[@id = 'j_idt87:console2:2']"));
        boolean selected = select2.isSelected();
        System.out.println("Safari is selected by default and it is "+selected);
        //To select age group (20-40 years) if not already selected
        WebElement select3 = driver.findElement(By.xpath("//input[@id = 'j_idt87:age:1']"));
        boolean selected2 = select3.isSelected();
        System.out.println("Already selected "+selected2);
     
        
	}

}
