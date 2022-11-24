package TestNg_Basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import FrameWork_utility.Base_Test;

public class Register_TC extends Base_Test{
	
@Test
public void register() {
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("CHETHAN");
	driver.findElement(By.id("LastName")).sendKeys("KUMAR HM");
	driver.findElement(By.name("Email")).sendKeys("chethu123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("9902350966");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("9902350966");
	driver.findElement(By.cssSelector("input[id=register-button]")).click();
}
}
