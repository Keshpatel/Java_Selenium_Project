package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownAssignment {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
				
		ElementUtil elementUtil = new ElementUtil(driver);
		
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By Company = By.id("Form_submitForm_CompanyName");
		By phone = By.id("Form_submitForm_Contact");
		By submitButton = By.id("Form_submitForm_action_request");
	
		
		WebElement NoOfEmp = elementUtil.getElement(By.id("Form_submitForm_NoOfEmployees"));
		WebElement Industry = elementUtil.getElement(By.id("Form_submitForm_Industry"));
		WebElement country = elementUtil.getElement(By.id("Form_submitForm_Country"));	
		
		elementUtil.doSendKeys(firstname, "Keshini");	 			elementUtil.doSendKeys(lastname, "Patel");
	 	elementUtil.doSendKeys(email, "Keshini123@gmail.com");	 	elementUtil.doSendKeys(jobTitle, "QA Analyst");
	 	elementUtil.doSendKeys(Company, "K3dTesting-Consulting");	 	elementUtil.doSendKeys(phone, "4035678907");
			  
		//DropDown Select
		elementUtil.doselectDropDownByValue(NoOfEmp, "101 - 150");
		elementUtil.doselectDropDownByindex(Industry, 5);
		elementUtil.doselectDropDownByVisisbleText(country, "Canada");
		
		WebElement Province = elementUtil.getElement(By.id("Form_submitForm_State"));
		elementUtil.doselectDropDownByValue(Province, "Alberta");
		
		
		//elementUtil.doClick(submitButton);  // This click is valid after all selection only 
			
			}

}
