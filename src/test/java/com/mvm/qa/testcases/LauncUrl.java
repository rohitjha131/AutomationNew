package com.mvm.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;

public class LauncUrl extends TestBase {
	LauncUrl launcUrl;
	public LauncUrl() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void setup() throws IOException, InterruptedException {
		launcUrl = new LauncUrl();
		initialization();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement Expected =driver.findElement(By.xpath("//img[@alt='My Store']"));
		String exp = Expected.getAttribute("alt");
		//Assert.assertEquals(actual, expected);
	    System.out.println("hello");
		System.out.println("");
	}
	
//	@Test
//	public void run() {
//		
//	}
	

}
