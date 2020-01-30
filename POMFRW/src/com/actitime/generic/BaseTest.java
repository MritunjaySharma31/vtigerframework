package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 abstract public class BaseTest implements IAutoConstant
{
	static 
	{
		
		System.setProperty(CHROM_KEY,CHROM_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE );
		
    }
	public static WebDriver driver;
	public static void openApplication()
	{
		        //open the browser
			    driver  = new ChromeDriver();
				//set the browser timeout
				driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
				// maximize the window
				driver.manage().window().maximize();
				//enter the url
				driver.get(URL);
	}
	public static void closeApplication()
	{
	
	driver.close(); 
	
	
	
	}	

}
