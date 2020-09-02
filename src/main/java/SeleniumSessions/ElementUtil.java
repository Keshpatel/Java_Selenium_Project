package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
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
	
	public void selectDropDownByVisisbleText(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public void selectDropDownByindex(By locator , int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public void selectDropDownByValue(By locator , String value) {
		Select select = new Select(getElement(locator));
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
	//********************Drop Down Utils without select *******************************
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
	public List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public void getPageLinksText(By Locator, int timeOut) {
		List<WebElement> linksTOPrint = visibilityOfAllElements(Locator, timeOut);
		for (WebElement links : linksTOPrint) {
			System.out.println(links.getText());
		}
	}
	public  WebElement waitForElementPresent(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
		   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
	
	public  String waitForTitlePresent(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
		}
	
	//An expectation for checking that an element, 
		//known to be present on the DOM of a page, is visible. 
		//Visibility means that the element is not only displayed 
		//but also has a height and width that is greater than 0.
		
	public WebElement waitForElementTBeVisible(By locator, int timeout) {
			  WebElement element = getElement(locator);
			  WebDriverWait wait = new WebDriverWait(driver, timeout);
			  return wait.until(ExpectedConditions.visibilityOf(element));
		}
	public boolean waitForUrl(String Url , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(Url));
		
	}
	public Alert waitForAlertToBrPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	
	}
	public WebElement waitForElementToBeClickable(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public void ClickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	public WebElement waitForElementWithFluentWait(By locator, int timeOut, int interval)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))								
								.pollingEvery(Duration.ofSeconds(interval))
								.ignoring(NoSuchElementException.class);
		
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		
	}
}