package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
				
		driver.quit();
		//driver.close(); 
			
		
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		//NoSuchSessionException: Session ID is null .Using WebDriver after calling quit()
		//invalid session id.
		driver.quit();
	}

}
