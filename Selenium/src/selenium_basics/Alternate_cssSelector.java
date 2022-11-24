package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternate_cssSelector {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	driver.findElement(By.cssSelector(".ico-register")).click();  // . alternate cssSelector for "class" 
	driver.findElement(By.cssSelector("#gender-male")).click();	  // # alternate cssSelector for "id"
}
}
