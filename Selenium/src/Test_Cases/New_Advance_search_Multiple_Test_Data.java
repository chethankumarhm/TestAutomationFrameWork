package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class New_Advance_search_Multiple_Test_Data extends Base_Test{
	@DataProvider(name="Testdata")
	public Object[][] test_data() throws IOException{
		Object[][] data=Utility_Methods.get_Test_Data("AdvanceSearch");
//		data[0][0]="Books";
//		data[0][1]="150";
//		data[0][2]="300";
//		data[1][0]="Computers";
//		data[2][0]="Shoes";
//		data[3][0]="Apparels";
//		data[4][0]="Jewelry";
		return data;
	}
	@Test(dataProvider = "Testdata")
	public void Search_product(String product,String value1,String value2) {
		WebElement search_box = driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Enter_value_in_Edit_Field(search_box, product);
		WebElement check_box = driver.findElement(By.cssSelector("input[value='Search']"));
		Utility_Methods.clickelement(check_box);
		WebElement check_box1 = driver.findElement(By.id("As"));
		Utility_Methods.clickelement(check_box1);
		WebElement categories=driver.findElement(By.id("Cid"));
		Utility_Methods.select_by_index(categories, 1);
		WebElement manufacture=driver.findElement(By.id("Mid"));
		Utility_Methods.select_by_index(manufacture, 0);
		WebElement from = driver.findElement(By.id("Pf"));
		Utility_Methods.Enter_value_in_Edit_Field(from, value1);
		WebElement to = driver.findElement(By.id("Pt"));
		Utility_Methods.Enter_value_in_Edit_Field(to, value2);
		WebElement check_box2 = driver.findElement(By.id("Sid"));
		Utility_Methods.clickelement(check_box2);
		WebElement serach_button = driver.findElement(By.xpath("(//input[@value='Search'])[2]"));
		Utility_Methods.clickelement(serach_button);
	}
	}
	

