package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingcart_login {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.partialLinkText("Shop")).click();
	// driver.close();
	}

}
