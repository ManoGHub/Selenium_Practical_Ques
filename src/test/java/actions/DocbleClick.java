package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DocbleClick {
public static void main(String[] args) throws InterruptedException {
	/*
	▶ Double Click
	Used to perform a mouse double-click action.

	▶ Selenium class used:
	Actions

	▶ Method:
	doubleClick(element)

	▶ Interview Point:
	Double click is handled using Actions class, not WebElement click().
	*/

	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 Actions actions = new Actions(driver);
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();	 
	
	//locate the buuton
	WebElement doubleClickBtn =
            driver.findElement(By.id("doubleClickBtn"));

    // Perform double click
    actions.doubleClick(doubleClickBtn).perform();
    Thread.sleep(3000);
    
     
    driver.quit();
}
	
}

