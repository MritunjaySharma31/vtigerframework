package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.BaseTest;
import com.actitime.pages.Loginpage;

public class TestLoginpage extends BaseTest


{
	
	public static void main(String[] args ) throws InterruptedException
	{  
		
		
		BaseTest.openApplication();
		
		//create loginPage object
		Loginpage lp = new Loginpage(driver);
		// call the page oject method for performing actions on the user name textbox
		lp.Setusername("admin");
		Thread.sleep(1000);
        lp.Setpassword("manager");
        Thread.sleep(1000);
		lp.clickOnLoginBtn();
		
		BaseTest.closeApplication();
		
		
		
     }
	
	
}