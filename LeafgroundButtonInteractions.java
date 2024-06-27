package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[text() = 'Click']")).click();
        String Title = driver.getTitle();
        System.out.println(Title);
        String ExpectedTitle = "dashboard";
        if(ExpectedTitle.equals(Title))
        {
        	System.out.println("The ExpectedTitle and Title are same");
        }
        else
        {
        	System.out.println("The ExpecTitle and Title are different");
        }
        driver.get("https://leafground.com/button.xhtml");
        WebElement disabledBtn = driver.findElement(By.xpath("//button[@aria-disabled ='true']"));
        boolean disabled = disabledBtn.isEnabled();
        System.out.println("The Button is enabled "+disabled);
		WebElement position = driver.findElement(By.xpath("(//span[text() ='Submit'])[1]"));
		Point location = position.getLocation();
        System.out.println(location);
        String backgroundClr = driver.findElement(By.xpath("//button[@name ='j_idt88:j_idt96']")).getCssValue("background-color");
        System.out.println(backgroundClr);
        Dimension size = driver.findElement(By.xpath("//button[@name ='j_idt88:j_idt98']")).getSize();
        System.out.println(size);
	}

}
