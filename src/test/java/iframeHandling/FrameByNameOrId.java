package iframeHandling;
/*
 * Frame by Name or ID is a way of handling frames where Selenium switches control
 * to a frame using its name or id attribute.
 * This method is preferred because name or id values are usually unique and*

 */

/*
 * This example demonstrates handling a frame using name or id.
 * Selenium switches to the frame, performs actions inside it,
 * and then switches back to the main page.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByNameOrId {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        // Switch to frame using name or id
        driver.switchTo().frame("mce_0_ifr");

        // Perform action inside the frame
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Frame handled using Name or ID");

        // Switch back to main page
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        driver.quit();
    }
}
