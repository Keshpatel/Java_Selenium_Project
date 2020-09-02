package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		Alert alert = waitForAlertToBrPresent(2);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}

	//how can you handle alert using explicitly wait.
	
	public static Alert waitForAlertToBrPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	
	
	
	
	
	
	
	
	
}
