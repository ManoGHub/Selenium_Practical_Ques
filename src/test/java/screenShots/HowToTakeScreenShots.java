package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HowToTakeScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//TakesScreenshot is a interface we must intilazie driver.
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//
		File SourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		//
        File targetFile =new File(System.getProperty("user.dir")+"//ScreenShots//fullpage1.png");
	
       FileHandler.copy(SourceFile, targetFile);
       
      driver.close();
	}
	
}


