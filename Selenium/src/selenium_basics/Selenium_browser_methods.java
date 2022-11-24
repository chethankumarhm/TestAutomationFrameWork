package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_browser_methods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();			//launch the browser
	
	driver.get("https://www.google.com");	
	//driver.get("https://www.bookmyshow.com");		//navigate to website through browser
	//driver.get("https://www.facebook.com");
	
	
	driver.manage().window().maximize();	//maximize the browser screen
	
}
}

