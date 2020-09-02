package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test 
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	@Test
	public void browserTest() {
		System.out.println("Browser test");
	}
	@Test(dependsOnMethods = {"loginTest","browserTest"})
	public void homepageTest() {
		System.out.println("home page test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void userInfoTest() {
		System.out.println("user info test");
	}
	
	
	
	
	
	

}
