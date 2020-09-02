package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToAssignmentSigleDropDown {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		Thread.sleep(5000);
		
		SelectAddOn("MyFlexiPlan");
		Thread.sleep(8000);
		driver.quit();
	}

	
	
	
	public static void SelectAddOn(String Value) throws InterruptedException {

		WebElement addon = driver.findElement(By.id("highlight-addons"));
		Actions acts = new Actions(driver);
		
		acts.moveToElement(addon).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText(Value)).click();
		
		
	}

}
