package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Keyboard_Inputs_for_SearchTextField {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Actions action = new Actions(driver);
		action.moveToElement(input).click().sendKeys("BOOKS").perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
}
}
