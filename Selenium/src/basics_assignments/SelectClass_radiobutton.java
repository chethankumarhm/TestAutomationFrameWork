package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_radiobutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/xpath/demo.html");
		WebElement select_car = driver.findElement(By.id("standard_cars"));
		Select a=new Select(select_car);
		a.selectByVisibleText("Jaguar");
		Thread.sleep(3000);
		a.selectByValue("merc");
		Thread.sleep(3000);
		a.selectByIndex(1);
}
}