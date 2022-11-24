package TestNg_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_PropertyFile {
@Test
public void PropertyDemo() throws IOException {
	String filepaths="./Test_Configeration/TestConfigeration.proprties";
	FileInputStream fis=new FileInputStream(filepaths);
	
	//Creating an object for Properties class
	Properties pros=new Properties();
	pros.load(fis);
	System.out.println(pros.get("Firstname"));
	System.out.println(pros.get("Lastname"));
}
}
