package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute_method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	String a = driver.findElement(By.linkText("Register")).getAttribute("class");
	System.out.println(a);
	String b= driver.findElement(By.id("small-searchterms")).getAttribute("class");
	System.out.println(b);
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	String c = driver.findElement(By.id("small-searchterms")).getAttribute("class");
	System.out.println(c);
}
}
