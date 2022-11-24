package TestNg_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
@DataProvider(name="TestData")
public Object[][] testdata(){
	Object[][] data =new Object[6][2];
	data[0][0]="Chethan";
	data[0][1]="Kumar HM";
	data[1][0]="Manoj";
	data[1][1]="Kumar HM";
	data[2][0]="Karthik";
	data[2][1]="Kumar HM";
	data[3][0]="Mohan";
	data[3][1]="Kumar HM";
	data[4][0]="Rohit";
	data[4][1]="Kumar HM";
	data[5][0]="Lohit";
	data[5][1]="Kumar HM";
	
	return data;
	}

@Test(dataProvider="TestData")
public void TestDataDemo(String Firstname,String Lastname) {
	System.out.println(Firstname);
	System.out.println(Lastname);
}
}
