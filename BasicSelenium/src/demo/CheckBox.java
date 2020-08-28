package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.jqueryfaqs.com/demos/112/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > button > span")).click();
		
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > ul > li:nth-child(5) > a > label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > ul > li:nth-child(6) > a > label")).click();
	}
}
