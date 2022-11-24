package TestNg_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_Excel {
@Test
public void exceldemo() throws IOException {
	//File path
	String filepath="./Test_Data/Test_Data.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	
	//Create an object for Excel file
	Workbook book=new XSSFWorkbook(fis);
	
	//Access the sheet
	Sheet sheet=book.getSheet("Sheet1");
	String value=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
