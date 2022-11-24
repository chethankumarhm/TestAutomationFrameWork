package basics_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_FillAllTextFields {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/xpath/demo.html");
		List<WebElement>a=driver.findElements(By.xpath("//input[@type=\"text\"]"));
		for(int i=0;i<=a.size()-1;i++) {
			if(i%2==0) {
			a.get(i).sendKeys("CHETHAN");
            }
			else {
				a.get(i).sendKeys("KUMAR");
			}
	}
}
}
