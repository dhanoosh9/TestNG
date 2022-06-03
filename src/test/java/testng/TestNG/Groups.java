package testng.TestNG;

import org.testng.annotations.Test;

@Test(groups="Login")
public class Groups {
	
	@Test(groups = {"Regression","smoke","sanity"})
	public void test() {
		System.out.println("test 0");
	}
	
	@Test(groups = {"Regression","smoke"})
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test(groups = {"Regression","sanity"})
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(groups = {"Regression"})
	public void test3() {
		System.out.println("test 3");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void test4() {
		System.out.println("test 4");
	}
	
	@Test(groups = {"smoke"})
	public void test5() {
		System.out.println("test 5");
	}
	
	@Test(groups = {"sanity"})
	public void test6() {
		System.out.println("test 6");
	}
	
}
