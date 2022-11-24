package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		String a = driver.findElement(By.xpath("//p[contains(text(),'Feel')]")).getText();
		System.out.println(a);
}
}
		//here just writing one word it exicutes complete web element.
		//contains //