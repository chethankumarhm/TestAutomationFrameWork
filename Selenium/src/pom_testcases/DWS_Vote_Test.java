package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Vote_Test extends Base_Test{
@Test
public void vote() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.excellent();
	hp.vote();
}
}
