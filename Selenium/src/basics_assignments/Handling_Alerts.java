package basics_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement dobble_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	Actions action=new Actions(driver);
	action.doubleClick(dobble_click).build().perform();
	Alert ale=driver.switchTo().alert();
	ale.accept();
}
}
