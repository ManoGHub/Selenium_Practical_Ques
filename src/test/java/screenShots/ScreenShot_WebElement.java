package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenShot_WebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     WebElement we=driver.findElement(By.xpath("//div[@class='col-sm-5']"));
	  
	     File f1=we.getScreenshotAs(OutputType.FILE);
	     
	     File SF=new File (System.getProperty("user.dir")+"//ScreenShots//WebElement1.png");
	     
	    FileHandler.copy(f1, SF);
	    
	    driver.close();
	}
	

}
