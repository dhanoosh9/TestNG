package testng.TestNG;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="data",dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password)
	{
		System.out.println("Username: "+username+" Password: "+password);
	}
	
	@Test(dataProvider="data",dataProviderClass = DataProviderDemo.class)
	public void test2(String username, String password, String email)
	{
		System.out.println("Username: "+username+" Password: "+password+" Email: "+email);
	}
	
}
