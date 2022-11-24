package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class mouse_over_on_computers extends Base_Test {
	
@Test
public void test2() throws InterruptedException {
	WebElement option = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(option).build().perform();
	action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[1]"))).click().perform();
}
}
