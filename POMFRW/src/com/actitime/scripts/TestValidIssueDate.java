package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.Licencepage;
import com.actitime.pages.Loginpage;

public class TestValidIssueDate extends BaseTest
{

	public static void main(String[] args) 
	{
		BaseTest.openApplication();
		Loginpage lp = new Loginpage(driver);
		lp.Setusername("admin");
		lp.Setpassword("manager");
		lp.clickOnLoginBtn();

		EnterTimeTrackPage ett = new EnterTimeTrackPage(driver);
		ett.clickOnLicences();
		ett.clickOnSettings();
		
		Licencepage lcp = new Licencepage(driver);
		lcp.verifyIssueDate();
		BaseTest.closeApplication();
	}

}
