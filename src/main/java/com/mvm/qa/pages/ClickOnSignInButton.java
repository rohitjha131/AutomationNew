package com.mvm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mvm.qa.base.TestBase;

public class ClickOnSignInButton extends TestBase{
    @FindBy(xpath="//a[@title='Log in to your customer account']")
    WebElement signIn;
    
    public ClickOnSignInButton() {
    	PageFactory.initElements(driver, this);
    	
    }
    
    public String validatingLoginPageTitle() {
        return driver.getTitle();
    
    }
    
	public void clickOnSignButton() {
		wait.until(ExpectedConditions.visibilityOf(signIn));
		signIn.click();
		
		
	}
	
	

}
