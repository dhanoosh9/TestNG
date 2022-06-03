package testng.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodandTest {
	
	@BeforeTest
	public void logintoApplication() {
		System.out.println("Logining into the application");
	}
	
	@BeforeMethod
	public void dbConnected() {
		System.out.println("Db connected");
	}
	
	@AfterMethod
	public void dbDisConnected() {
		System.out.println("Db disconnected");
	}
	
	@AfterTest
	public void logoutfromApplication() {
		System.out.println("Logout from application");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
}
