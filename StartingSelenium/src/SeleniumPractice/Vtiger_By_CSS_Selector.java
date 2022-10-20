package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_By_CSS_Selector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();

		drv.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement wc = drv.findElement(By.cssSelector("input.form-control[name='username']"));
		wc.clear();
		wc.sendKeys("Admin");

		WebElement p = drv.findElement(By.cssSelector("input.form-control[name='password']"));
		p.clear();
		p.sendKeys("Admin@123");
		WebElement col = drv.findElement(By.cssSelector("button.btn[type='submit']"));
		System.out.println("color code of signup :" + col.getCssValue("color"));
		System.out.println("background code :" + col.getCssValue("background-color"));

		WebElement fp = drv.findElement(By.xpath("//a[contains(text(),'Forgot Password ?')]"));
		System.out.println("forgotPass color code :" + fp.getCssValue("color"));
		System.out.println("forgotPass background :" + fp.getCssValue("background-color"));
		System.out.println("forgot deco :" + fp.getCssValue("text-decoration"));

	}

}
