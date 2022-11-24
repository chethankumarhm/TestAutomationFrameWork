package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_HomePage extends Utility_Methods{
	//constructor
	public DWS_HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}


	
	
	//WebElements
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login_link;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register_link;
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement computer;
	
	@FindBy(xpath="(//a[@href='/accessories'])[1]")
	WebElement assessories;
	
	@FindBy(xpath="(//a[@href='/desktops'])[1]")
	WebElement desktops;
	
	@FindBy(xpath="(//a[@href='/notebooks'])[1]")
	WebElement notebook;
	
	@FindBy(xpath="(//a[@href='/electronics'])[1]")
	WebElement electronics;
	
	@FindBy(xpath="(//a[@href='/camera-photo'])[1]")
	WebElement camera_photo;
	
	@FindBy(xpath="(//a[@href='/jewelry'])[1]")
	WebElement jewelry;
	
	@FindBy(xpath="(//a[@href='/apparel-shoes'])[1]")
	WebElement Apparel_shoes;
	
	@FindBy(id="pollanswers-1")
	WebElement Excellent;
	
	@FindBy(id="vote-poll-1")
	WebElement vote;
	
	@FindBy(xpath="(//a[@href='/digital-downloads'])[1]")
	WebElement digital_downloads;
	
	@FindBy(linkText="Shopping cart")
	WebElement shoppingcart;
	
	@FindBy(id="newsletter-email")
	WebElement subscribe_box;
	
	@FindBy(xpath="//input[@value='Subscribe']")
	WebElement subscribe_button;
	
	
	
	
	
	
	//Method
	public void Click_login() {
		clickelement(login_link);   //using Utility Methods by using extends
	}
	
	public void click_register() {
		clickelement(register_link);
	}
	
	public void computer_Assessories() {
	actions(computer).moveToElement(computer).build().perform();;
	actions(computer).moveToElement(assessories).click().perform();
	}
	
	public void computer_Desktops() {
	actions(computer).moveToElement(computer).build().perform();;
	actions(desktops).moveToElement(desktops).click().perform();
	}
	
	public void computer_notebook() {
	actions(computer).moveToElement(computer).build().perform();;
	actions(notebook).moveToElement(notebook).click().perform();
	}
	
	public void electronics_camera_photo() {
	actions(electronics).moveToElement(electronics).build().perform();;
	actions(camera_photo).moveToElement(camera_photo).click().perform();
	}
	
	public void jewelry() {
	clickelement(jewelry);
	}
	
	public void apparel_shoes() {
	clickelement(Apparel_shoes);
	}
	
	public void excellent() {
	clickelement(Excellent);
	}
	
	public void vote() {
	clickelement(vote);
	}
		
	public void digital_downloads() {
	clickelement(digital_downloads);
	}
	
	public void shoppingcart() {
	clickelement(shoppingcart);
	}
	
	public void subscribe_box(String value) {
	Enter_value_in_Edit_Field(subscribe_box, value);
	}
	
	public void subscribe_button() {
	clickelement(subscribe_button);
	}
	
	
	
}
