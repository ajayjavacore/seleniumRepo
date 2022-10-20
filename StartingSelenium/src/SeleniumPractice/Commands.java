package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) {

		// Browser Setup
		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

// Browser Open
		WebDriver w = new ChromeDriver();

// Browser Management Max Site in full Screen
		w.manage().window().maximize();

// Open URL
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

// names like Title & CurrURL

		String Url = "CurrentUrl is: " + w.getCurrentUrl();
		String Tittl = "Tittle of logo is :" + w.getTitle();
		System.out.println(Url);
		System.out.println(Tittl);

// Find Element-Location & Password

// For Login
		WebElement log = w.findElement(By.id("username"));
		log.sendKeys("Admin");

//For Password
		WebElement pass = w.findElement(By.id("username"));
		pass.sendKeys("admmin123");

// Click Button
		WebElement but = w.findElement(By.id("submit"));
		but.click();

		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

// Xpath element
		boolean d = w.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?1660914792648']")).isDisplayed();

		if (d == true) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo not displayed");
		}

		w.close();

	}

}
