package com.roger.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.roger.qa.base.Base;

public class LoginPage extends Base{

	
	@FindBy(xpath="//span[text()='Register']")
	WebElement register;
	
	
	public LoginPage() {	
	PageFactory.initElements(driver, this);			
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	
	}
	
	public SignUpPage clickONSignUP() {
		
		register.click();
		return new SignUpPage();
		
	}
	
	
}
