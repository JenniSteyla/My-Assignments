package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectClassInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@role = 'button'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Jenni");
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Steyla");
        driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("jennifersteyla@gmail.com");
        driver.findElement(By.xpath("(//input[@type = 'password'])[2]")).sendKeys("jennisteyla@2002");
        WebElement birthday = driver.findElement(By.id("day"));
        Select birthdayDD = new Select(birthday);
        birthdayDD.selectByVisibleText("13");
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.id("month"));
        Select monthDD = new Select(month);
        monthDD.selectByIndex(2);
        Thread.sleep(1000);
        WebElement year = driver.findElement(By.id("year"));
        Select yearDD = new Select(year);
        yearDD.selectByValue("2003");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type = 'radio'])[1]")).click();
	}

}
