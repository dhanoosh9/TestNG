package testng.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@BeforeMethod()
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Test
	public void test1() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	
}	
