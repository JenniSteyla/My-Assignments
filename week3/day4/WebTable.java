package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://finance.yahoo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id = 'ybar-sbq']")).sendKeys("Crypto");
        driver.findElement(By.xpath("//li[@title = 'Crypto']")).click();
        List<WebElement> header = driver.findElements(By.xpath("//table/thead/tr/th"));
        int headerCount = header.size();
        System.out.println("The number of columns is : "+headerCount);
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        int rowCount = rows.size();
        System.out.println("The number of rows is : "+rowCount);
        String text = driver.findElement(By.xpath("//table/thead/tr/th[2]")).getText();
        System.out.println(text);
        for (int i = 1; i <= rows.size(); i++) {
        	String CryptoNames = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(CryptoNames);
		}
        
	}

}
