package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_userlogin {
public static void main(String[] args) {
	String Expectedvalue = "manoj111@gmail.com";
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("manoj111@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456789");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	String Actualvalue=  driver.findElement(By.className("account")).getText();
	if(Actualvalue.equalsIgnoreCase(Expectedvalue)) {
		System.out.println("successfully logged in");
	}
	else {
		System.out.println("not successfully logged in");
	}
	
}
}
