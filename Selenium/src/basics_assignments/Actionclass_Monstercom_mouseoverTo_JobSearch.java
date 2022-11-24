package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_Monstercom_mouseoverTo_JobSearch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	WebElement jobsearch = driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(jobsearch).build().perform();
	action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Skills')])[1]"))).build().perform();
	Thread.sleep(2000);
	action.moveToElement(driver.findElement((By.xpath("//a[@href='https://www.monsterindia.com/search/java-jobs']")))).build().perform();
}
}
 