package TestNg_Basics;

import org.testng.annotations.Test;

public class Priority_method {
	@Test(priority=2)
	public void login() {
		System.out.println("Executing Login testcase");
	}

	@Test(priority=1)
	public void register() {
		System.out.println("Executing Register testcase");
	}

	@Test(priority=4)
	public void wishlist() {
		System.out.println("Executing wishlist testcase");
	}

	@Test(priority=3)
	public void search() {
		System.out.println("Executing search testcase");
	}

	@Test(priority=5)
	public void logout() {
		System.out.println("Executing logout testcase");
	}	
	

}
