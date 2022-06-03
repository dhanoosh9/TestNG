package testng.TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {
	
	Boolean datasetup = false;
	
	@Test(enabled=false)
	public void skiptest1() {
		System.out.println("Skipping this test as it is not complete");
	}
	
	@Test
	public void skiptest2() {
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skiptest3() {
		System.out.println("Skipping this test based on condition");
		if(datasetup==true) {
			System.out.println("Execute the test");
		}
		else {
			throw new SkipException("Do not execute further steps");
		}
		
	}
	
}
