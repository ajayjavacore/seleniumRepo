package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_StartWithMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     drv.manage().window().maximize();
     drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     
     
		WebElement w2 =drv.findElement(By.xpath("//input[starts-with(@name,'user')]"));
            w2.sendKeys("Admin");
		WebElement we = drv.findElement(By.xpath("//input[starts-with(@name,'p')]"));
		we.sendKeys("admin123");
		WebElement w1 = drv.findElement(By.xpath("//button[starts-with(@type,'submit')]"));
		w1.click();

	}

}
