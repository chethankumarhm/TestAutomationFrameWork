package basics_assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New_Assgn_PractisePage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	// To automate RADIO BUTTONS
	List<WebElement> radio_button = driver.findElements(By.xpath("//input[@name='radioButton']/../../../fieldset/label/input"));
	for(int i=0;i<=radio_button.size()-1;i++) {
		radio_button.get(i).click();
		Thread.sleep(2000);
	}
	// To Mouseover and click TextField and SendKeys
	WebElement search = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	Actions action=new Actions(driver);
	action.moveToElement(search).click().sendKeys("ind").perform();
	Thread.sleep(2000);
	action.moveToElement(driver.findElement(By.xpath("(//div[text()='India'])[1]"))).click().perform();
	
	
	//To Automate the DROPDOWN options
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select options =new Select(dropdown);
	List<WebElement> a=options.getOptions();
	for(int i=0;i<=a.size()-1;i++) {
		a.get(i).click();
		Thread.sleep(2000);
	}
	
	
	//To automate the Checkbox options
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@id='checkBoxOption1']/../../../fieldset/label/input"));
	for(int i=0;i<=checkbox.size()-1;i++) {
		checkbox.get(i).click();
		Thread.sleep(2000);
	}
	
	//Switch to child Window
	String Parent_window = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[text()='Open Window']")).click();
	Set<String> total_window = driver.getWindowHandles();
	for(String child_window:total_window) {
		String value = (driver.switchTo().window(child_window).getTitle());
		if(value.equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"))
		{
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.close();
		}
	}
	
	//Switch TAB
	driver.switchTo().window(Parent_window);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='opentab']")).click();
	Set<String> total_windows = driver.getWindowHandles();
	for(String child_windows:total_windows) {
		String values = (driver.switchTo().window(child_windows).getTitle());
		if(values.equalsIgnoreCase("Rahul Shetty Academy"));
		Thread.sleep(2000);
	}
	
	//Alert pop=up 
	driver.switchTo().window(Parent_window);
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("CHETHAN");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	Alert alt=driver.switchTo().alert();
	Thread.sleep(2000);
	alt.accept();
	
	//Element Display 
	driver.findElement(By.id("displayed-text")).sendKeys("BOOKS");
	Thread.sleep(2000);
	driver.findElement(By.id("hide-textbox")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("show-textbox")).click();
	action.sendKeys(Keys.PAGE_DOWN).perform();
	
	//Mouse Over and Click button
//	action.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
//	Thread.sleep(2000);
//	action.moveToElement(driver.findElement(By.linkText("Reload"))).click().perform();
//	
	//IFrame 
	action.sendKeys(Keys.PAGE_DOWN).perform();
	action.sendKeys(Keys.PAGE_DOWN).perform();
	action.sendKeys(Keys.PAGE_DOWN).perform();
	driver.switchTo().frame(0);
	driver.findElement(By.className("dropdown-toggle")).click();
	}
}
