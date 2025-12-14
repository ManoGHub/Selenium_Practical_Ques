 package dropDown;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDown {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?utm_source=chatgpt.com#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximize the browser
		
		
		WebElement selectdd= driver.findElement(By.xpath("//select[@id='course']"));
		Select seldropdown = new Select (selectdd);
		
		//1.select By visibleText 
		seldropdown.selectByVisibleText("Python");
		 Thread.sleep(3000);
		 
		 //2.select By Index value
		seldropdown.selectByIndex(4); 
		Thread.sleep(3000);
		
		//3.Select By Value
		seldropdown.selectByValue("net"); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[@value='ij']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
