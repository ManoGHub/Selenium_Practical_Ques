package alertHandle;
/*
 * A Prompt Alert is a JavaScript popup that displays a message along with a text input box
 * and OK and Cancel buttons. It is used to take input from the user.
 * In Selenium, we handle a prompt alert by switching to the alert, entering text using
 * alert.sendKeys(), and clicking OK using alert.accept().
 */
    /*
	 * A Prompt Alert allows the user to enter text using an input box (OK / Cancel).
	 * Selenium handles it by switching to the alert, sending text, and accepting it.
	 */

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PromptAlerts {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	        // Click button to trigger prompt alert
	        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

	        // Switch to alert
	        Alert alert = driver.switchTo().alert();

	        // Enter text into prompt alert
	        alert.sendKeys("Selenium");

	        // Click OK button
	        alert.accept();   // use alert.dismiss() for Cancel

	        Thread.sleep(2000);
	        driver.quit();
	    }
	}

 