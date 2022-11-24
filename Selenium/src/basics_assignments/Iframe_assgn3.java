package basics_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_assgn3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/selenium/xpath/iframe.html");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.switchTo().frame("FR1");  //using attribute id
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
}
}
