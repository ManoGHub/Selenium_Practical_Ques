package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {
	/*
	▶ XPath (Static XPath)
	XPath is used to locate elements using XML path expression.

	▶ Syntax:
	By.xpath("xpathExpression");

	▶ Static XPath:
	Uses FIXED attributes.
	Works only when attributes do not change.

	▶ Basic XPath Format:
	 //tagname[@attribute='value']

	▶ Advantages:
	- Can locate any element
	- Works when ID, Name, Class are not available

	▶ Limitations:
	- Slower than CSS
	- Breaks if attribute value changes

	▶ Interview Point:
	Static XPath is simple but not reliable for dynamic elements.
	*/
	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com/");

	        // Username using Static XPath
	        driver.findElement(By.xpath("//input[@id='user-name']"))
	              .sendKeys("standard_user");

	        // Password using Static XPath
	        driver.findElement(By.xpath("//input[@name='password']"))
	              .sendKeys("secret_sauce");

	        // Login button using Static XPath
	        driver.findElement(By.xpath("//input[@id='login-button']"))
	              .click();

	        driver.quit();
	    }
	}


