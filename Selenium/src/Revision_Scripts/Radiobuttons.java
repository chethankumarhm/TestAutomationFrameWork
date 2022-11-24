package Revision_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Revision_Base.Base_Class;

public class Radiobuttons extends Base_Class{
@Test 
public void testcase1() throws InterruptedException{
List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@id='pollanswers-1']/../../../ul/li/input"));
for(int i=1;i<=radiobutton.size()-1;i++) {
	radiobutton.get(i).click();
	Thread.sleep(2000);
}
}

@Test
public void logout() {
	System.out.println("Execution of logout");
}
}

