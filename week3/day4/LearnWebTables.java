package week3.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("MAS"+Keys.ENTER);
        WebElement to = driver.findElement(By.id("txtStationTo"));
        to.clear();
        to.sendKeys("MDU"+Keys.ENTER);
        driver.findElement(By.id("chkSelectDateOnly")).click();
        List<WebElement> row = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
        int rowCount = row.size();
        System.out.println("The row size is : "+rowCount);
        String head = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[1]/th[2]")).getText();
        System.out.println(head);
        Thread.sleep(2000);
        Set<String> trainNames = new LinkedHashSet<String>();
        for (int i = 2; i <= row.size(); i++) {
        	String text = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
        	System.out.println(text);
			
		}
        int TotalNoOfTrains = rowCount-1;
        if(TotalNoOfTrains == trainNames.size())
        {
        	System.out.println("There is no duplicate train names");
        }
        else
        {
        	System.out.println("There is duplicate train names");
        }
        
	}

}
