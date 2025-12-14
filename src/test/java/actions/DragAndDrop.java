package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	/*
	▶ Drag and Drop
	Used to drag an element from source and drop it into target.

	▶ Selenium class used:
	Actions

	▶ Method:
	dragAndDrop(source, target)

	▶ Interview Point:
	Drag and drop is handled using Actions class.
	*/ WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://demoqa.com/droppable");

    Actions actions = new Actions(driver);

    // Source element
    WebElement source =
            driver.findElement(By.id("draggable"));

    // Target element
    WebElement target =
            driver.findElement(By.id("droppable"));

    // Perform drag and drop
    actions.dragAndDrop(source, target).perform();
    Thread.sleep(3000);

    // Validation using if
    String actualText = target.getText();
    String expectedText = "Dropped!";

    if (actualText.equals(expectedText)) {
        System.out.println("PASS: Drag and Drop successful");
    } else {
        System.out.println("FAIL: Drag and Drop not successful");
    }

    driver.quit();
}

}

