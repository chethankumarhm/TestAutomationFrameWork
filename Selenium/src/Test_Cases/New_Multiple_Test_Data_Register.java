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

public class New_Multiple_Test_Data_Register extends Base_Test {
	@DataProvider(name="Testdata")
	public Object[][] test_data() throws IOException{
		Object[][] data=Utility_Methods.get_Test_Data("register");
//		data[0][0]="Manoj";
//		data[0][1]="Kumar Hm";
//		data[0][2]="manoj2@gmail.com";
//		data[0][3]="123456";
//		data[0][4]="123456";
//		data[1][0]="Rohit";
//		data[1][1]="Patil";
//		data[1][2]="rohit2@gmail.com";
//		data[1][3]="23456";
//		data[1][4]="23456";
//		data[2][0]="Chethan";
//		data[2][1]="Patil";
//		data[2][2]="chethan2@gmail.com";
//		data[2][3]="123456";
//		data[2][4]="123456";
//		data[3][0]="Raaju";
//		data[3][1]="Joshi";
//		data[3][2]="raaju2@gmail.com";
//		data[3][3]="123456";
//		data[3][4]="123456";
//		data[4][0]="Anand";
//		data[4][1]="Jiral";
//		data[4][2]="anand2@gmail.com";
//		data[4][3]="123456";
//		data[4][4]="123456";    
			
		return data;
	}
	@Test(dataProvider = "Testdata")
	public void register(String firstname,String lastname,String email,String pwd,String cpwd) {
		WebElement register = driver.findElement(By.className("ico-register"));
		Utility_Methods.clickelement(register);
		WebElement Firstname = driver.findElement(By.id("FirstName"));
		Utility_Methods.Enter_value_in_Edit_Field(Firstname,firstname );
		WebElement Lastname = driver.findElement(By.id("LastName"));
		Utility_Methods.Enter_value_in_Edit_Field(Lastname, lastname);
		WebElement Email = driver.findElement(By.id("Email"));
		Utility_Methods.Enter_value_in_Edit_Field(Email, email);
		WebElement Password = driver.findElement(By.id("Password"));
		Utility_Methods.Enter_value_in_Edit_Field(Password, pwd);
		WebElement Conform_Password = driver.findElement(By.id("ConfirmPassword"));
		Utility_Methods.Enter_value_in_Edit_Field(Conform_Password, cpwd);
		WebElement Register_button = driver.findElement(By.id("register-button"));
		Utility_Methods.clickelement(Register_button);
//		WebElement clickDemo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//		Utility_Methods.clickelement(clickDemo);
	}
	}

