package PomTetsing.PomTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.scalatest.tagobjects.ChromeBrowser;
import org.testng.annotations.Test;

public class SeleniumWebdriverTest {
		
		public String baseUrl = "https://www.google.com/";
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		public WebDriver driver;
		
		@Test
		public void verifyGooglepage() {
			System.out.println("Launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(baseUrl);
	}
}


