package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_Basic_Script {
@Test
public void Demo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demowebshop.tricentis.com");
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}
