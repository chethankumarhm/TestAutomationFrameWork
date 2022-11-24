package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_xpath_Add_to_Cart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Build your own cheap computer'])[2]/../../div/div[2]/input[@value='Add to cart']")).click();
//		driver.findElement(By.id("add-to-cart-button-74")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Shopping cart")).click();
	}
}
