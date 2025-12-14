package waits;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {
	/*
	▶ Explicit Wait
	Explicit wait waits for a specific condition
	to be satisfied before proceeding.

	▶ It is applied to a particular element.

	▶ More flexible and reliable than Implicit Wait.

	▶ Syntax:
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.condition(locator));
	*/
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
         
        //Decelaration of wait for globally
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for username field to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
            .sendKeys("Admin");

        // Wait for password field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
            .sendKeys("admin123");

        // Wait for login button to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")))
            .click();

        driver.quit();
    }

}
