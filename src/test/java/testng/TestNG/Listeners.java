package testng.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {


	public void onTestStart(ITestResult result) {
		System.out.println("Testcase is starting");
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed-capture screenshot");
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
	}


	public void onStart(ITestContext context) {
		System.out.println("Starting");
	}


	public void onFinish(ITestContext context) {
		System.out.println("Ending");
	}
	
	
	
}
