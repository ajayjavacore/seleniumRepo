package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstday {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver dd =new ChromeDriver();
		
		dd.manage().window().maximize();
		
		dd.get("https://WWW.google.com/");
		dd.close();
		dd.navigate().to("https://WWW.google.com/");
		dd.close();
	}
}
