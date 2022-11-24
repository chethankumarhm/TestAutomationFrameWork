package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_xpath_Suggestion_search_DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("compu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='ui-menu-item'])[3]/a[text()='Build your own expensive computer']")).click();
}
}
