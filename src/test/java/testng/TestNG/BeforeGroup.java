package testng.TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroup {
	
	@BeforeGroups(groups="Regression")
	public void before()
	{
		System.out.println("BeforeGroup");
	}
	
	@Test(groups = "Regression")
	public void test()
	{
		System.out.println("I belong to regression");
		
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void test2()
	{
		System.out.println("I belong to regression and sanity");
	}
	
	@Test(groups = "Smoke")
	public void test3()
	{
		System.out.println("I belong to smoke");
	}
	
	@Test(groups = {"Smoke","Sanity"})
	public void test4()
	{
		System.out.println("I belong to smoke and sanity");
	}
	
	@AfterGroups(groups="Regression")
	public void after()
	{
		System.out.println("AfterGroup");
	}
	
	
}
