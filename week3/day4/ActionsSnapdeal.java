package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //To mouse hover on Men's Fashion
        Actions action = new Actions(driver);
        WebElement men = driver.findElement(By.xpath("(//span[@class = 'catText'])[1]"));
        action.moveToElement(men).perform();
        //To click the sports shoes
        driver.findElement(By.xpath("(//span[text() = 'Sports Shoes'])[1]")).click();
        //To get the count of sports shoes
        String noOfItems = driver.findElement(By.xpath("(//span[@class = 'category-name category-count'])[1]")).getText();
        System.out.println("The number of sports shoes is : "+noOfItems);
        //To click on training shoes
        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
        //To sort the products from low to high
        driver.findElement(By.xpath("//i[@class = 'sd-icon sd-icon-expand-arrow sort-arrow']")).click();
        driver.findElement(By.xpath("//li[@data-sorttype = 'plth']")).click();
        //To check if the sorted products are displayed correctly
        Thread.sleep(1000);
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class = 'lfloat product-price']"));
        Set<String> prices1 = new LinkedHashSet<String>();
        for (WebElement price : prices) {
        	String text = price.getText();
        	prices1.add(text);
			}
        System.out.println("The prices after sorting are : " +prices1);
        //To set the price range
        Thread.sleep(2000);
        WebElement from = driver.findElement(By.name("fromVal"));
        from.clear();
        from.sendKeys("400");
        WebElement to = driver.findElement(By.name("toVal"));
        to.clear();
        to.sendKeys("800");
        driver.findElement(By.xpath("//div[@class = 'price-go-arrow btn btn-line btn-theme-secondary']")).click();
        //To filter by any color
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type = 'checkbox']/following-sibling::label)[1]")).click();
        //To verify the applied filters
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id = 'products']/preceding::div[@class = 'navFiltersPill']"));
        int filters = elements.size();
        System.out.println("Applied Filter : "+filters);
        if(filters == 2)
        {
        	System.out.println("Filters Verified");
        }
        else
        {
        	System.out.println("Filters not Verified");
        }
        //To mouse hover on the first resulting training shoes
        Thread.sleep(1000);
        WebElement img = driver.findElement(By.xpath("//a[@class = 'dp-widget-link hashAdded']"));
        action.moveToElement(img).perform();
        //To click on the quick view
        WebElement quick = driver.findElement(By.xpath("//div[@pogid = '680551486989']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(quick));
        driver.executeScript("arguments[0].click();",quick);
        //To print the price and discount percentage
        String text = driver.findElement(By.xpath("//div[@class = 'product-price pdp-e-i-PAY-l clearfix']")).getText();
        System.out.println("The cost and discount percentage is "+text);
        //To close  the current window
        driver.findElement(By.xpath("//div[@class = 'close close1 marR10']")).click();
        //To close the main window
        Thread.sleep(2000);
        driver.close();
	}

}
