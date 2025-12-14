package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		/*
		========================================
		SELENIUM LOCATORS – NOTES
		========================================

		▶ What is a Locator?
		A locator is used to identify and find a web element on a web page.
		
		▶ Why Locators are Important?
		Without locators, Selenium cannot interact with elements like
	    textbox, button, link, checkbox, etc.
	    
				    1) ID Locator
			----------------------------------------
			• Fastest and most reliable locator
			• ID value must be unique on the page
			• First priority locator
			
			Example:
			driver.findElement(By.id("username"));
*/
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
        
		driver.close();
	}
}
