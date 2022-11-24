package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_Advance_Search_Page extends Utility_Methods{
	//constructor
	public DWS_Advance_Search_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	//WebElement
	@FindBy(id="As")
	WebElement checkbox;
	
	@FindBy(id="Cid")
	WebElement category;
	
	@FindBy(id="Isc")
	WebElement checkbox1;
	
	@FindBy(id="Mid")
	WebElement manufacture;
	
	@FindBy(id="Pf")
	WebElement from;
	
	@FindBy(id="Pt")
	WebElement to;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement submit_button;
	
	
	
	
	//Methods
	public void checkbox() {
	clickelement(checkbox);
	}
	
	public void category(String category_value) {
	select_by_VisibleText(category, category_value);
	}
	
	public void checkbox1() {
	clickelement(checkbox1);
	}
	
	public void manufacture(String manufacture_value) {
	select_by_VisibleText(manufacture, manufacture_value);
	}
	
	public void from(String from_value) {
	Enter_value_in_Edit_Field(from, from_value);
	}
	
	public void to(String to_value) {
	Enter_value_in_Edit_Field(to, to_value);
	}
	
	public void submit_button() {
	clickelement(submit_button);
	}
}
