package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_Digital_Downloads_Page extends Utility_Methods{
    //constructor
	public DWS_Digital_Downloads_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//WebElement
	@FindBy(id="products-orderby")
	WebElement sortby;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement add_to_cart;
	
	
	//Methods
	public void sortby(String sortby_value) {
	select_by_VisibleText(sortby, sortby_value);
	}
	
	public void add_to_cart() {
	clickelement(add_to_cart);
	}
}
