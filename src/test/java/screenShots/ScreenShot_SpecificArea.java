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

public class ScreenShot_SpecificArea {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement specificArea=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div"));
	
	//TakesScreenshot ts=(TakesScreenshot)driver;//no need while u take a spefic area.
	File fl = specificArea.getScreenshotAs(OutputType.FILE);
	
	File sc =new File(System.getProperty("user.dir")+"//ScreenShots//specific.png");
	
	FileHandler.copy(fl, sc);
	
}
}
