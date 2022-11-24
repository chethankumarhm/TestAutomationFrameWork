package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Mouseover_Computer_Assessories_Test extends Base_Test{
@Test
public void computer_Assessories() {
	DWS_HomePage hp=new DWS_HomePage(driver) ;
	hp.computer_Assessories();
}
}
