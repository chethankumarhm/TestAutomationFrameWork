package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_LoginPage;

public class DWS_Login_Test extends Base_Test{
	@DataProvider(name="test_data")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_Methods.get_Test_Data("login");
		return data;
	}
	
	
	@Test(dataProvider ="test_data")
	public void Testcase_login(String email,String password) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_login();
		
		DWS_LoginPage lp=new DWS_LoginPage(driver);
		lp.Enter_username(email);
		lp.Enter_password(password);
		lp.Click_login();
	}
}
