package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_HomePage;

public class DWS_Subscribe_Test extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
Object[][] data=Utility_Methods.get_Test_Data("subscribe");
return data;
}


@Test(dataProvider = "test_data")
public void subscribe(String value) {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.subscribe_box(value);
	hp.subscribe_button();
}
}

