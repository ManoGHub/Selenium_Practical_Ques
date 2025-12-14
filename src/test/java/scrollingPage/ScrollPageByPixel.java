package scrollingPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class ScrollPageByPixel {
public static void main(String[] args) throws InterruptedException    {
	WebDriver driver =new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//here 0 is x axis and 1500 is y axis(y axis is movable so that we change the value.
	js.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(3000);
	
	js.executeScript("window.scrollTo(0,0)", "");
	Thread.sleep(2000);
	
	driver.close();
}
}
