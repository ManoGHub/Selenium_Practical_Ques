package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameLocator {
	/*
	▶ ClassName Locator
	Used to locate an element using the 'class' attribute.

	▶ Syntax:
	By.className("classValue");

	▶ Rule:
	Class value must be a SINGLE word.
	If class contains space → ClassName locator will FAIL.

	▶ When to Use:
	When ID and Name are not available
	and class attribute is unique.

	▶ Limitation:
	Cannot use multiple classes.

	▶ Interview Point:
	If class has spaces, use CSS selector instead.
	*/
   public static void main(String[] args) throws InterruptedException {
	
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.saucedemo.com/");
	// Username field
	driver.findElement(By.className("input_error"))
	      .sendKeys("standard_user");

	// Password field
	//it will throw an error because of class name has spaces we can only use single value class name
	driver.findElement(By.className("input_error"))
	      .sendKeys("secret_sauce");

	// Login button
	driver.findElement(By.className("submit-button"))
	      .click();
	Thread.sleep(2000);
	
	driver.close();
}
}
