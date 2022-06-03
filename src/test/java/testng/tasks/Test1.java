package testng.tasks;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;

public class Test1 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			String Name = randomString(8);
			String Email = randomString(8)+"@gmail.com";
			String Phone = randomnum(10);
			String PAN = randomString(4)+randomNum(4);
			String Aadhar = randomNum(12);
			list.add(Name);
			list.add(Email);
			list.add(Phone);
			list.add(PAN);
			list.add(Aadhar);
			System.out.println(list.get(i));
		}
		
		for(int j=0;j<10;j++) {
			System.out.println();
		}
		
//		for(int j=0;j<list.size();j++) {
//			System.out.println(list.get(j)+" ");
//		}
		
//		for(String li :list) {
//			System.out.println(li);
//		}


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
