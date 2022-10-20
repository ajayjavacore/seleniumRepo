package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_HardType {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		drv.get("https://www.amazon.in/gp/browse.html?node=3704982031&ref_=nav_em_sbc_gc_all_0_2_19_2");
		drv.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		WebElement wc = drv.findElement(By.xpath("//li[span[a[span[text()='Anniversary']]]]//input"));

		wc.click();
		drv.close();

	}

}
