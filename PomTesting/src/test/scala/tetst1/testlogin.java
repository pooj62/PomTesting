package tetst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testlogin {
	
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
