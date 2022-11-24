package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class end_to_end_register {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Manjappa");
	driver.findElement(By.id("LastName")).sendKeys("chandramma");
	driver.findElement(By.name("Email")).sendKeys("manjappa123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("9902350966");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("9902350966");
	driver.findElement(By.cssSelector("input[id=register-button]")).click();
}
}
