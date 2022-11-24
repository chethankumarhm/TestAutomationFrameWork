package basics_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_console {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	String a = driver.findElement(By.linkText("Register")).getText();
	System.out.println(a);
	String b = driver.findElement(By.linkText("Log in")).getText();
	System.out.println(b);
	String c = driver.findElement(By.className("cart-label")).getText();
	System.out.println(c);
	String d = driver.findElement(By.linkText("Wishlist")).getText();
	System.out.println(d);
	String e = driver.findElement(By.linkText("Books")).getText();
	System.out.println(e);
}
}
