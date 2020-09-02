package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	DashboardPage dashboard;
	
	public LoginPageTest() throws IOException {
		super();//The super keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the
				//superclass constructor. The most common use of the super keyword is to eliminate the confusion between superclasses 
				//and subclasses that have methods with the same name.
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();// initialization method call from TestBase class
		{
			loginpage = new LoginPage();
			
		}
	}
		
		@Test(priority=1)
		public void loginPageTitleTest() {
			String title = loginpage.validaLoginPageTitle();
			Assert.assertEquals(title,"OrangeHRM");//assert using for validation
			}
		@Test(priority=2)
		public void orangeLogo() {
			boolean flag =loginpage.validateOrangeImage();
			Assert.assertTrue(flag);//if flag is true your assertion will be pass 
		}
		
		
		@Test(priority=3)
		public void loginTest() {
			dashboard = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}

	






