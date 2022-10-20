package SeleniumPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Contain2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://telisahusamaj.in/");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement teli = drv.findElement(By.xpath("//a[contains (text(),'(Blogs)')]"));

		System.out.println("color of Blogs :" + teli.getCssValue("color"));
		System.out.println("background :" + teli.getCssValue("background-color"));
		System.out.println("font color :" + teli.getCssValue("border-color"));
	}

}
