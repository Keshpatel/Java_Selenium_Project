package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginPageTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String browserName = "chrome";
		
		By userName = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browserName);
		br.LunchURL("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		String title = br.getPageTitle();
		System.out.println("Page title : " + title);
		
		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.doSendKeys(userName, "Keshini@gmail.com");
		elementUtil.doSendKeys(password, "Kesh@1234");
		elementUtil.doClick(loginButton);
		
		
		
		
		
		
	}

}

