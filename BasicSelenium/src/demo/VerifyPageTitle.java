package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook - Log In or Sign Up";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(" test case pass");
			
		} else {
			System.out.println("Test case failed");
		}
		driver.close();
	}
	
	

}
