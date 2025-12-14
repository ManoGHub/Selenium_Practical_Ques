package scrollingPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEndofThePage {
	
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
}
}
	





