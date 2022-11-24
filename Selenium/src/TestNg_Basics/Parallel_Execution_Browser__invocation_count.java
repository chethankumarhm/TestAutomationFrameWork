package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution_Browser__invocation_count {
@Test(invocationCount=4,threadPoolSize=4)
public void browser() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.close();
}
}
