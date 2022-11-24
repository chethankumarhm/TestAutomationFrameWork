package FrameWork_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods extends Base_Test{
//utility method for SendKeys
	public static void Enter_value_in_Edit_Field(WebElement element,String value) {
	element.sendKeys(value);
	}
	
	//utility method for click
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	//utility method dropdown_by_index
	public static void select_by_index(WebElement element,int value) {
		Select options=new Select (element);
		options.selectByIndex(value);
		}
	
	//utility method dropdown_by_visibleText
	public static void select_by_VisibleText(WebElement element,String value) {
		Select options=new Select (element);
		options.selectByVisibleText(value);
	}
	
	//utility method by value
	public static void select_by_value(WebElement element,String value) {
		Select options=new Select (element);
		options.selectByValue(value);
	}
	
	//utility method to move to element
	public static Actions actions(WebElement element) {
		Actions action=new Actions(driver);
		return action;
}
	
	
	//Utility method for Test_Configeration parameter
	public static String Test_Configeration() throws IOException {
		String filepath="./Test_Configeration/TestConfigeration.properties";
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		return url;
	}
	
	
	//Utility method for get_TestData
	public static Object[][] get_Test_Data(String sheetname) throws IOException {
		String filepath="./Test_Data/Test_Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheetname);
		int row_count=sheet.getPhysicalNumberOfRows();
		int column_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row_count);
		System.out.println(column_count);
		Object[][] data=new Object[row_count-1][column_count];
		for(int i=1;i<=row_count-1;i++) {
			for(int j=0;j<=column_count-1;j++){
			data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}	
		}
		book.close();
		return data;
		}
		
	
	
	//Utility method to capture_Screenshot
	public static String Capture_Screenshot(String Stepname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./SnapShots/"+Stepname+".png");
		FileHandler.copy(ss,destination);
		String filepath="./SnapShots/"+Stepname+".png";
		
		return "."+filepath;
		}
		
	}
	
	
	
	
	
	
	
	
	

