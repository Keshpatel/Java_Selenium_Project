package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> langlink  = driver.findElements(By.xpath("//div[@ id='SIvCob']/a"));
		ElementUtil el = new ElementUtil(driver);
		
		el.dolinkclick(langlink, "Français");
		//System.out.println(langlink.size());
		
//		for(WebElement ele : langlink) {
//			String text = ele.getText();
//			System.out.println(text);
//		
//	
//		if (text.equals("Français")){
//			ele.click();
//			break;
//		}
//	}
}
	
	/**
	 * This method is selecting languages an clicking on it
	 * @param linkslist
	 * @param value
	 */
	public static void dolinkclick(List<WebElement> linkslist , String value ) {
		System.out.println(linkslist.size());
		for(WebElement ele : linkslist) {
			String text = ele.getText();
			System.out.println(text);
					if (text.equals(value)){
						ele.click();
						break;
					}
		}
	}
	
	
	
	
	
	
	
	
	
}