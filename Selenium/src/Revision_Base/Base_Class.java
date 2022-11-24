package Revision_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
public WebDriver driver;

@BeforeClass
public void test_case() {
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://demowebshop.tricentis.com");
driver.manage().window().maximize();	
}

@AfterClass
public void test_case1() {
driver.close();
}
}
