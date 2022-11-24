package pom_pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_facebook_Page extends Utility_Methods{
    //constructor
	public DWS_facebook_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	
	//WebElement
	@FindBy(xpath="//input[@name='email']")
	WebElement facebook_login;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement facebook_password;
	
	@FindBy(linkText="Facebook")
	WebElement facebook;
	
	
	//Methods
		public void Windowhandle(String email,String password) {
		String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> total_window = driver.getWindowHandles();
		for(String child_window:total_window) {
			System.out.println(driver.switchTo().window(child_window).getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				Enter_value_in_Edit_Field(facebook_login, email);
				Enter_value_in_Edit_Field(facebook_password,password);
				driver.close();
		}
	}
		driver.switchTo().window(parent_window);
	}
	
	
	
}
