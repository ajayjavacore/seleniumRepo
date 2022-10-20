package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_Keys_Escape {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",

				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();

		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		drv.get("https://www.flipkart.com/");

		drv.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		WebElement w1 = drv.findElement(By.xpath("//input[@class='_3704LK']"));

		w1.sendKeys("Laptop");

		w1.sendKeys(Keys.TAB);

		w1.sendKeys(Keys.ENTER);

		w1.sendKeys(Keys.ESCAPE);

		for (int i = 0; i < 25; i++) {

			w1.sendKeys(Keys.PAGE_DOWN);

			Thread.sleep(3000);
		}

	}

}
