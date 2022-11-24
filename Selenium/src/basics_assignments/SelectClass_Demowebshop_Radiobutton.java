package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Demowebshop_Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		WebElement sel = driver.findElement(By.id("products-orderby"));
		Select a=new Select(sel);
		a.selectByVisibleText("Name: Z to A");		//selectbyVisibleText()
		Thread.sleep(2000);
		
		
		WebElement select = driver.findElement(By.id("products-pagesize"));	
		Select b=new Select(select);
		b.selectByIndex(2);							//selectbyIndex()
		Thread.sleep(2000);
		
		
		WebElement select1 = driver.findElement(By.id("products-viewmode"));
		Select c=new Select(select1);
		c.selectByIndex(1);							//selectbyIndex()
		Thread.sleep(2000);
		driver.quit();	
}
}
