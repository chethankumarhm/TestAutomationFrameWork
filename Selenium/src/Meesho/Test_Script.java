package Meesho;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class Test_Script extends Base_Test{
@DataProvider(name="test_data")
public Object[][] testdata() throws IOException{
Object[][] data=Utility_Methods.get_Test_Data("Searchbox");
return data;
}
	
	
@Test(dataProvider="test_data")
public void flipkart(String value,String value1,String value2) {
	WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Utility_Methods.Enter_value_in_Edit_Field(search, value);
	Utility_Methods.clickelement(search);
	WebElement move = driver.findElement(By.xpath("//p[text()='mobile']"));
	Utility_Methods.actions(driver, move).moveToElement(move).click().perform();
	WebElement mobile=driver.findElement(By.xpath("(//p[text()=' Feature Phones'])[1]"));
	Utility_Methods.clickelement(mobile);
	WebElement buynow = driver.findElement(By.xpath("//span[text()='Buy Now']"));
	Utility_Methods.clickelement(buynow);
	WebElement mobile_number = driver.findElement(By.xpath("//input[@type='tel']"));
	Utility_Methods.Enter_value_in_Edit_Field(mobile_number, value1);
//	WebElement Continue =driver.findElement(By.xpath("//span[text()='Continue']"));
//	Utility_Methods.clickelement(Continue);
	WebElement send_OTP = driver.findElement(By.xpath("//span[text()='Send OTP']"));
	Utility_Methods.clickelement(send_OTP);
	WebElement OTP = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
	Utility_Methods.Enter_value_in_Edit_Field(OTP, value2);
	WebElement Verify = driver.findElement(By.xpath("//span[text()='Verify']"));
	Utility_Methods.clickelement(Verify);
//	Alert alt=driver.switchTo().alert();
//	alt.accept();
}
}
