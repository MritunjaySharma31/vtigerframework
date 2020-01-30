package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(id ="username")
	private WebElement unTB;
	
    @FindBy(name ="pwd")
    private WebElement pwTB;
    
    @FindBy(xpath ="//div[text() = 'Login '] ")
     private WebElement LgnBTN;
    
    @FindBy(xpath = "//span[contains(text(),'invalid.')]")
    private WebElement errmsg;
    
    
   // @FindBy(xpath="//a[text()='Logout']")
   // private WebElement lgout;
   
    public Loginpage(WebDriver driver )
    {
    	PageFactory.initElements(driver, this);
    	
    }
    public void Setusername(String un)
    {  
    	unTB.sendKeys(un);
    	
    }
    public void Setpassword(String pw)
    {   
    	pwTB.sendKeys(pw);
    }
    public void clickOnLoginBtn()
    {
    	LgnBTN.click();
    }
    public void verifyerrmsg()
    {
    	if(errmsg.isDisplayed())
    
    	System.out.println("the errmsg is displayed===>>" +errmsg.getText());
    	else
    		System.out.println("the error message is not displayed");
    	
    
    }
	
    
}   
    
    
    
    
    
    
    
    
    

