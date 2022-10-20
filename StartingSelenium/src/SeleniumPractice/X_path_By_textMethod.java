package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_By_textMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		drv.get("https://www.demoblaze.com/");

		WebElement btn = drv.findElement(By.xpath("//button[text()='Close']"));

		WebElement col = drv.findElement(By.xpath("//button[text()='Log in']"));

		System.out.println("color of signup btn :" + col.getCssValue("color"));
		System.out.println("background color of login btn :" + col.getCssValue("background-color"));
		System.out.println("border of login :" + col.getCssValue("border-color"));

		System.out.println("Close Btn color :" + btn.getCssValue("color"));
		System.out.println("Close btn background :" + btn.getCssValue("background-color"));
		System.out.println("Close btn border :" + btn.getCssValue("border-color"));

	}

}
