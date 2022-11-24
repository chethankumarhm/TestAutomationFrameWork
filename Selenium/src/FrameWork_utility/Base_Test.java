package FrameWork_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {

	public static WebDriver driver;
	
@BeforeClass
public void Browser_setup() throws IOException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	String url = Utility_Methods.Test_Configeration();
	driver.navigate().to(url);
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
@AfterClass
public void TearDown() {
	driver.close();
}	
}
