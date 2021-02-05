package com.mvm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.ClickOnSignInButton;
import com.mvm.qa.pages.LoginPage;

public class ClickOnSign extends TestBase {
	LoginPage loginpage ;
	ClickOnSignInButton clickon;
	
	public ClickOnSign() {
		super();	
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
		loginpage =new LoginPage();
		clickon =new ClickOnSignInButton();
	}
	
	@Test(priority=0)
	public void clickOnSignButton() {
		clickon.clickOnSignButton();
		
	
	}
	
	@Test(priority=1)
	public void loginInAccount() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
