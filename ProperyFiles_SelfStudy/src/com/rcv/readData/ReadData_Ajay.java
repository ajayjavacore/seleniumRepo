package com.rcv.readData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData_Ajay {

	public static void main(String[] args) throws IOException {
		
		// Step 1:To create an object of file reader class
FileReader fr = new FileReader("E:\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\testData.properties");

/*
 * Method 2: By using Input method
 * only we have to create an FileInputStream class instead of FileReader class
 * 
 * FileInputStream fis =new FileInputStream("E:\\javaStorage\\ProperyFiles_SelfSt");
 * only this much u have to do
 */


// step 2: Create an object of property class
Properties p = new Properties();

// Step 3: we will load the file
 p.load(fr);

 // Step 4: use get property to get the information of property
System.out.println(p.getProperty("Website"));

// Shortcut to property location 
System.out.println(System.getProperty("user.dir"));
/*
 * instead of writing all location we have just write 
 * (System.getProperty("user.dir")+"\\src\\com\\rcv\\propertyfile\\testData.properties";
 * this  will access to all that we have code in our laptop
 */


	}

}
