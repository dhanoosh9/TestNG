package testng.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider = "data")
	public void loginTest(String username, String password)
	{
		System.out.println("Username: "+username+" Password: "+password);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object logindata[][] = {{"admin","admin123"},
						 		{"admin1","admin123"},
						 		{"admin2","admin1234"}
					};
		return logindata;
	}
	
}
