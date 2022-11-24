package Revision_Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_sheets {
@Test
public void Excel_sheet_Testdata() throws IOException {
	String filepath="./Test_Data/Test_Data.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook book=new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
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
	}
}

