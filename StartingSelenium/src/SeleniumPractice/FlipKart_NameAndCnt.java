package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_NameAndCnt {

	public static void main(String[] args) {

		//String chromed =System.getProperty("user.dir")+".\\Executeable\\chromedriver.exe";
		
System.setProperty("webdriver.chrome.driver",
"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver drv =new ChromeDriver();
		drv.manage().window().maximize();

		
		drv.get("https://www.flipkart.com/");
		drv.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> getting = drv.findElements(By.xpath("//div [@class='xtXmba']"));
		
		System.out.println("printing all in console :"+getting.size());
		
		WebElement view = getting.get(0);
		System.out.println("Getting ele :"+view.getText());
		
		for(int i=0;i<getting.size();i++)
		{
			System.out.println("elements :"+getting.get(i).getText());
		}
	}

}
