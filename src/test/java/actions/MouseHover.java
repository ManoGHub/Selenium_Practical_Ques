package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  WebElement mainItem = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	      WebElement subItem = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	      WebElement subSubItem = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));

	      // Perform mouse over
	      action.moveToElement(mainItem)
	             .moveToElement(subItem)
	             .moveToElement(subSubItem)
	             .click()
	             .build()
	             .perform();
		Thread.sleep(5000);
		
		driver.quit();
}
}