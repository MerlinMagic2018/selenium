package com.roger.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.roger.qa.base.Base;

public class MainURLPage extends Base {

	//****************** Page factory ******************
	
	@FindBy(xpath="//img[@class='rcl-icon-logo' and @alt='Rogers']")
	WebElement rogerLogo;
	
	@FindBy(xpath = "//span[text()='Personal']")
	WebElement personal;
	
	@FindBy(xpath="//span[text()='Business' and @class='m-navLink__caption']")
	WebElement business;
	
	@FindBy(xpath="//span[text()='Sign in' and @class='m-navLink__caption']")
	WebElement signIN;
	
	//***************************************Initialization of page object***************
	public MainURLPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMainpageTitle() {
		return driver.getTitle();
	}
	
	public String validaterogerLogo() {
		String logo= rogerLogo.getText();
		return logo;
	}
	
	public String validaterogerpersonal() {
		return personal.getText();

	}
	
	public String validaterogerBussiness() {
		return business.getText();

	}
	public LoginPage ClickonSignIn() {
		signIN.click();
		return new LoginPage();

	}
	
	
	
	
	
}
