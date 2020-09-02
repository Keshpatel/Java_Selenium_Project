package TestNGSessions;

import org.testng.annotations.Test;

public class DisabledTestCases {
	
	
	@Test
	public void a_test() {
		System.out.println("A Test");
	}
	@Test(enabled=false)
	public void b_test() {
		System.out.println("B Test");
	}
	@Test
	public void c_test() {
		System.out.println("c Test");
	}
}
