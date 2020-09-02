package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextAssi {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//System.out.println("Total links : " + linklist.size());
		List <WebElement> llist = driver.findElement(By.className("footer-main")).findElements(By.tagName("a"));
		System.out.println("Footer link text :");
		for (int k = 0 ; k < llist.size(); k++)
		{
			String txt = llist.get(k).getText();
			if(! txt.isEmpty()) {
				System.out.println(k + " ------->" + txt);
			}
		}

	}
}