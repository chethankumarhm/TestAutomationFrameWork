package pom_testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_RegisterPage;

public class DWS_Register_Test extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.get_Test_Data("Register");
	return data;
}


@Test(dataProvider = "test_data")
public void register(String firstname_value,String lastname_value,String email_value,String password_value,String conformpwd_value) {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.click_register();
	
	
	DWS_RegisterPage rt=new DWS_RegisterPage(driver) ;
	rt.male_radiobutton();
	rt.firstname(firstname_value);
	rt.lastname(lastname_value);
	rt.email(email_value);
	rt.password(password_value);
	rt.confirmpassword(conformpwd_value);
}
}





