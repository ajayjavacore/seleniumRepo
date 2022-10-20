package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_color_FB {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
		"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver drv =new ChromeDriver();
		
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		drv.get("https://www.facebook.com/");
		
		WebElement color =drv.findElement(By.cssSelector("button._42ft[name='login']"));
		
		System.out.println("Color pf login button is :"+color.getCssValue("color"));
		
		System.out.println("background color is :"+color.getCssValue("background-color"));
	
		System.out.println("font size of login butt :"+color.getCssValue("font-size"));
		
		WebElement forgot =drv.findElement(By.cssSelector("div._6ltj"));
		
		System.out.println("forgot password color :"+forgot.getCssValue("color"));
		System.out.println("font size were :"+forgot.getCssValue("font-size"));
		System.out.println("weight of font were :"+forgot.getCssValue("font-weight"));
		
	}
	

}
