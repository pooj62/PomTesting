package ListnersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersDemo.TestNgListner.class)
public class MyFirstTestCase {

	@Test
	public void GoogleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void TitleMatch() {
		
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);//false vlue put bcz title is match so if i put "true" then test will be pass
	}
}
