package com.inetbanking.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
		
		
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
public void setUsername(String uname) {	
txtusername.sendKeys(uname);	
}	

public void setpassword(String Pwd ) {	
txtpassword.sendKeys(Pwd );	
	
}
public void clickLogin( ) {	
btnLogin.click();	
}	
}


