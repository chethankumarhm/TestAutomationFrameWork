package pom_testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;
import pom_pages.DWS_Apparel_shoes_Page;
import pom_pages.DWS_HomePage;

public class DWS_Apparel_Shoes_Test extends Base_Test{
@Test
public void apparel_shoes() throws IOException {
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/ExecutionReport2.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(reporter);
	ExtentTest test=reports.createTest("Demo Web Shop REgression");
	
	
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.apparel_shoes();
	test.log(Status.PASS,"Apparel_shoes launch successfull");
	test.pass("Apparel_shoes_launched").addScreenCaptureFromPath(Utility_Methods.Capture_Screenshot("Apparel_shoes successful"));
	
	
	DWS_Apparel_shoes_Page as=new DWS_Apparel_shoes_Page(driver);
	as.img_apparel_shoes();
	as.add_to_cart();
	reports.flush();
}
}
