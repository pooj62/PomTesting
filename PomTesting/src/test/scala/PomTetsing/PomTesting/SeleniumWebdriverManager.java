package PomTetsing.PomTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebdriverManager {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("83.0").setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://mvnrepository.com/search?q=webdriver+manager");
		 driver.close();
		 driver.manage();

	}

}
