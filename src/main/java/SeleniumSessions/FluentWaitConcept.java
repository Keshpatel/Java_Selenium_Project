package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//Explicit wait
		//exp: 1 WebDriverWait
		//2.Fluent Wait
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");
		
		
		waitForElementWithFluentWait(username,10, 2).sendKeys("BatchAutomation");
		
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginButton).click();

	}

	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int interval)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))								
								.pollingEvery(Duration.ofSeconds(interval))
								.ignoring(NoSuchElementException.class);
		
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		
	}
	
	
	
	
}
