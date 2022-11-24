package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Mouseover_Computer_Notebook extends Base_Test{
@Test
public void computer_notebook() {
	DWS_HomePage hp=new DWS_HomePage(driver) ;
	hp.computer_notebook();
}
}
