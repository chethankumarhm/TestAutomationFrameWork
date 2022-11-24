package basics_assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionClass_Contextclick_rightclick {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot st=(TakesScreenshot)driver;
		File sc=st.getScreenshotAs(OutputType.FILE);
		File destinations=new File("./Screenshots/Screenshot6.png");
		FileHandler.copy(sc, destinations);
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(@class,'context')]"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
		File ss=st.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots/Screenshot7.png");
		FileHandler.copy(ss,destination);
		driver.close();
}
}
