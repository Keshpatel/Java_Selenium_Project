package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JustEatAssignment {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
				
		
//				//top casting 
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver(); // Launch the browser
				
//				System.setProperty("webdriver.gecko.driver", "C:\\Users\\kdpat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//				WebDriver driver = new FirefoxDriver();
				
				driver.get("http://www.just-eat.co.uk/");// enter url
				
				WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
				postcode.sendKeys("AR51 1AA");
				
				
				Thread.sleep(5000);
				WebElement search = driver.findElement(By.xpath("//span[@class='Form_c-search-btn-text_6RDDX']"));
				search.click();			
				
				
				List <WebElement> linksList = driver.findElements(By.xpath("(//h3[@class='c-listing-item-title'])")); 
			
//				WebElement allopen = driver.findElement(By.xpath("//span[contains(text(),'open')]"));
//				String str = allopen.getText();
//				System.out.println("total number of open shops are :  "+ str);
//				System.out.println("Total number of printing links are : " + linksList.size());
//				
				for(int i = 0 ; i< linksList.size(); i++) {
					String text = linksList.get(i).getText();
					
				
				if(! text.isEmpty()) {				
					System.out.println(i + "======>" + text);	
						System.out.println(linksList.get(i).getAttribute("href"));
				}	 }    }

}
	


