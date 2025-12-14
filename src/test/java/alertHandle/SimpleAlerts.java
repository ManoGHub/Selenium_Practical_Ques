package alertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts{
	/*
	 * A Simple Alert is a JavaScript popup that displays a message with only an OK button.
	 * It is used to give information or warnings to the user.
	 * In Selenium, we handle a simple alert by switching to it using driver.switchTo().alert()
	 * and clicking the OK button using alert.accept().
	 */


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click button to trigger simple alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Get alert text (optional)
        System.out.println("Alert message: " + alert.getText());

        // Click OK button
        alert.accept();

        Thread.sleep(2000);
        driver.quit();
    }
}
