package com.rcv.readData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class fileWrite2 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				"\\javaStorage\\ProperyFiles_SelfStudy\\src\\com\\rcv\\propertyfile\\readFile.properties", true);

		Properties p = new Properties();

		p.setProperty("Stream", "Mechanical Engineering");
		p.setProperty("Sub", "mechanical Vibration");
		p.setProperty("Sir", "V.G.Patil");
		p.store(fw, "Want's to store Some Data");

	}

}
