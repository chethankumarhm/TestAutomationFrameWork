package basics_assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Alerts_Alloptions_Rightclickbutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		List<WebElement> mutiple_option = driver.findElements(By.xpath("//span[text()='Edit']/../../li/span"));
		for(int i=0;i<=mutiple_option.size()-1;i++) {
			action.contextClick(right_click).build().perform();
			Thread.sleep(2000);
			mutiple_option.get(i).click();
			Thread.sleep(2000);
		    Alert ale=driver.switchTo().alert();
		    ale.accept();
		    }
}
}
