package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page Factory-Object Repository:-all these variable will initialize with driver
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
	
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")    
	WebElement Forgot_your_password;
	
	@FindBy(xpath=" //div[@id='divLogo']//img")
	WebElement OrangeLogo;
	
	
	//initialize the page objects
	public LoginPage() throws IOException {
		PageFactory.initElements(driver,this);//this mean is pointing to the current class object
	}
	
	//Action mean different features which are available i my logun page
	public String validaLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateOrangeImage() {
		return OrangeLogo.isDisplayed();//it is available get true thats why using boolean value
	}
	  /*in page object model dont be required driver.find element this
     eqivalent to @Find
                        */

	
	public DashboardPage login(String un, String pwd) {
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);       
		login.click();
		return new DashboardPage();//aftere login to land to home page thats why using return as a homePage
		
	}

	
	

}
