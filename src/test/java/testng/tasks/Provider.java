package testng.tasks;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Provider extends DynamicDDT2 {

	@Test(dataProvider = "Data")
	public void test123(UserTestData user) {
		System.out.println("Name: " + user.getName() + ", Email: " + user.getEmail() + ", Phone: " + user.getPhone()
				+ ", PAN: " + user.getPan() + ", Aadhar: " + user.getAadhar());
	}
	
	@DataProvider
	public Object[][] Data() {

		List<UserTestData> data = new ArrayList<UserTestData>();

		for (int i = 0; i < 10; i++) {
			data.add(new UserTestData(randomString(8), randomString(8) + "@gmail.com", randomnum(10),
					randomString(4) + randomNum(4), randomNum(12)));

		}

		Object[][] testdata = { { data.get(0) }, { data.get(1) }, { data.get(2) }, { data.get(3) }, { data.get(4) },
				{ data.get(5) }, { data.get(6) }, { data.get(7) }, { data.get(8) }, { data.get(9) } };

		return testdata;
	}

}
