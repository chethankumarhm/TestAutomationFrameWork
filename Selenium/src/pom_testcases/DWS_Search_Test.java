package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_SearchPage;

public class DWS_Search_Test extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.get_Test_Data("Searchbox");
	return data;
}

@Test(dataProvider = "test_data")
public void serach_test(String search_value) {
	DWS_SearchPage sp=new DWS_SearchPage(driver);
	sp.Seachbox(search_value);
	sp.search_button();
}




}
