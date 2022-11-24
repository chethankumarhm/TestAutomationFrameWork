package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import FrameWork_utility.Utility_Methods;

public class DWS_Apparel_shoes_Page extends Utility_Methods{
	//constructor
	public DWS_Apparel_shoes_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElements
	@FindBy(xpath="(//img[@alt='Picture of Blue and green Sneaker'])[1]")
	WebElement apparel_shoes_img;
	
	@FindBy(id="add-to-cart-button-28")
	WebElement add_To_cart;
	
	
	//Methods
	public void img_apparel_shoes() {
		clickelement(apparel_shoes_img);
	}
	
	public void add_to_cart() {
		clickelement(add_To_cart);
	}
	
	
	
	
	
	
	
}
