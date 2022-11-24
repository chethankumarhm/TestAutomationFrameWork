package basics_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");	//launch the browser
	driver.manage().window().maximize();	//maximize the browser screen
}
}
