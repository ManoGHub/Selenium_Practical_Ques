package alertHandle;
/*
 * A Confirmation Alert is a JavaScript popup with OK and Cancel buttons.
 * Selenium handles it by switching to the alert and accepting or dismissing it
 * based on the requirement.
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click button to trigger confirmation alert
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Print alert message (optional)
        System.out.println(alert.getText());

        // Click OK button
        alert.accept();   // use alert.dismiss() for Cancel

        Thread.sleep(2000);
        driver.quit();
    }
}
