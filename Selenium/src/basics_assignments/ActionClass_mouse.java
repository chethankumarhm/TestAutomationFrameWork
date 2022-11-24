package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_mouse {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	Actions a=new Actions (driver);
	a.moveToElement(electronics).build().perform();
}
}

