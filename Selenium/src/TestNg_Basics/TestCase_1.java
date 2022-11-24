package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class TestCase_1 extends Base_Test{
	
@Test
public void test() {
	driver.findElement(By.id("small-searchterms")).sendKeys("BOOKS");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	driver.findElement(By.xpath("(//input[@id='As'])[1]")).click();
	WebElement book = driver.findElement(By.xpath("(//select[@id='Cid'])[1]"));
	Select option=new Select(book);
	option.selectByIndex(2);
	WebElement manufacture = driver.findElement(By.xpath("(//select[@id='Mid'])[1]"));
	Select options=new Select(manufacture);
	options.selectByIndex(1);
	driver.findElement(By.xpath("(//input[@id='Pf'])[1]")).sendKeys("100");
	driver.findElement(By.xpath("(//input[@id='Pt'])[1]")).sendKeys("200");
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
}
