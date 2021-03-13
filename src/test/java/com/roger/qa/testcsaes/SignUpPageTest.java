package com.roger.qa.testcsaes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roger.qa.base.Base;
import com.roger.qa.page.LoginPage;
import com.roger.qa.page.MainURLPage;
import com.roger.qa.page.SignUpPage;

public class SignUpPageTest extends Base{

	MainURLPage mainURlpage;
	LoginPage loginpage;
	SignUpPage signuppage;
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		Thread.sleep(3000);
		mainURlpage = new MainURLPage();
		Thread.sleep(3000);
		loginpage = mainURlpage.ClickonSignIn();
		loginpage = new LoginPage();
		Thread.sleep(3000);
		signuppage= loginpage.register();
		
	}
	
	
	@Test
	public void validatesignuppageTitleTest() throws InterruptedException {
		Thread.sleep(3000);
		String title = signuppage.validatesignuppageTitle();
		Assert.assertEquals(title, "MyRogers | Register");
		System.out.println("***Title****");
	}
	
	
	@Test
public void emailuserTest() throws InterruptedException {
		Thread.sleep(3000);
		signuppage.email();
		Thread.sleep(3000);
		System.out.println("***User Email****");
	}
	@Test
	public void click() throws InterruptedException {
		Thread.sleep(3000);
		signuppage.clickoncontinue();
		Thread.sleep(30000);
		System.out.println("***Click****");
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}
