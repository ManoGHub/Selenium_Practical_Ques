package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	/*
		 ▶ What is Name Locator?
	       Name locator is used to locate a web element using
	       the 'name' attribute present in the DOM.

		 ▶ Syntax:
		 driver.findElement(By.name("value"));
		 ----------------------------------------
		WHEN TO USE NAME LOCATOR
		----------------------------------------
		• When ID is NOT available
		• When name attribute is present and stable
		• Mostly used for input fields (textbox, radio, checkbox)
			 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
        
		driver.close();

  }
}
