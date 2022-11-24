package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare_actual_expected {
	public static void main(String[] args) {
		String Expectedvalue = "Your registration completed";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("manoj");
		driver.findElement(By.id("LastName")).sendKeys("kumar");
		driver.findElement(By.name("Email")).sendKeys("manoj456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		driver.findElement(By.id("register-button")).click();
		String Actualvalue = driver.findElement(By.className("result")).getText();
		if(Actualvalue.equalsIgnoreCase(Expectedvalue)) {
			System.out.println("successfully registered");
		}
		else {
			System.out.println("unsuccessfully registered");
		}
	}
}


