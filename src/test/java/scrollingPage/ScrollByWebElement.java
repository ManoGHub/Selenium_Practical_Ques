package scrollingPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollByWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		WebElement cameraSection=driver.findElement(By.xpath("//li[7]//a[1]"));
		cameraSection.click();
		
		WebElement camera=driver.findElement(By.xpath("//body//div[@id='product-category']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", camera);
		
		
		
	}

}
