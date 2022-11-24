package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_Advance_Search_Page;
import pom_pages.DWS_SearchPage;

public class DWS_Advance_search_Test extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.get_Test_Data("search");
	return data;
}


@Test(dataProvider = "test_data")
public void advancesearch(String value,String category_value,String manufacture_value,String from_value,String to_value) throws IOException{
	//to take screenshot and attack report to html template
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/ExecutionReport1.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(reporter);
	ExtentTest test=reports.createTest("Demo Web Shop REgression");
	
	
	
	
	DWS_SearchPage sp=new DWS_SearchPage(driver);
	sp.Seachbox(value);
	sp.search_button();
	
	
	DWS_Advance_Search_Page as=new DWS_Advance_Search_Page(driver);
	as.checkbox();
	//To capture Screeshot
	test.log(Status.PASS,"AdvanceSearchBox launch successfull");
	test.pass("AdvanceSearch launched").addScreenCaptureFromPath(Utility_Methods.Capture_Screenshot("AdvanceSearch successful"));
	as.category(category_value);
	as.checkbox1();
	as.manufacture(manufacture_value);
	as.from(from_value);
	as.to(to_value);
	as.submit_button();
	reports.flush();
	
	
}

}
