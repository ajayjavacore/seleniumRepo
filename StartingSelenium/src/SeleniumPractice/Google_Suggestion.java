package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Suggestion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				 "E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv =new ChromeDriver();
		drv.manage().window().maximize();
		
		drv.get("https://www.google.com");
		drv.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		drv.findElement(By.name("q")).sendKeys("selenium");
		 List<WebElement> suggList = drv.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child >span"));
		 
	      System.out.println("Suggestion count from list :"+suggList.size());
		 WebElement Fl =suggList.get(1);
		 System.out.println("name oof First Suggestion :"+Fl.getText());
		 
		 for(int i=0;i<suggList.size();i++) {
			 System.out.println(suggList.get(i).getText());
		 }
	}

}
