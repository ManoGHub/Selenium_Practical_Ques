package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	/*
	▶ Implicit Wait
	Implicit wait tells WebDriver to wait for a fixed time
	before throwing NoSuchElementException.

	▶ It is applied globally to all elements.

	▶ Syntax:
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	▶ Use Case:
	Used when application has small and consistent loading time.

	▶ Limitation:
	Not flexible for individual elements.
	*/
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Apply Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();
    }
}
