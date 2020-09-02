package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase extends TestUtil{
	
	public static WebDriver driver;//global variable
	public static Properties prop;//global variable
	
	public TestBase() throws IOException {//constructor
		
		try {
			 prop = new Properties();
			 
			 FileInputStream ip= new FileInputStream("C:\\Users\\91953\\git\\PomTesting\\PomTesting\\src\\main\\scala\\com\\crm\\qa\\"
			 		+ "config\\config.properties.exe");
			 prop.load(ip);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.IE.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
