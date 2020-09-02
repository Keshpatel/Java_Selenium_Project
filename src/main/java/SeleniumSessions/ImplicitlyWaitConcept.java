package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Implicitly wait : 
		//Global wait -- applied for all the web element by default
		//Applied for all the web elements--when you write findElement or FindElements
		//not applicable for non- web element
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys("Test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);//Nulify imp wait
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("loginBtn")).click();
		
		//home page:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
	}

}
