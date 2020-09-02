package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//Test Cases:
//test log - Writing the test cases .
//			pre conditions + Steps + Validation(Actual vs Expected) + Post Steps (Close browser and all other steps) 
//test bed -- entire test case with designing and executions.
	
	
	//Before Annotations(setups) + Test Steps/cases (methods calling) + Assertions + tear down (After Annotation)
	//launch chrome and url + check the google title + Google is equal to Google + quit browser --> HTML / plain Reports
	
	/**
	 * 	BS  -- Connect to DB						
		BT -- Create User in DB
		BC-- Launch the browser
					BM -- loginToApp
						 HomePage Advance SearchTest
					AM -- logout
					
					BM -- loginToApp
						HomePage Profile Test
					AM -- logout
					
					BM -- loginToApp
						HomePage Search Test
					AM -- logout
			
					BM -- loginToApp
						HomePage Title Test
					AM -- logout
	
		AC-- close browser
		AT-- Deleted User in DB
		AS -- disconnect DB

PASSED: HomePageAdvSearchTest
PASSED: HomePageProfileTest
PASSED: HomePageSearchTest
PASSED: HomePageTitleTest

	 */
	//1
	@BeforeSuite
	public void connectDB() {
		System.out.println("BS  -- Connect to DB");
	}
	
	//2
	@BeforeTest
	public void createUserInDB() {
		System.out.println("BT -- Create User in DB");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- Launch the browser");
	}
	
	//4	
	@BeforeMethod
	public void loginToapp() {
		System.out.println("BM -- loginToApp");
	}
	
	@Test
	public void HomePageTitleTest() {
		System.out.println("HomePage Title Test");
	}
	@Test
	public void HomePageSearchTest() {
		System.out.println("HomePage Search Test");
	}
	
	//5
	@Test
	public void HomePageAdvSearchTest() {
		System.out.println("HomePage Advance SearchTest");
	}
	@Test
	public void HomePageProfileTest() {
		System.out.println("HomePage Profile Test");
	}
	
	
//6
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- close browser");
	}
	
	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AT-- Deleted User in DB");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnect DB");
	}
	
	
	
	
	
}
