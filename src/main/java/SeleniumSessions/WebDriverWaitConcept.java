package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		//Explicitwait= --> WebDriverWait, FluentWait -- > wait(I)
		//This is used for both WebElements and for non web elements - title, alerts , urls
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		String title = waitForTitlePresent("HubSpot Login", 5);
		System.out.println(title);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("Login"));
		//wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		//System.out.println(driver.getTitle());
		
		
		   By userName = By.id("username");
		   By password = By.id("password");
		   By loginButton = By.id("loginBtn");
		   By signUpLink = By.linkText("Sign up");
		   By firstName = By.id("uid-firstName-5");
		   
		 //Custom wait with Webdriver wait for a specific web element .
		   
//		   WebDriverWait wait = new WebDriverWait(driver, 10);
//		   wait.until(ExpectedConditions.presenceOfAllElementsLocated(userName));
//		   
//		   driver.findElement(userName).sendKeys("kdpate8184@gmail.com");
		 
		   waitForElementPresent(userName, 10).sendKeys("Test@gmail.com");
		   
		   driver.findElement(By.id("password")).sendKeys("test@123");
		   driver.findElement(loginButton).click();
		   driver.findElement(signUpLink).click();
		   
		   waitForElementPresent(firstName , 6).sendKeys("Keshini");
		   if(waitForUrl("signup", 5)) {
			  System.out.println("sign up url is correct");   
		   }
		   
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		   
	}
	//An expectation for checking that an element, 
	//known to be present on the DOM of a page, is visible. 
	//Visibility means that the element is not only displayed 
	//but also has a height and width that is greater than 0.
	public static WebElement waitForElementTBeVisible(By locator, int timeout) {
		  WebDriverWait wait = new WebDriverWait(driver, timeout);
		  return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	public static String waitForTitlePresent(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}
	
	public static boolean waitForUrl(String Url , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(Url));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
