package TestNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	
	@Test(priority=1)	
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void googleUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://www.google.com/?gws_rd=ssl");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
	
	
	
	

}
