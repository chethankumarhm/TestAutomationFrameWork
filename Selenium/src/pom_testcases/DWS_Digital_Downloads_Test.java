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
import pom_pages.DWS_Digital_Downloads_Page;
import pom_pages.DWS_HomePage;

public class DWS_Digital_Downloads_Test extends Base_Test{
	@DataProvider(name="test_data")
	public Object[][] testdata() throws IOException{
		Object[][] data =Utility_Methods.get_Test_Data("sortby");
		return data;
	}
	
	
	@Test(dataProvider = "test_data")
	public void digital_downloads(String sortby_value) throws IOException {
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/ExecutionReport3.html");
	ExtentReports reports = new ExtentReports();
	reports.attachReporter(reporter);
	ExtentTest test=reports.createTest("Demo Web Shop Regression");
		
	
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.digital_downloads();
	test.log(Status.PASS,"Digital_downloads LAunched succefully");	
	test.pass("Digital_downloads Launched").addScreenCaptureFromPath(Utility_Methods.Capture_Screenshot("Digital_downloads_DWS"));
	
	DWS_Digital_Downloads_Page dd=new DWS_Digital_Downloads_Page(driver);
	dd.sortby(sortby_value);
	dd.add_to_cart();
	
	
	reports.flush();
	}
	}

