package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_jewelryPage;

public class DWS_JeewlryPage extends Base_Test{
@DataProvider(name="test_data")
public Object[][] test_data() throws IOException{
	Object[][] data =Utility_Methods.get_Test_Data("jewelry");
	return data;
}


@Test(dataProvider = "test_data")
public void jewelery(String sort_value,String display_value,String View_As_value) {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.jewelry();
	
	
	DWS_jewelryPage jp=new DWS_jewelryPage(driver);
	jp.sort(sort_value);
	jp.display(display_value);
	jp.View_As(View_As_value);
	}
}



