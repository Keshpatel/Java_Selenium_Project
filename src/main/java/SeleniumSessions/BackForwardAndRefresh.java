package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackForwardAndRefresh {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		driver.get("http:\\www.google.com");
			System.out.println(driver.getTitle());
		driver.navigate().to("http:\\www.amazon.in");
			System.out.println(driver.getTitle());
		
		
		
		driver.navigate().back(); //google
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();   //amazon
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); ///google
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}
