package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get("https://www.google.com/");
		Thread.sleep(2000);
		drv.manage().window().maximize();

		TakesScreenshot ss = (TakesScreenshot) drv;
		File source = ss.getScreenshotAs(OutputType.FILE);

		File folder = new File("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\google.png");
		FileUtils.copyFile(source, folder);
		drv.close();

	}

}
