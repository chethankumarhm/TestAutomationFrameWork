package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_utility.Utility_Methods;

public class DWS_jewelryPage extends Utility_Methods{
	
	//constructor
	public DWS_jewelryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//WebElements
	@FindBy(id="products-orderby")
	WebElement sortby;
	
	@FindBy(id="products-pagesize")
	WebElement Display; 
	

	@FindBy(id="products-viewmode")
	WebElement View_As; 
	
	
	//Methods   
	public void sort(String sort_value) {
		select_by_VisibleText(sortby, sort_value);
	}
	
	public void display(String display_value) {
		select_by_VisibleText(Display, display_value);
	}
	
	public void View_As(String View_As_value) {
		select_by_VisibleText(View_As, View_As_value);
	}
	
}
