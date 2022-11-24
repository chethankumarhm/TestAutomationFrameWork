package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Driver_Wait__EXPLICITLY_WAIT {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Register']")))).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("CHETHAN");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("KUMAR HM");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chethankumarhmm11@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456789");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='register-button']")))).click();
		String value=driver.findElement(By.xpath("//h1[text()='Register']")).getText();
		if(value.equalsIgnoreCase("Register")) {
			System.out.println("LOGIN Successfully PASS");
		}
}
}
