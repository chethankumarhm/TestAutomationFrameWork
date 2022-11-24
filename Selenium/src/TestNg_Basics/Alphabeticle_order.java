package TestNg_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alphabeticle_order {
@BeforeMethod
public void Beforemethod() {
	System.out.println("Executing BeforeMethod");
}
@BeforeClass
public void Beforeclass() {
	System.out.println("Executing Beforeclass");
}
@BeforeTest
public void Beforetest() {
	System.out.println("Executing BeforeTest");
}
@BeforeSuite
public void Beforesuite(){
	System.out.println("Executing BeforeSuit");
}
@Test
public void medicalshop() {
	System.out.println("Welcome to medicalshop");
}
@Test
public void busstop() {
	System.out.println("Welcome to busstop");
}
@Test
public void autostand() {
	System.out.println("Welcome to autostand");
}
@Test
public void taxistand() {
	System.out.println("Welcome to taxistand");
}
@AfterSuite
public void Aftersuite() {
	System.out.println("Executing AfterSuit");
}
@AfterTest
public void aftertest() {
	System.out.println("Executing AfterTest");
}
@AfterClass
public void AfterClass() {
	System.out.println("Executing Afterclass");
}
@AfterMethod
public void Aftermethod() {
	System.out.println("Executing Aftermethod");
}
}
 