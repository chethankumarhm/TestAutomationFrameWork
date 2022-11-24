package basics_assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Register {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sss=ts.getScreenshotAs(OutputType.FILE);					//SS
		File destination=new File("./Screenshots/screenshot1.png");
		FileHandler.copy(sss, destination);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("manoj111@gmail.com");
		
		File ss1=ts.getScreenshotAs(OutputType.FILE);					//SS
		File destination2=new File("./Screenshots/screenshot2.png");
		FileHandler.copy(ss1, destination2);
		
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
		File ss=ts.getScreenshotAs(OutputType.FILE);					//SS
		File destination1=new File("./Screenshots/screenshot3.png");
		FileHandler.copy(ss, destination1);
		
		driver.close();
		
}
}
