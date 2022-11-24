package basics_assignments;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;


public class revision {
//public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	//driver.get("https://www.google.com");
	//driver.manage().window().maximize();
	//driver.navigate().to("https://www.makemytrip.com");
	//driver.navigate().back();
	//Thread.sleep(5000);
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//Thread.sleep(5000);
	//driver.close();
	
	/*public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("CHETHAN");
		 driver.findElement(By.id("LastName")).sendKeys("MANOJ");
		// driver.close();
}
}*/
	
	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("CHETHAN KUMAR HM");
		driver.findElement(By.id("LastName")).sendKeys("MANOJ KUMAR HM");
		driver.findElement(By.id("Email")).sendKeys("chethankumarhmm@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("9731745988");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("9731745988");
		driver.findElement(By.id("register-button")).click();
	}
}*/
	
	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("books");
		
	}
}*/
	
//	public static void main(String[] args) {
//		String Expectedvalue = "Your registration completed";
//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.className("ico-register")).click();
//		driver.findElement(By.name("Gender")).click();
//		driver.findElement(By.name("FirstName")).sendKeys("chethan");
//		driver.findElement(By.id("LastName")).sendKeys("kumar");
//		driver.findElement(By.name("Email")).sendKeys("chethann621@gmail.com");
//		driver.findElement(By.name("Password")).sendKeys("123456789");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
//		driver.findElement(By.id("register-button")).click();
//		String actualvalue = driver.findElement(By.className("result")).getText();
//		System.out.println(actualvalue);
//		if(actualvalue.equalsIgnoreCase(Expectedvalue)) {
//			System.out.println("succefully registered");
//		}
//		else {
//			System.out.println("unsuccessfully registered");
//		}
//	}
//}
		
//	

//public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.navigate().to("https://demowebshop.tricentis.com/");
//	String parent_window = driver.getWindowHandle();
//	WebElement computer= driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
//	Actions action=new Actions(driver);
//	Thread.sleep(3000);
//	action.moveToElement(computer).build().perform();
//	Thread.sleep(3000);
//	action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().perform();
//	action.moveToElement(driver.findElement(By.xpath("//img[@alt=\"Tricentis Demo Web Shop\"]"))).click().perform();
//	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
//	Thread.sleep(2000);
//	Set<String> total_windows = driver.getWindowHandles();
//	for(String child_windows:total_windows) {
//		driver.switchTo().window(child_windows);
//		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@123.gmail.com");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456789");
//			Thread.sleep(2000);
//			driver.close();
//		}
//	}
//	driver.switchTo().window(parent_window);
//	Thread.sleep(3000);
//	driver.close();
//		
//}
//}
	
	
	
	
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://demowebshop.tricentis.com/");
//		WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
//		Actions action=new Actions(driver);
//		List<WebElement> options = driver.findElements(By.xpath("//a[@href='/desktops']/../../../ul/li/a"));
//		for(int i=0;i<=options.size()-1;i++) {
//			action.moveToElement(computer).perform();
//			Thread.sleep(2000);
//			List<WebElement> a=options;
//			action.moveToElement(a.get(i)).click().perform();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			
//		}
//	}
//}
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		List<WebElement> options=driver.findElements(By.xpath("//label[text()='Excellent']"));
		
		}
}
	
