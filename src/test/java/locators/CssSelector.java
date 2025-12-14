package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSelector {
	/*
	▶ CSS Selector
	Used to locate elements using CSS pattern.

	▶ Syntax:
	By.cssSelector("cssExpression");

	▶ Advantages:
	- Faster than XPath
	- Cleaner and readable
	- Supports ID, class, attribute

	▶ Limitations:
	- Cannot locate elements using text()

	▶ Common CSS Patterns:
	#id                 → ID
	.class              → Class
	tagname             → Tag
	tag[attr='value']   → Attribute
	parent child        → Descendant

	▶ Interview Point:
	CSS is preferred over XPath for performance.
	*/
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com/");

	        // Username using CSS ID
	        driver.findElement(By.cssSelector("#user-name"))
	              .sendKeys("standard_user");

	        // Password using CSS Attribute
	        driver.findElement(By.cssSelector("input[name='password']"))
	              .sendKeys("secret_sauce");

	        // Login button using CSS Attribute
	        driver.findElement(By.cssSelector("input[data-test='login-button']"))
	              .click();
	        Thread.sleep(2000);

	        driver.quit();
	    }
}
