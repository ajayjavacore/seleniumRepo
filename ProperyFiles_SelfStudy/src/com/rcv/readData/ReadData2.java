package com.rcv.readData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData2 {

	public static void main(String[] args) throws IOException {

		FileReader fr =new FileReader("E:\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\testData.properties");
		
		Properties p =new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("address"));

	}

}
