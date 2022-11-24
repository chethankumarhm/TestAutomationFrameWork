package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class New_multiple_Data_Login extends Base_Test{
		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException {
			Object[][]data=Utility_Methods.get_Test_Data("login");
//			data[1][0]="rohit2@gmail.com";
//			data[1][1]="23456";
//			data[2][0]="chethan2@gmail.com";
//			data[2][1]="123456";
//			data[3][0]="raaju2@gmail.com";
//			data[3][1]="123456";
//			data[4][0]="anand2@gmail.com";
//			data[4][1]="123456"; 
			return data;
		}
		@Test(dataProvider = "Testdata")
		public void login(String Email,String pwd) {
			WebElement login_link = driver.findElement(By.className("ico-login"));
			Utility_Methods.clickelement(login_link);
			WebElement username = driver.findElement(By.id("Email"));
			Utility_Methods.Enter_value_in_Edit_Field(username,Email);
			WebElement password = driver.findElement(By.id("Password"));
			Utility_Methods.Enter_value_in_Edit_Field(password, pwd);
			WebElement submit = driver.findElement(By.cssSelector("input[value='Log in']"));
			Utility_Methods.clickelement(submit);
			WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
			Utility_Methods.clickelement(logout);
			}
		}

