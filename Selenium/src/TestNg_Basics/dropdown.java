package TestNg_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class dropdown extends Base_Test{

	@Test
	public void dropdown() {
		WebElement computers = driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		Utility_Methods.move_to_element(driver, computers);
		WebElement Accessories = driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
		Utility_Methods.move_to_element(driver, Accessories);
		Utility_Methods.clickelement(Accessories);
		WebElement Sort = driver.findElement(By.id("products-orderby"));
		Utility_Methods.select_by_index(Sort, 5);
	}
}
