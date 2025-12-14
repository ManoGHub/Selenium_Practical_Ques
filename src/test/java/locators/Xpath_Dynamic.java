package locators;

 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dynamic {
	/*
	▶ Dynamic XPath
	Dynamic XPath is used when attribute values
	change dynamically at runtime.

	▶ Why Dynamic XPath?
	- ID / name changes on every refresh
	- Class values are auto-generated
	- Static XPath fails

	▶ Common Dynamic XPath Functions:
	1) contains()
	2) starts-with()
	3) text()

	▶ Syntax:

	contains():
	 //tagname[contains(@attribute,'partialValue')]

	starts-with():
	 //tagname[starts-with(@attribute,'value')]

	text():
	 //tagname[text()='Exact Text']

	▶ Advantages:
	- Handles dynamic attributes
	- Very flexible
	- Most used in real-time projects

	▶ Interview Point:
	Dynamic XPath is preferred over static XPath
	when attributes are not stable.
	*/
	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        // Username using contains()
	        driver.findElement(By.xpath("//input[contains(@class,'oxd-input')]"))
            .sendKeys("Admin");
	        // Password using starts-with()
	        driver.findElement(By.xpath("//input[@type='password']"))
	              .sendKeys("admin123");

	        // Login button using text()
	        driver.findElement(By.xpath("//button[text()=' Login ']"))
	              .click();
	        Thread.sleep(5000);

	        driver.quit();
	    }}