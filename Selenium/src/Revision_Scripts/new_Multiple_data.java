package Revision_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class new_Multiple_data {
	@DataProvider(name="testdata")
	public Object[][] Testdata() {
		Object[][] data = new Object[2][2] ;
		data[0][0]="chethankumarhmm@gmail.com";
		data[0][1]="1234156789";
		data[1][0]="manojkumarhmm@gmail.com";
		data[1][1]="123456789";
		
		return data;
		}

	
	@Test(dataProvider="testdata")
	public void testdata(String Email,String pwd) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.close();
		}
	}

