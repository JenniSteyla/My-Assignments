package week2.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement search = driver.findElement(By.xpath("//input[@aria-label = 'Search Ajio']"));
        search.sendKeys("bags");
        search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//input[@id = 'Men']/following::label)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id = 'Men - Fashion Bags']/following::label)[1]")).click();
        String itemsFound = driver.findElement(By.xpath("//div[@aria-label = '1,105 Items Found']")).getText();
        System.out.println("No of items found are : "+itemsFound);
        List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
        Set<WebElement> brandNames = new LinkedHashSet<WebElement>(brands);
        System.out.println("Available Brand Names : ");
        for (WebElement bn : brandNames) {
        	System.out.println(bn.getText());
			
		}
        List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
        System.out.println("Bag Names are : ");
        for (WebElement bg : bags) {
        	System.out.println(bg.getText());
			
		}
        
        
	}

}
