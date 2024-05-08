package com.inetbankingtestcase;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.uttlites.ReadConfig;

public class Baseclass {
	ReadConfig readconfig=new ReadConfig();
	
public  String baseUrl=readconfig.getapplicationURL();
public String username=readconfig.getusername();
public String password=readconfig.getpassword();
public static  WebDriver driver;
public static Logger logger;

@Parameters("browser")
@BeforeClass
public void setup(String br) {

	
	
	
 logger=Logger.getLogger("ebanking");
PropertyConfigurator.configure("log4j-properties-16.2.0.jar");

if(br.equals("Chrome")) {
System.setProperty("webdriver.Chrome.driver",readconfig.getChromepath());
driver=new ChromeDriver();
}
else if(br.equals("Firefox")) {
System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
driver=new FirefoxDriver();
}
else if(br.equals("ie")) {
System.setProperty("webdriver.ie.driver",readconfig.getinternetexflorer());
driver=new InternetExplorerDriver();
}
driver.get(baseUrl);

}



@AfterClass
public void tearDown() {
	driver.quit();
}
}

