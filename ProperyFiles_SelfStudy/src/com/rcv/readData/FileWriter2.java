package com.rcv.readData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWriter2 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				"E:\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\FileReader2.properties");

		Properties p = new Properties();
		p.setProperty("Aims", "To Became Sr.Tester");
		
		p.store(fw, "Accept the request");

	}

}
