package com.roger.qa.testcsaes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.roger.qa.base.Base;
import com.roger.qa.page.LoginPage;
import com.roger.qa.page.MainURLPage;
import com.roger.qa.page.SignUpPage;
import com.roger.qa.util.DataFromExcel;

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
	
	
	@DataProvider
	public Object[][] getData() throws Exception {
		Object[][] data = DataFromExcel.readDataFromExcel("Login");
		return data;
	}
	
	@Test(dataProvider= "getData")
	public void loginDataTest(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		loginpage.loginData(username,password);
		Thread.sleep(3000);
			
	}
	
	@Test
	public void clickONSignUP() {
		signuppage = loginpage.register();
	}
		
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	
}
