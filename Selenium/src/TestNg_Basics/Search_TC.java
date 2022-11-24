package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class Search_TC extends Base_Test{
		
@Test
public void Search() {
	driver.findElement(By.id("small-searchterms")).sendKeys("COMPUTER");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}
