package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class mouse_over extends Base_Test {
	
@Test
public void test2() throws InterruptedException {
	WebElement option = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	Utility_Methods.actions(driver, option).moveToElement(option).build().perform();
	WebElement options = driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[1]"));
	Utility_Methods.actions(driver, options).moveToElement(options).build().perform();
}
}
