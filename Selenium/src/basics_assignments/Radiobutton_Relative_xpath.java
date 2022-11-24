package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_Relative_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("CHETHAN");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("KUMAR HM");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("KUMAR HM");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chethankumarhmm711@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		
		driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
}
}
