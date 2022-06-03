package testng.tasks;


import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValidation {
	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropDown() {

		
		int No_of_months = 12;
		String[] expected = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		Select select = new Select(driver.findElement(By.id("month")));

		int monthsize = select.getOptions().size();
		System.out.println(monthsize);
		
		Assert.assertEquals(No_of_months, monthsize);
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement ele : options) {
			boolean value = false;
			for(int i=0;i<expected.length;i++) {
				if(ele.getText().equals(expected[i])) {
					System.out.println("Actual: "+ele.getText()+" matched "+"Expected: "+expected[i]);
					value = true;
				} 
			}
			softassert.assertTrue(value);
		}
		softassert.assertAll();
	}
	
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}
	
}	
