package basics_assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Assg2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> total_window = driver.getWindowHandles();
		for(String child_window:total_window) {
			System.out.println(driver.switchTo().window(child_window).getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		driver.findElement(By.name("q")).sendKeys("abc@test.com");
		Thread.sleep(2000);
		driver.close();
}
}
