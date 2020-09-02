package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WenDriverBasics {

	public static void main(String[] args) {
		
		//open browser 
		//enter the url
		//verify title of the page   --- Acual vs Expected 
		//close the browser 
		
		
//		//top casting 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(); // Launch the browser
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kdpat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver dr = new FirefoxDriver();
		
			
		dr.get("http:\\google.com");// enter url			
		String title = dr.getTitle();	//getting the title		
		System.out.println("Title is :" + title);
		
		//validation point /check point
		
		if(title.equals("Google")) {
			System.out.println("Title is correct ");
		}
		else {
			System.out.println("Title is not correct");
		}
		String url = dr.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(dr.getPageSource());
		dr.quit();// closing the browser
		
		
		
		

	}

}
