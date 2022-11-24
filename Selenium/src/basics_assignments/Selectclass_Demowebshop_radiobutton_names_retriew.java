package basics_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_Demowebshop_radiobutton_names_retriew {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		WebElement sel = driver.findElement(By.id("products-orderby"));
		//System.out.println(sel.getText());
		Select a=new Select(sel);
		List<WebElement>names=a.getOptions();
		for(int i=0;i<=names.size()-1;i++) {
			System.out.println(names.get(i).getText());
		}
}
}

