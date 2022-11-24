package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;


public class DWS_RegisterPage extends Utility_Methods{
	
	//constructor
	public DWS_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement
	@FindBy(id="gender-male")
	WebElement male_radiobutton;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	
	
	
	//Methods
	public void male_radiobutton() {
	clickelement(male_radiobutton);
	}
	
	public void firstname(String firstname_value) {
	Enter_value_in_Edit_Field(firstname, firstname_value);
	}
	
	public void lastname(String lastname_value) {
	Enter_value_in_Edit_Field(lastname, lastname_value);
	}
	
	public void email(String email_value) {
	Enter_value_in_Edit_Field(email, email_value);
	}
	
	public void password(String password_value) {
	Enter_value_in_Edit_Field(email, password_value);
	}
	
	public void confirmpassword(String conformpwd_value) {
	Enter_value_in_Edit_Field(confirmpassword, conformpwd_value);
	}
	
	
}
