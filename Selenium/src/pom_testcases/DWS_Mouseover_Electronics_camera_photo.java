package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Mouseover_Electronics_camera_photo extends Base_Test{
@Test
public void electronics() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.electronics_camera_photo();
}
}
