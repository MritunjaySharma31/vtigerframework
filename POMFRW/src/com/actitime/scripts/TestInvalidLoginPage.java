package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.BaseTest;
import com.actitime.pages.Loginpage;

public class TestInvalidLoginPage extends BaseTest
{
	
	public static void main(String[] args ) throws InterruptedException
	{   
		//open the browser
		WebDriver driver = new ChromeDriver();
		//set the browser timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// maximize the window
		driver.manage().window().maximize();
		//enter the url
		driver.get("http://localhost/login.do");
		
		       
				Loginpage lp = new Loginpage(driver);
				lp.Setusername("adm");
				Thread.sleep(1000);
		        lp.Setpassword("man");
		        Thread.sleep(1000);
				lp.clickOnLoginBtn();
				
				

}
}
