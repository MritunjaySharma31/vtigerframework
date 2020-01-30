package com.actitime.generic;
/**
 * 
 * @author sharma_mritunjay
 * 
 */

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameWorkUtils implements IAutoConstant

{

	
	
	public static void verifyPage(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("the expected title is ===>>>" +expectedTitle);
			
		}
		else 
		{
			System.out.println("the expectedpge title is not displayed ===>>>" +actualTitle);
		}

    }
	public static void takesScreenshot(WebDriver driver , String path)
	{
		try
		{
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs( OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);
					
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
	public static String read_XL_Data(String path, String sheet,int rn,int cn)
	{
		String data = "";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			data = wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	public static void write_XL_DATA(String path,String sheet,int row,int cell)
	{
		int v = 0;
		
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			  wb.getSheet(sheet).createRow(row).getCell(cell).setCellValue(v);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static int write_ROW_COUNT(String path,String sheet,int row,int cell)
		{
			int rowCount = 0;
			
			
			try
			{
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				  wb.getSheet(sheet).getLastRowNum();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return rowCount;
		}
		public static void explctWait(WebDriver driver)
		{ 
			new WebDriverWait(driver, ETO);
		}
		public static void actions(WebDriver driver)
		{
	
		  new Actions(driver);
		  
		}
       public static void sel(WebElement element)
       {
	      new Select(element);
       }
	
	}
