package com.roger.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.roger.qa.base.Base;

public class LoginPage extends Base{

	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//span[text()='Register']")
	WebElement clickONRegister;
	
	public LoginPage() {	
	PageFactory.initElements(driver, this);			
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	
	}
	
	public void loginData(String userName, String passWord) {
	
	username.sendKeys(userName);	
	password.sendKeys(passWord);
	}
	
	
	
	public SignUpPage register() {
		clickONRegister.click();
		
		return new SignUpPage();
	}
	
}
