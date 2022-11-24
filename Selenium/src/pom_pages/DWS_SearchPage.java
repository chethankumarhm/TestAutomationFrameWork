package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_SearchPage extends Utility_Methods{

	//constructor
	public DWS_SearchPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	
	
	//WebElements
	@FindBy(id="small-searchterms")
	WebElement searchbox;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement search_button;
	
	
	
	//Methods
	public void Seachbox(String search_value) {
		Enter_value_in_Edit_Field(searchbox,search_value );
	}
	
	public void search_button() {
		clickelement(search_button);
	}
}
