package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElement(By.partialLinkText("Example 1: Element")).click();;
		driver.findElement(By.cssSelector("#start > button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		String actualMsg = driver.findElement(By.cssSelector("#finish > h4")).getText();
		System.out.println(actualMsg);
		String expectedMsg = "Hello World!";
		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Test case pass");
			
		} else {
			System.out.println("Test case failed");

		}
		driver.close();
	}
	

}
