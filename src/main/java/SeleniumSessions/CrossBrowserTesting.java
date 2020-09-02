package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;
	
	public static void main(String ar[]) {
		
		String browser = "chrome";
		
//		if (browser.equalsIgnoreCase("chrome")){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver(); // Launch the browser
//		}
//		else if (browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kdpat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//		else {
//			System.out.println("Please pass the correct Browser name");
//		}
//		
		switch (browser) {
		case "chrome":
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // Launch the browser
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\kdpat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please pass the correct Browser name");
			break;
		}
		
		driver.get("http:/www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
}
