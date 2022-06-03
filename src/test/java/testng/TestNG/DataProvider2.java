package testng.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {
	
	WebDriver driver;
	
	public static By signinbtn = By.cssSelector("[class='login']");
	public static By email = By.xpath("//input[@id='email']");
	public static By passwd = By.cssSelector("[id=passwd]");
	public static By submit = By.cssSelector("[id=SubmitLogin]");
	public static By logout = By.xpath("//a[@class='logout'][contains(.,'Sign out')]");
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="Logindata")
	public void loginDDT(String username,String password)
	{
		driver.findElement(signinbtn).click();
		driver.findElement(email).sendKeys(username);
		driver.findElement(passwd).sendKeys(password);
		driver.findElement(submit).click();
		driver.findElement(logout).click();
	}
	
	@DataProvider(name = "Logindata")
	public String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/Data/LoginData.xlsx";
		int rowcount = XLUtils.getRowCount(path,"Sheet1");
		int cellcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rowcount][cellcount];
		for(int i =1;i<=rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
