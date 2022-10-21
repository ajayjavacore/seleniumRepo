package com.rcv.readData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWritter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				
				"E:\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\testData.properties", true);

		Properties p = new Properties();
		
		p.setProperty("address", "Pachora Dist-jalgaon");
		p.store(fw, "Please Take the Request");

	}

}
