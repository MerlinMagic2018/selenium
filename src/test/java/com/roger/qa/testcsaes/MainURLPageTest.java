package com.roger.qa.testcsaes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.roger.qa.base.Base;
import com.roger.qa.page.LoginPage;
import com.roger.qa.page.MainURLPage;

public class MainURLPageTest extends Base{
	MainURLPage mainURlpage;
	LoginPage loginPage;
	
	
	public MainURLPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		 initialization();
		 mainURlpage = new MainURLPage();
		
	}
	@Test(priority=1)
	public void validateMainpageTitleTest() throws InterruptedException {
		Thread.sleep(3000);
		String title = mainURlpage.validateMainpageTitle();
		Assert.assertEquals(title, "Wireless, Internet, TV, Home Monitoring, and Home phone | Rogers");
	}
	@Test(priority=2)
	public void validaterogerLogoTest() throws InterruptedException {
		Thread.sleep(3000);
		String logotext = mainURlpage.validaterogerLogo();
		System.out.println(logotext);
		Assert.assertEquals(logotext, "");
	}
	
	@Test(priority=3)
	public void validaterogerpersonalTest() throws InterruptedException {
		Thread.sleep(3000);
		String personal = mainURlpage.validaterogerpersonal();
		Assert.assertEquals(personal, "PERSONAL");
	}

	@Test(priority=4)
	public void validaterogerBussinessTest() throws InterruptedException {
		Thread.sleep(3000);
		String business = mainURlpage.validaterogerBussiness();
		Assert.assertEquals(business, "BUSINESS");
	}
	
	@Test(priority=5)
	public void ClickonSignInTest() throws InterruptedException {
		Thread.sleep(3000);
		loginPage = mainURlpage.ClickonSignIn();
	
	
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
