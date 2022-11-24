package Revision_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Revision_Base.Base_Class;

public class computers extends Base_Class{
@Test
	public void testcase2(){
	WebElement option=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(option).build().perform();	
	action.moveToElement(driver.findElement(By.xpath("(//a[@href='/accessories'])[1]"))).click().perform();
}

@Test
public void register() {
	System.out.println("Execution of register");
}

@Test
public void login() {
	System.out.println("Execution of login");
}
}
