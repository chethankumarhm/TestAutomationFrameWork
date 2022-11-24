package basics_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_buttons_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement>buttons=driver.findElements(By.xpath("//input[@type='button']"));
		for(int i=0;i<=buttons.size()-1;i++) {
			System.out.println(buttons.get(i).getAttribute("value"));
		}
}
}