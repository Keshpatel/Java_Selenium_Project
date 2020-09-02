package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		//Running in headless mode 
		//Nobrowser is visible 
		//testing is happening in the backgroung 
		//fast 
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http:\\google.com");// enter url			
		String title = driver.getTitle();	//getting the title		
		System.out.println("Title is :" + title);
		
		//validation point /check point
		
		if(title.equals("Google")) {
			System.out.println("Title is correct ");
		}
		else {
			System.out.println("Title is not correct");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
