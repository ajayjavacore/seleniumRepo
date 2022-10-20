package SeleniumPractice;

import java.awt.Button;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_color_OnHRMPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");


		WebDriver drv =new ChromeDriver();
		
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement Button =drv.findElement(By.cssSelector("button.oxd-button[type='submit']"));
        Button.click();		
		System.out.println("get login color :"+Button.getCssValue("color"));
		
		System.out.println("background color is :"+Button.getCssValue("background-color"));
		
	}

}
