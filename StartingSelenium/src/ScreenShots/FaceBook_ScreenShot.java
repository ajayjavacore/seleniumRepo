package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",

				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get("https://www.facebook.com/login/");
		drv.manage().window().maximize();

		Thread.sleep(2000);

		TakesScreenshot ss = (TakesScreenshot) drv;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Folder = new File("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\Facebook.png");
		FileUtils.copyFile(source, Folder);
		drv.close();

	}
}
