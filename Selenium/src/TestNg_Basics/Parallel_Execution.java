package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parallel_Execution {
@Parameters({"URL","value"})
@Test
public void browser(String url,String a) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.findElement(By.id("small-searchterms")).sendKeys(a);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.close();
}
}
