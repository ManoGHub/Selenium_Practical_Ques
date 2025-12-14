package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) throws InterruptedException {
	/*
	▶ Right Click (Context Click)
	Used to perform mouse right-click action.

	▶ Selenium class used:
	Actions

	▶ Method:
	contextClick(element)

	▶ Interview Point:
	Right click cannot be handled using WebElement.click().
	It must be done using Actions class.
	*/
   
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://demoqa.com/buttons");

    Actions actions = new Actions(driver);

    // Locate right click button
    WebElement rightClickBtn =
            driver.findElement(By.id("rightClickBtn"));

    // Perform right click
    actions.contextClick(rightClickBtn).perform();
    Thread.sleep(3000);
    
    // Get actual message
   

    WebElement messages =driver.findElement(By.id("rightClickMessage"));

    if (messages.isDisplayed()) {
        System.out.println("PASS: Right click validated");
    } else {
        System.out.println("FAIL: Right click not validated");
    }



    driver.quit();
}
}

