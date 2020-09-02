package PomTetsing.PomTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Browser Started");
		
	}
	
	@Test
	public void startApp() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currenturl =driver.getCurrentUrl();
		Assert.assertTrue(currenturl.contains("auth/login"));//my appliocation loded properly
		System.out.println("Application Loaded");

	}
	

	@Test(dependsOnMethods="startApp")
	public void loginApp() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		boolean admin_status = driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).isDisplayed();
		Assert.assertTrue(admin_status);
		
		System.out.println("Login successfully");
		}
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() {
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).isDisplayed();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='txtPassword']")).isDisplayed());
		
		System.out.println("Logout Successfully");
		
		}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
		
	}

}
