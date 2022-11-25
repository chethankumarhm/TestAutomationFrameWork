package Meesho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rivision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Actions action =new Actions(driver);
		List<WebElement> radio=driver.findElements(By.xpath("//a[@href='/books']/../../li/a"));
		for(int i=0;i<=radio.size()-15;i++) {
			Thread.sleep(2000);
	    action.moveToElement(radio.get(i)).build().perform();
	 
	}
}
}

