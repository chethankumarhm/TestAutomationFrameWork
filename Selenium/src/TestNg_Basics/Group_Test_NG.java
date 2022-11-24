package TestNg_Basics;

import org.testng.annotations.Test;

public class Group_Test_NG {
	
	@Test(groups = "Smoke Test",priority=1)
	public void register() {
		System.out.println("Executing Register testcase");
	}
	
	@Test(groups = "Smoke Test",priority=2)
	public void login() {
		System.out.println("Executing Login testcase");
	}

	@Test
	public void logout() {
		System.out.println("Executing logout testcase");
	}	
}
