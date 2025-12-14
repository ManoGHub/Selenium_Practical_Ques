package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrap_DropDown {
public static void main(String[] args) throws InterruptedException {
	 
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?utm_source=chatgpt.com#google_vignette");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();//maximize the browser
	
	WebElement dd=driver.findElement(By.xpath("//select[@id='BlogArchive1_ArchiveMenu']"));
	dd.click();
	Select sc=new Select(dd);
	sc.selectByIndex(3);
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
