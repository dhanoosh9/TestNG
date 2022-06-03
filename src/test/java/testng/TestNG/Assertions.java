package testng.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Assertions {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		String exp_url = "https://www.saucedemo.com/";
		Assert.assertEquals(driver.getCurrentUrl(),exp_url);
		
	}
	
	@Test
	public void test() {
		String exp_title = "Swag Labs";
		Assert.assertEquals(driver.getTitle(),exp_title);
		Assert.assertTrue(driver.getTitle().equals(exp_title));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();

	}
	
}
