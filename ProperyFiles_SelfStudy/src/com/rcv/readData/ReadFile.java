package com.rcv.readData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileReader fr =new FileReader("E:\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\readFile.properties");
		
		Properties p =new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("Result"));
		System.out.println(p.getProperty("College"));
		System.out.println(System.getProperty("user.dir"));
	}

}
