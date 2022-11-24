package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import FrameWork_utility.Utility_Methods;

public class New_SearchBox_Multiple_Test_Data extends Base_Test{
		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException{
			Object[][] data=Utility_Methods.get_Test_Data("search");
//			data[0][0]="Books";
//			data[1][0]="Electronics";
//			data[2][0]="Computers";
//			data[3][0]="Apparels";
//			data[4][0]="Jewelry";
			return data;
		}
		@Test(dataProvider = "Testdata")
		public void Search_product(String product) {
			WebElement Product = driver.findElement(By.id("small-searchterms"));
			Utility_Methods.Enter_value_in_Edit_Field(Product, product);
			WebElement Search_button = driver.findElement(By.cssSelector("input[value='Search']"));
			Utility_Methods.clickelement(Search_button);
		}
		}

