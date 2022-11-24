package basics_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class End_to_end_login_Books_logout {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("CHETHAN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kumar HM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chethankumarhmm@199.gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chethankumarhmm@199.gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		WebElement select=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sl=new Select(select);
		sl.selectByVisibleText("Name: A to Z");
		List<WebElement>a=driver.findElements(By.xpath("//div[@class='product-grid']//a"));
		for(int i=0;i<=a.size()-1;i++) {
			System.out.println(a.get(i).getText());
		}
	}
}
