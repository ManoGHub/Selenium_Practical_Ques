package iframeHandling;
/*
 * This example demonstrates how to handle a frame using index.
 * Selenium switches to the frame by index, performs the action,
 * and then switches back to the main page.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        // Switch to frame using index (0-based)
        driver.switchTo().frame(0);

        // Perform action inside frame
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Frame handled using Index");

        // Switch back to main page
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        driver.quit();
    }
}
