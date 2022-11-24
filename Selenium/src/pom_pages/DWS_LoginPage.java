package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_LoginPage extends Utility_Methods{

	//constructor
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElement
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_btn;
	
	
	//METHODS
	public void Enter_username(String email) {
		Enter_value_in_Edit_Field(username, email);
	}
	
	public void Enter_password(String password) {
		Password.sendKeys();
	}
	
	public void Click_login() {
		login_btn.click();
	}
}
