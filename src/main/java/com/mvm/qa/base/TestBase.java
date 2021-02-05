package com.mvm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
  public static WebDriver driver;
   public static Properties prop;
   public WebDriverWait wait ;
     public TestBase(){
    	  wait=new WebDriverWait(driver, 20);
    	 try {
    	 prop = new Properties();
    	 FileInputStream ip =new FileInputStream("D:\\Workspace\\AutomationPracticeNew\\src\\main\\java\\com\\mvm\\qa\\config\\config.Properties");
    	 prop.load(ip);
    	 }catch (FileNotFoundException e) {
    		 e.printStackTrace();
    	 }catch (IOException e) {
    		 e.printStackTrace();
    	 }
     }
    
     public static void initialization() {
     String browser = prop.getProperty("browser");
     String url=prop.getProperty("url");
     System.out.println(url);
     System.setProperty("webdriver.chrome.driver", "./exe1./chromedriver.exe");
       driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      driver.navigate().to(url);
     }
	
}
