package testng.tasks;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.testng.annotations.Test;

public class DyamicDDT {
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
	
	@Test
	public void ddt() {		
		for(int i=0;i<10;i++) {
			String name = randomString(8);
			String email = randomString(8)+"@gmail.com";
			String phone = randomnum(10);
			String pan = randomString(4)+randomNum(4);
			String aadhar = randomNum(12);
			
			System.out.println("NAME: "+name+", EMAIL: "+email+", PHONE: "+phone+", PAN: "+pan+", AADHAR: "+aadhar);
		}
	}
}
