package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver dv = new ChromeDriver();
		dv.manage().window().maximize();

		dv.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569888%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569888&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062118%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwj7CZBhDHARIsAPPWv3e_rRDL2fRRPFFmx_2UU0FSlTYlSRoBav6OOew9i4Opavwdgfq9AGAaArRcEALw_wcB");

		WebElement day = dv.findElement(By.xpath("//*[@id='day']"));

		Select sel = new Select(day);
		sel.selectByVisibleText("25");
		Thread.sleep(1000);
			
		

		WebElement mon = dv.findElement(By.xpath("//select[@id='month']"));

		Select sel2 = new Select(mon);
		sel2.selectByValue("7");
		Thread.sleep(1000);

		WebElement yr = dv.findElement(By.xpath("//select[@id='year']"));

		Select sel3 = new Select(yr);
		sel3.selectByVisibleText("1995");
		Thread.sleep(1000);
		
		dv.close();
	}
}
