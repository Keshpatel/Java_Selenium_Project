package TestNGSessions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountMethod {

	@BeforeTest (enabled = false)
	public void setup() {
		System.out.println("launch chrome");
	}
	@Test(invocationCount=10,priority =1,enabled=true)
	public void CreateUserTest() {
		System.out.println("Create User.....");
	}
	@Test(priority=2)
	public void a_test() {
		System.out.println("A Test");
	}
	@Test(priority=3,enabled=false)
	public void b_test() {
		System.out.println("B Test");
	}
	@Test(priority=4)
	public void c_test() {
		System.out.println("c Test");
	}
	
	
	
	
	
	
	
	
}
