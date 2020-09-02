package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {		
	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();//launch chrome
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	        driver.get("https://www.espncricinfo.com/series/19880/scorecard/1227595/worcestershire-vs-glamorgan-central-group-bob-willis-trophy-2020");//enter url
	        
		Thread.sleep(5000);
		
	
		System.out.println(getWicketTakerName("EG Barnard"));
		System.out.println(getWicketTakerName("J Leach"));
		
		
		
		
		
	}
		public static String getWicketTakerName(String playerName) {
			
			return driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td/span")).getText();
		}

}
