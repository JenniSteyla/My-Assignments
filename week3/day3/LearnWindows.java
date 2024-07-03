package week3.day3;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String window = driver.getWindowHandle();
        System.out.println("The Address of the current page is : " +window);
        System.out.println("The Title of the current page is : " +driver.getTitle());
        driver.findElement(By.xpath("//span[@class = 'allcircle circleone']")).click();
        //driver.findElement(By.xpath("(//li[@class = 'menu-list header-icon-menu'])[3]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandles2 = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandles2.get(1));
        System.out.println("The Title of the next page is : "+driver.getTitle());
        driver.switchTo().window(windowHandles2.get(0));
        driver.close();
        
        
        
	}

}
