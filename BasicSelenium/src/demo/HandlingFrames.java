package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Downloads")).click();
	
		//driver.findElement(By.cssSelector("API Docs")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'link')])[8]")).click();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("DEPRECATED")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AddCookie")).click();
		//driver.close();
	}

}
