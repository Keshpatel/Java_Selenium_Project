package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(5000);
		
		//Create the WebElement and perform the action 
		
		//1.id 		
//		driver.findElement(By.id("username")).sendKeys("Keshini@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test-123");
//		driver.findElement(By.id("loginBtn")).click();
		
//      1.2
//		WebElement emailid = driver.findElement(By.id("username"));
//		emailid.sendKeys("Keshini@gmail.com");
//		
		
//		//1.3 : Using by locators:
//		By userName = By.id("username");
//		By password = By.id("password");
//		By loginButton = By.id("loginBtn");
////
//		//1.4
//		driver.findElement(userName).sendKeys("Keshini@gmail.com");
//		driver.findElement(password).sendKeys("Test-123");
//		driver.findElement(loginButton).click();
//		
//		getElement(userName).sendKeys("Keshini@gmail.com");
//		getElement(password).sendKeys("Test-123");
//		getElement(loginButton).click();
		
		//1.4
//		doSendKeys(userName, "Keshini@gmail.com");
//		doSendKeys(password, "Test-123");
//		doClick(loginButton);
		
		//2. name:
		//driver.findElement(By.name("username")).sendKeys("kdpatel8184@gmail.com");
		
		//3. Class Name
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("Test@123");
		
		//4.XPATH = Address of webElement in HTML DOM - is a locator but not an attribute
//		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();

		//5.cssSelector:Address of webElement in HTML DOM - is a locator but not an attribute
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Test@123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();

		//6. link text: Only for Links: with <a> Html tag
		
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. PartialLink Text:Only for link but not recomneded.
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. TagName
//		String header = driver.findElement(By.tagName("h1")).getText();
//		
//		System.out.println(header);
		
		
				
		
}
	
	/**
	 * This is use to create the webelement on the basis of give by locator
	 * @param locator
	 * @return
	 */

	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public static String doGetText(By locator) {		
		return getElement(locator).getText();	
	}
	
	public static boolean doDoIsDispaly(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	
	
	
}
