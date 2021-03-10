package com.roger.qa.testcsaes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roger.qa.base.Base;
import com.roger.qa.page.LoginPage;
import com.roger.qa.page.MainURLPage;
import com.roger.qa.page.SignUpPage;

public class LoginPageTest extends Base{
	MainURLPage mainURlpage;
	LoginPage loginpage;
	SignUpPage signuppage;
	
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		mainURlpage = new MainURLPage();
		Thread.sleep(3000);
		loginpage = mainURlpage.ClickonSignIn();
	}
	
	@Test
	public void validateLoginpageTitle() throws InterruptedException {
		Thread.sleep(3000);
		String loginTitile = loginpage.validateLoginPageTitle();
		Assert.assertEquals(loginTitile, "MyRogers | Sign in");	
	}	
	@Test
	public void clickonRegister() throws InterruptedException {
		Thread.sleep(3000);
		signuppage=loginpage.clickONSignUP();
		Thread.sleep(30000);
		//return new SignUpPage();
	}
	
		
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	
}
