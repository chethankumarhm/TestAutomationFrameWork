package basics_assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	String parent_window = driver.getWindowHandle();
	System.out.println(parent_window);
	
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	Thread.sleep(2000);
	Set<String>total_windows=driver.getWindowHandles();
	System.out.println(total_windows);
	for(String child_window:total_windows) {
		System.out.println(child_window);
	System.out.println(driver.switchTo().window(child_window).getTitle());
	if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
		driver.findElement(By.name("email")).sendKeys("abc@test.com");
		Thread.sleep(2000);
		driver.close();
	}
}
	driver.switchTo().window(parent_window);
	driver.close();
}
}
