package TestNg_Basics;

import org.testng.annotations.Test;

public class Group_Test1 {
	@Test
	public void wishlist() {
		System.out.println("Executing wishlist testcase");
	}

	@Test(groups = "Smoke Test",priority=3)
	public void search() {
		System.out.println("Executing search testcase");
	}

	@Test
	public void addtocart() {
		System.out.println("Exwcuting addtocart testcase");
	}
}
