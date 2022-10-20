package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.java.util.jar.pack.Package.File;

public class Railways {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();
		drv.get("https://indianrailways.gov.in/");
		Thread.sleep(2000);

		// ScreenShot Property Learn By Heart
		TakesScreenshot ss = (TakesScreenshot) drv;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File folder = new File("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\Railways.png");
		FileUtils.copyFile(src, folder);
		
		drv.close();

	}

}
