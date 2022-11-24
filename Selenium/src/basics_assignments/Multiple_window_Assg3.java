package basics_assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window_Assg3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/cheth/AppData/Local/Packages/microsoft.windowscommunicationsapps_8wekyb3d8bbwe/LocalState/Files/S0/3/Attachments/MultipleWindow[129].html");
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		Set<String>total_windows = driver.getWindowHandles();
		for(String child_windows:total_windows) {
			driver.switchTo().window(child_windows);
			if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
			driver.close();
		}
}
}
}
