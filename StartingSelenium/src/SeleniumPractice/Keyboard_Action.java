package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
 "E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv =new ChromeDriver();
		
		drv.manage().window().maximize();
		
		drv.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		
		WebElement textbox = drv.findElement(By.id("userName"));
		textbox.sendKeys("Ac is on Selenium");

		Thread.sleep(1000);
		textbox.clear();
		
		Actions act =new Actions(drv);
		WebElement textbox1 = drv.findElement(By.id("userName"));
		act.keyDown(Keys.SHIFT).build().perform();
		textbox1.sendKeys("a");
		Thread.sleep(1000);
		
     act.keyUp(Keys.SHIFT).build().perform();
     textbox1.sendKeys("jay");
     Thread.sleep(2000);
     
     act.keyDown(Keys.SHIFT).build().perform();
     textbox1.sendKeys(" @qa");
     Thread.sleep(2000);
     
     drv.close();
	}

}
