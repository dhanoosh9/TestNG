package testng.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {
	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		String exp_url = "http://automationpractice.com/index.php";
		softassert.assertEquals(driver.getCurrentUrl(),exp_url);
	}
	
	@Test
	public void test() {
		String exp_title = "My Store";
		softassert.assertEquals(driver.getTitle(),exp_title);
		softassert.assertTrue(driver.getTitle().equals(exp_title));
		softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
