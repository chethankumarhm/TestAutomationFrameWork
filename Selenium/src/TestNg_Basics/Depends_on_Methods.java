package TestNg_Basics;

import org.testng.annotations.Test;

public class Depends_on_Methods {
	
@Test(dependsOnMethods="register")
public void login() {
	System.out.println("Executing Login testcase");
}

@Test
public void register() {
	System.out.println("Executing Register testcase");
}

@Test(dependsOnMethods="search")
public void wishlist() {
	System.out.println("Executing wishlist testcase");
}

@Test(dependsOnMethods="login")
public void search() {
	System.out.println("Executing search testcase");
}

@Test(dependsOnMethods="wishlist")
public void logout() {
	System.out.println("Executing logout testcase");
}
}
