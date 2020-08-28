package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidLogin {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("supermacdfwefsdn@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
		
		String actualMsg = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
		//String expectedMsg = "The email address that you've entered doesn't match any account. Sign up for an account.";
		  String expectedMsg = "The email you’ve entered doesn’t match any account. Sign up for an account.";
		System.out.println(actualMsg);
		
		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Test case passed");
		}
			
		else {
				System.out.println("Test case failed");
		}
		
		driver.close();
	}
	
	
}
