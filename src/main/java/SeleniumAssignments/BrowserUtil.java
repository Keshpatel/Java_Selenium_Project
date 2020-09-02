package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is Browser Util having different browser related generic Functions
 * @author kdpat
 *
 */
public class BrowserUtil {
	
		public WebDriver driver;		
		/**
		 * This method is use to launch the Browser on the basis of given browser name
		 * @param browserName
		 * @return
		 */
		
		public WebDriver launchBrowser(String browserName) {
			
			if (browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver(); // Launch the browser
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\kdpat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.out.println("Please pass the correct Browser name");
			}
			return driver;
		}
		
		/**
		 * This method is use to Launch the URL
		 * @param url
		 */
		public void LunchURL(String url) {
			
			driver.get(url);
		}
		
		/**
		 * This method is use to get page Title
		 * @return Page Title
		 */
		public String getPageTitle() {
			return driver.getTitle();
		}
		/**
		 * This method is use to get the current page url
		 * @return
		 */
		public String getPageUrl() {
			return driver.getCurrentUrl();
		}
		
		/**
		 * Thid method is use to close the browser.
		 */
		
		public void closeBrowser(){
			driver.close();
		}
		/**
		 * This method is to quit the browser.
		 */
		public void QuitBrowser() {
			driver.quit();
			
		}
		
		
		
		
		
}


