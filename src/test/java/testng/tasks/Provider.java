package testng.tasks;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider extends DynamicDDT2{

	@Test(dataProvider = "Data")
	public void test123(String name, String email, String phone, String pan, String aadhar) {
		System.out.println("Name: " + name+", Email: "+email+", Phone: "+phone+", PAN: "+pan+", Aadhar: "+aadhar);
	}

	@DataProvider
	public Object[][] Data() {
		List<UserTestData> data = new ArrayList<UserTestData>();
		for (int i = 0; i < 10; i++) {
			UserTestData user = new UserTestData();
			user.setName(randomString(8));
			user.setEmail(randomString(8) + "@gmail.com");
			user.setPhone(randomnum(10));
			user.setPan(randomString(4) + randomNum(4));
			user.setAadhar(randomNum(12));

			data.add(user);

		}
		// data.forEach(userdata -> {
		// System.out.println("Name: "+userdata.getName());
		// });
		Object[][] testdata = null;

		// for(int j=0;j<data.size();j++) {
		// String name ;
		// testdata.add(new Object[][] {
		// {data.get(j)}
		// });
		// System.out.println(data.get(j));
		// }
		// data.forEach(userdata -> {
		
		for (UserTestData userdata : data) {
			testdata = new Object[][] { { userdata.getName(), userdata.getEmail(), userdata.getPhone(),
					userdata.getPan(), userdata.getAadhar() } };
		}

		// });
		List<Object[][]> object = new ArrayList<>();
		object.add(testdata);
		return testdata;
	}
	


}
