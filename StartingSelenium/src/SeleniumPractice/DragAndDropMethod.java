package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
 "E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv =new ChromeDriver();
		drv.manage().window().maximize();
		
drv.get("https://demoqa.com/droppable/");
Thread.sleep(1000);

Actions act = new Actions(drv);

	WebElement  drag  = drv.findElement(By.id("draggable"));
	Thread.sleep(1000);
	
	WebElement drop =drv.findElement(By.id("droppable"));
	
	act.dragAndDrop(drag, drop).perform();
	
	drv.close();
	
		
	}

}
