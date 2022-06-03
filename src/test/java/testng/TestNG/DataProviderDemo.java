package testng.TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	@DataProvider(name = "data")
	public Object[][] getData(Method m)
	{
		Object[][] testdata = null;
		
		if(m.getName().equals("test")) 
		{
			testdata = new Object[][]
			{
				{"admin","admin123"},
				{"admin1","admin1234"},
				{"admin2","admin456"}
			};
		}
		
		else if(m.getName().equals("test2"))
		{
			testdata = new Object[][]
			{
				{"admin","admin123","test123@test.com"},
				{"admin1","admin1234","test1234@test.com"},
				{"admin2","admin456","test1235@test.com"}
			};
		}
		return testdata;
	}
	
}
