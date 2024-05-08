package com.inetbankingtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.inetbanking.page.objects.Loginpage;

public class Tc_LoginTest_001 extends Baseclass {
	
	
@Test
	public void LoginTest() {

	
	
	logger.info("URL is opened");
	
	
	
	
	Loginpage lp=new Loginpage(driver);
	lp.setUsername(username);
	
	logger.info("Entered username");

	
	lp.setpassword(password);
	logger.info("Entered password");

	
	lp.clickLogin();
	
    String expectedTitle = "Guru99 Bank Manager HomePage";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);

	
	
	
	
}
}