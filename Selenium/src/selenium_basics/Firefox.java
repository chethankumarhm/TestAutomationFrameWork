package selenium_basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();			//launch the browser
		
		driver.get("https://www.google.com");
		driver.get("https://www.bookmyshow.com");		//navigate to website through browser
	
	
		driver.manage().window().maximize();	//maximize the browser screen
	}
	}

