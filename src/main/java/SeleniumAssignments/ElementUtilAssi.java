package SeleniumAssignments;
import org.openqa.selenium.By;  		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	import org.openqa.selenium.support.ui.Select;

public class ElementUtilAssi {	
	public static void main(String[] args) {		
		String browserName = "chrome";		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browserName);br.LunchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");		
		
		ElementUtil elementUtil = new ElementUtil(driver);
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By Company = By.id("Form_submitForm_CompanyName");
		By phone = By.id("Form_submitForm_Contact");
		By submitButton = By.id("Form_submitForm_action_request");
	
		WebElement NoOfEmp = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		WebElement Industry = driver.findElement(By.id("Form_submitForm_Industry"));		
	
		elementUtil.doSendKeys(firstname, "Keshini");	 			elementUtil.doSendKeys(lastname, "Patel");
	 	elementUtil.doSendKeys(email, "Keshini123@gmail.com");	 	elementUtil.doSendKeys(jobTitle, "QA Analyst");
	 	elementUtil.doSendKeys(Company, "K3dTesting-Consulting");	 	elementUtil.doSendKeys(phone, "4035678907");	 	
	 	
	 	Select select = new Select(Industry);		select.selectByValue("Computer/Technology-Reseller");
		Select s1 = new Select(country);			s1.selectByValue("Canada");
		Select s2 = new Select(NoOfEmp);			s2.selectByValue("101 - 150");		
		WebElement Province = driver.findElement(By.id("Form_submitForm_State"));
		Select s3 = new Select(Province);			s3.selectByValue("Alberta");	 
		
		//elementUtil.doClick(submitButton);  // This click is valid after all selection only 
	
	}
}
