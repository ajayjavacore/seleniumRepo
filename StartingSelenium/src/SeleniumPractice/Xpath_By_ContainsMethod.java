package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_ContainsMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",		
	"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver drv =new ChromeDriver();
	drv.get("https://crmaccess.vtiger.com/log-in/");
	drv.manage().window().maximize();
	drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	WebElement col =drv.findElement(By.xpath("//button[contains (text(),'Sign in')]"));
	
	System.out.println("signup btn is :"+col.getCssValue("color"));
	System.out.println("background color :"+col.getCssValue("background-color"));
	System.out.println("border :"+col.getCssValue("border-color"));
	System.out.println("radius :"+col.getCssValue("border-radius"));
	
	}

}
