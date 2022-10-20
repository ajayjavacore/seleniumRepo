package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\software\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver dv = new ChromeDriver();

		dv.manage().window().maximize();

		dv.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062117%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwj7CZBhDHARIsAPPWv3dzWqS0IYyFAPemdD_HK_WcRah0PscKejxfCC_Q5IiwY29YuQp7K9caAppsEALw_wcB");

		// Is Displayed Method----->
		boolean disp = dv.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']")).isDisplayed();

		if (disp == true) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}

		// Is_Enabled Link------>
		boolean enab = dv.findElement(By.xpath("//a[@class='_9bq5']")).isEnabled();

		if (enab == true) {
			System.out.println("link is Enabled");
		} else {
			System.out.println("link is not ed");
		}

// Is_Selected
		dv.findElement(By.xpath("//input[@class='_8esa']")).click();
		// This xpath is for clicking on radio button

		boolean sel = dv.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
// This is for displaying the boolean answer true/false

		if (sel == true) {
			System.out.println("click button is Selected");
		} else {
			System.out.println("click button is not Selected");
		}

		dv.close();
	}

}
