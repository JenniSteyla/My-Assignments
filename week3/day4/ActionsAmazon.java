package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("field-keywords")).sendKeys("oneplus 9 pro"+Keys.ENTER);
        String price = driver.findElement(By.xpath("(//span[@class = 'a-price'])[1]")).getText();
        System.out.println("The price of the first resulting product is : "+price);
        //Actions action = new Actions(driver);
        driver.findElement(By.xpath("(//a[@class = 'a-popover-trigger a-declarative'])[1]")).click();
        Thread.sleep(2000);
        String ratings = driver.findElement(By.xpath("(//div[@class = 'a-icon-row a-spacing-small a-padding-none']/span)[1]")).getText();
        System.out.println("The ratings of the first resulting product is : "+ratings);
        driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandles2 = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandles2.get(1));
        driver.findElement(By.name("submit.add-to-cart")).click();
        String total = driver.findElement(By.xpath("(//span[text() = '₹28,889.00'])[7]")).getText();
        System.out.println("The cart total is : "+total);
        if(total.equals("Rs 28,889"))
        {
        	System.out.println("The total is verified");
        }
        else
        {
        	System.out.println("The total is wrong");
        }
	}

}
