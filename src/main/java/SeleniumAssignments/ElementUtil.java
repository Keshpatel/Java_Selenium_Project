package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;   }
	/**
	 * This is use to create the webelement on the basis of give by locator
	 * @param locator
	 * @return
	 */	
	public  WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}	
	
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}	
	
	public  void doClick(By locator) {
		getElement(locator).click();		
	}
	
	public  String doGetText(By locator) {		
		return getElement(locator).getText();	
	}
	
	public  boolean doDoIsDispaly(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	//***************************************************************************************
	public void dolinkclick(List<WebElement> linkslist , String value ) {
		System.out.println(linkslist.size());
		for(WebElement ele : linkslist) 
		{
			String text = ele.getText();
			System.out.println(text);
					if (text.equals(value))
					{
						ele.click();
						break;
					}
		}
	

	}
	
	
	//*******************************DropDown utils*********************************
	//This is using web element passing as arg.
	public void doselectDropDownByVisisbleText(WebElement SelectedEle, String value) {
		Select select = new Select(SelectedEle);
		select.selectByVisibleText(value);
	}
	public void doselectDropDownByindex(WebElement SelectedEle, int index) {
		Select select = new Select(SelectedEle);
		select.selectByIndex(index);
	}
	public void doselectDropDownByValue(WebElement SelectedEle , String value) {
		Select select = new Select(SelectedEle);
		select.selectByValue(value);
	}
	
	public  int getDopDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		return optionsList.size();
	}
	public  List<String> getDopDownOptionsValue(By locator) {
		ArrayList<String> textList = new ArrayList<String>();
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		

		for(WebElement ele : optionsList) {
			String text = ele.getText();
			textList.add(text);
			
		}
		return textList;
	}
	/**
	 * This method is use to select dropdown value without Select Class
	 * @param locator
	 * @param value
	 */
	//********************Drop Down Utils*******************************
	public void SelectValueFromDropDownWothoutSelect(By locator , String value) {
		
		List<WebElement> countryList = driver.findElements(locator);
				
					
		for(WebElement ele: countryList) {
			String text = ele.getText();
			System.out.println(text);	
		
				if (text.equals(value)) {
						ele.click();
						break;
				}
		}
						
	}
	
	
	

	
	public void SelectValueFromDropDown(By locator , String value) {
			
			List<WebElement> countryList = driver.findElements(locator);
					
						
			for(WebElement ele: countryList) {
				String text = ele.getText();
				System.out.println(text);	
					if (text.equals(value)) {
							ele.click();
							break;
					}
			}
							
		}
	//*************************Wait Utils ************************************
	
public WebElement waitForElementPresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		   
	}
	
	public String waitForTitlePresent(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}
		
}