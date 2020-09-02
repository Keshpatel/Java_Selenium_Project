package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElements {
static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		
		By footerlinks = By.xpath("//ul[@class = 'footer-nav']/li/a");
		
//		List<WebElement> linksTOPrint = visibilityOfAllElements(footerlinks,10);
//		
//		for (WebElement links : linksTOPrint) {
//			System.out.println(links.getText());
//		}
		getPageLinksText(footerlinks, 10);
		
		//foreach: using ambda  
		//visibilityOfAllElements(footerlinks,10).stream().forEach(ele-> System.out.println(ele.getText()));
		
	}

	public static List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public static void getPageLinksText(By Locator, int timeOut) {
		List<WebElement> linksTOPrint = visibilityOfAllElements(Locator, timeOut);
		for (WebElement links : linksTOPrint) {
			System.out.println(links.getText());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}

