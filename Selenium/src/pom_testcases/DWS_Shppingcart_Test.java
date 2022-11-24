package pom_testcases;


import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import pom_pages.DWS_Apparel_shoes_Page;
import pom_pages.DWS_HomePage;

public class DWS_Shppingcart_Test extends Base_Test{
	@Test
	public void shopping_cart() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.apparel_shoes();
	
	DWS_Apparel_shoes_Page as=new DWS_Apparel_shoes_Page(driver);
	as.img_apparel_shoes();
	as.add_to_cart();

	}	
	}
	
