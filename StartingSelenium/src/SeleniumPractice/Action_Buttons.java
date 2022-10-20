package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Buttons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
 "E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demoqa.com/buttons");
		Thread.sleep(1000);
		
		Actions act =new Actions(d);
		
		WebElement rightclick =d.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();;
		Thread.sleep(1000);
		
		WebElement doubleclick = d.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).perform();;
		Thread.sleep(1000);
		
		d.close();
		
	}

}
