package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@id = 'headlessui-menu-button-:R5bab6:']")).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement food = driver.findElement(By.xpath("(//ul[@class = 'jsx-1259984711 w-56 px-2.5 bg-darkOnyx-800 text-silverSurfer-100 rounded-l-xs']//a[text() = 'Foodgrains, Oil & Masala'])[2]"));
        action.moveToElement(food).perform();
        Thread.sleep(2000);
        WebElement rice = driver.findElement(By.xpath("//a[text() = 'Rice & Rice Products']"));
        action.moveToElement(rice).perform();
        driver.findElement(By.xpath("(//a[text() = 'Boiled & Steam Rice'])[1]")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@id = 'i-BBRoyal']"));
        driver.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[text() = 'Tamil Ponni Boiled - Rice']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandles1 = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandles1.get(1));
        WebElement element2 = driver.findElement(By.xpath("//span[text() = '5 kg']"));
        driver.executeScript("arguments[0].click();", element2);
        String price = driver.findElement(By.xpath("//div[@class = 'StickyPdDetail___StyledDiv-sc-1375rlr-3 jgoqZz']")).getText();
        System.out.println("The price of rice is : "+price);
        WebElement element3 = driver.findElement(By.xpath("(//button[text() = 'Add to basket'])[2]"));
        driver.executeScript("arguments[0].click();", element3);
        boolean displayed = driver.findElement(By.xpath("//p[text() = 'An item has been added to your basket successfully']")).isDisplayed();
        System.out.println("The confirmation message is displayed : "+displayed);
        driver.close();
        Thread.sleep(1000);
        driver.quit();
	}

}
