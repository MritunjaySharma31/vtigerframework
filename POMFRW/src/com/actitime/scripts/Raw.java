package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.generic.FrameWorkUtils;
import com.actitime.pages.Loginpage;

public class Raw  extends BaseTest
{
	public static void main (String[] args)
	{   
		BaseTest.openApplication();
		Loginpage lp = new Loginpage(driver);
		
		
		String un = FrameWorkUtils.read_XL_Data(XL_PATH, "sheet1", 1, 0);
		String pw = FrameWorkUtils.read_XL_Data(XL_PATH, "sheet1", 1, 1);
		lp.Setusername(un);
		lp.Setpassword(pw);
		BaseTest.closeApplication();
		
		
	}

}
