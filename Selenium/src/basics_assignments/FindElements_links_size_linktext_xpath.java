package basics_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_links_size_linktext_xpath {
	public static void main(String[] args) {
		int k=0;
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement>a=driver.findElements(By.xpath("//a"));
		for(int i=0;i<=a.size()-1;i++) {
			k++;
			System.out.println(a.get(i).getText());
}
		System.out.println();
		System.out.println();
		System.out.println("total number of linktext = "+ k);
		//System.out.println(a.size());   //another method for size
}
}
