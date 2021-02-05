package com.mvm.qa.pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mvm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	 public LoginPage() {
	    	PageFactory.initElements(driver, this);
	    	
	    }
	public void login(String un ,String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		submitButton.click();
	}

}
