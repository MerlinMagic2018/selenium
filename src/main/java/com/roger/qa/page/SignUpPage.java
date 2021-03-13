package com.roger.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.roger.qa.base.Base;

public class SignUpPage extends Base {

	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//span[@role='text']")
	WebElement continue_button;
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public String validatesignuppageTitle() throws InterruptedException {
		
		return driver.getTitle();
	}
	
	public void email() {
		email.sendKeys("manojkumawat@gmail.com");
	}
	
	public void clickoncontinue() {
		continue_button.click();
	}
}
