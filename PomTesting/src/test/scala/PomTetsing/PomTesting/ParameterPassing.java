package PomTetsing.PomTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	
	
	@Test
	@Parameters({"browser","url","emailid","password"})
	public void loginTest(@Optional String browser,String url,String emailid,String password){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		driver.findElement(By.xpath("//input[@placeholder='Password']"));
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
	}

}
