package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/selenium/xpath/xpath1.html");
	driver.findElement(By.xpath("//input[1]")).sendKeys("CHETHAN");
	driver.findElement(By.xpath("//input[2]")).sendKeys("KUMAR HM");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("TEST YANTRA");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("BASAVANAGUDI");
}
}
