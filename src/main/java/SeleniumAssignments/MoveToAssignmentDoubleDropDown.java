package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToAssignmentDoubleDropDown {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		Thread.sleep(5000);
		WebElement level1 = driver.findElement(By.id("Login"));
//		WebElement level2 = driver.findElement(By.linkText("SpiceClub Members"));

		LoginOptions(level1 , "Member Login");
		driver.quit();
	}

	
	public static void LoginOptions(WebElement level1, String value) throws InterruptedException {
		
		
		Actions acts = new Actions(driver);
		Thread.sleep(2000);
		
		acts.moveToElement(level1).perform();
		Thread.sleep(2000);
		WebElement l2 = driver.findElement(By.linkText("SpiceClub Members"));
		acts.moveToElement(l2).perform();		
		Thread.sleep(2000);
		driver.findElement(By.linkText(value)).click();
		
		Thread.sleep(8000);
		driver.quit();
	}
}
