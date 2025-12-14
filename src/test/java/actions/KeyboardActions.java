 package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
public class KeyboardActions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        Actions actions = new Actions(driver);

        WebElement currentAddress =
                driver.findElement(By.id("currentAddress"));

        WebElement permanentAddress =
                driver.findElement(By.id("permanentAddress"));

        // Type text
        currentAddress.sendKeys("Chennai");

        // CTRL + A (select all)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys. CONTROL)
               .perform();

        // CTRL + C (copy)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("c")
               .keyUp(Keys.CONTROL)
               .perform();

        // TAB to move to next field
        actions.sendKeys(Keys.TAB).perform();

        // CTRL + V (paste)
        actions.keyDown(Keys.CONTROL)
               .sendKeys("v")
               .keyUp(Keys.CONTROL)
               .perform();
        
        Thread.sleep(5000);

        // Validation using if
        String copiedText = permanentAddress.getAttribute("value");

        if (copiedText.equals("Chennai")) {
            System.out.println("PASS: Keyboard copy-paste successful");
        } else {
            System.out.println("FAIL: Keyboard copy-paste failed");
        }

        driver.quit();
    }
}
