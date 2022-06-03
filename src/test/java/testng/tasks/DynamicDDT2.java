package testng.tasks;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.testng.annotations.Test;

public class DynamicDDT2 {

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

//	@Test
//	public void test()
//	{	
//		List<UserTestData> data = new ArrayList<UserTestData>(); 
//		for(int i=0;i<10;i++) {
//			UserTestData user = new UserTestData();
//			user.setName(randomString(8));
//			user.setEmail(randomString(8)+"@gmail.com");
//			user.setPhone(randomnum(10));
//			user.setPan(randomString(4)+randomNum(4));
//			user.setAadhar(randomNum(12));
//			
//			data.add(user);
//			
//		}
//
//		data.forEach(userdata -> {
//			System.out.println("Name: "+userdata.getName());
//		});
//	}

}
