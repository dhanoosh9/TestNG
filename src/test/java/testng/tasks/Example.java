package testng.tasks;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	
	WebDriver driver;
	
	@Test
	public void example() {

		
		for(int i=0;i<10;i++) {
			String search = randomString(8);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
			driver.quit();
			


		}
		
		
	}
	
	
	public static String randomnum(int value) {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
				.withinRange('1', '9').build();
		String randomNum = generator.generate(value);
		return randomNum;
	}

	public static String randomString(int value) {
		String string = RandomStringUtils.randomAlphabetic(value).toLowerCase();
		return string;
	}

	public static String randomNum(int value) {
		String num = RandomStringUtils.randomNumeric(value);
		return num;
	}
}
