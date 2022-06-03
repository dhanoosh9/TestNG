package testng.tasks;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(dataProvider="data")
	public void maines(List<String> Name, List<String> Email, List<String> Phone, List<String> PAN, List<String> Aadhar) {
		for(int i=0;i<10;i++) {
			System.out.println("Name: "+Name.get(i)+",  Email: "+Email.get(i)+",  Phone: "+Phone.get(i)+",  PAN: "+PAN.get(i)+",  Aadhar: "+Aadhar.get(i));
		}
	}
	
	@DataProvider
	public Object[][] data() {
		List<String> Name = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			String name = randomString(8);
			Name.add(name);
		}
		List<String> Email = new ArrayList<String>();
		for(int j=0;j<10;j++) {
			String email = randomString(8)+"@gmail.com";
			Email.add(email);
		}
		List<String> Phone = new ArrayList<String>();
		for(int k=0;k<10;k++) {
			String phone = randomnum(10);
			Phone.add(phone);
		}
		List<String> PAN= new ArrayList<String>();
		for(int l=0;l<10;l++) {
			String pan = randomString(4)+randomNum(4);
			PAN.add(pan);
		}
		List<String> Aadhar = new ArrayList<String>();
		for(int m=0;m<10;m++) {
			String aadhar = randomNum(12);
			Aadhar.add(aadhar);
		}
		return new Object[][] {
			{Name,Email,Phone,PAN,Aadhar}
		};
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
