package testng.TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations2 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void cartTest()
	{
		driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("daneil");
		driver.findElement(By.id("last-name")).sendKeys("devil");
		driver.findElement(By.id("postal-code")).sendKeys("521126");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
