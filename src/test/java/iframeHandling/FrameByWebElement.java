package iframeHandling;
/*
 * Frame by WebElement is a method of handling frames where Selenium switches control
 * to a frame by first locating the frame as a WebElement.
 * This approach is mainly used when the frame does not have a name or id,
 * or when the frame is dynamic.
 * Selenium switc*
*//*
 * This example shows how to handle a frame using WebElement.
 * The frame is first identified as a WebElement and then Selenium
 * switches control to it to perform actions.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByWebElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        // Locate the frame as a WebElement
        WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));

        // Switch to frame using WebElement
        driver.switchTo().frame(frameElement);

        // Perform action inside the frame
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Frame handled using WebElement");

        // Switch back to main page
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        driver.quit();
    }
}
