package iframeHandling;
/*
 * Nested Frames are frames present inside another frame.
 * In this case, Selenium must switch control first to the parent frame
 * and then to the child frame to interact with elements inside it.
 * Selenium cannot directly switch to a child frame without entering
 * the parent frame.
 * After completing actions, Selenium should switch back to the main page.
 */

/*
 * This example demonstrates handling nested frames.
 * Selenium switches from the main page to the parent frame,
 * then to the child frame, performs actions, and finally
 * switches back to the main page.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Switch to top frame
        driver.switchTo().frame("frame-top");

        // Switch to left child frame
        driver.switchTo().frame("frame-left");

        // Read text inside child frame
        String text = driver.findElement(By.tagName("body")).getText();
        System.out.println(text);

        // Switch back to main page
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        driver.quit();
    }
}

