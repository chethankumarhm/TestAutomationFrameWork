package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_facebook_Page;

public class DWS_facebook_Test extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.get_Test_Data("facebook");
	return data;
}

@Test(dataProvider = "test_data")
public void facebook(String email,String password) {
	DWS_facebook_Page fp=new DWS_facebook_Page(driver);
	fp.Windowhandle(email, password);
}
}
