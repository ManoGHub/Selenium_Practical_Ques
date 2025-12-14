 package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        //decleration of fluen t wait
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
            .sendKeys("Admin");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
            .sendKeys("admin123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")))
            .click();

        driver.quit();
    }
}
