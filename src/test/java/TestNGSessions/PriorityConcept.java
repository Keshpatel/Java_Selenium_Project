package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	
	@Test(priority=-1)
	public void a_test() {
		System.out.println("A Test");
	}
	@Test(priority=1)
	public void b_test() {
		System.out.println("B Test");
	}
	@Test(priority=-4)
	public void c_test() {
		System.out.println("c Test");
	}
	@Test(priority=2)
	public void d_test() {
		System.out.println("d Test");
	}
	@Test(priority=-5)
	public void e_test() {
		System.out.println("e Test");
	}
	@Test(priority=3)
	public void f_test() {
		System.out.println("f Test");
	}
	
	
	

}
