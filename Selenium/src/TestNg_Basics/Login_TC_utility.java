package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class Login_TC_utility extends Base_Test{
	
@Test
public void login() {
	WebElement login_link = driver.findElement(By.className("ico-login"));
	//Click_Element(login_link);
	Utility_Methods.clickelement(login_link);
	
	//driver.findElement(By.id("Email")).sendKeys("chethu123@gmail.com");
	WebElement username = driver.findElement(By.id("Email"));
	//Enter_value_in_Edit_Field(username,"chethu123@gmail.com");
	
	//driver.findElement(By.id("Password")).sendKeys("9902350966");
	WebElement password=driver.findElement(By.id("Password"));
	//Enter_value_in_Edit_Field(password,"password");
	
	WebElement submit = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
	//CLick_Element(submit);
	Utility_Methods.clickelement(submit);
}
}
