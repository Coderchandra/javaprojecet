package p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import p2.Utility;
import p1.ExcelFileUtils;
import Utilities.PropertiesFileUtil;

public class OrangeHRMlibrary  {
	

	String res;
	FirefoxDriver driver;
	//appLaunch
	
	public  String appLaunch(String url) throws IOException
	{

		  driver= new FirefoxDriver();
		 
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //validation
	    if(driver.findElement(By.name("username")).isDisplayed())
	    {
	    	 	res="Pass";
	    	 	
	    }else
	    {
	   	    	res="Failed";
	    }
	    
	    return res;
	}
	
	
	
		
	
	public void appLogin(String username,String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	
	    
	} //AppLogout

	//EmpCreation
	
	public String empCreation(String empFirstName,String empLastName,String empId)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(empFirstName);
		driver.findElement(By.name("lastName")).sendKeys(empLastName);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(empId);
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		//validation
		if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
		}
	
	//AppLogout
	
	public String appLogout()
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    //validation
	    if(driver.findElement(By.name("username")).isDisplayed())
	    {
	    	 	res="Pass";
	    	 	
	    }else
	    {
	   	    	res="Fail";
	    }
	    
	    return res;
	    
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	

	
	//AppLogou
	
	
		
	public static void main(String[] args) throws Exception {
		
		
		
			OrangeHRMlibrary  app=new OrangeHRMlibrary ();
			
			//AdminLogin--TC
			app.appLaunch(PropertiesFileUtil.getvalueforkey("url"));
			app.appLogin(PropertiesFileUtil.getvalueforkey("urlname"),PropertiesFileUtil.getvalueforkey("password"));
			app.empCreation("chandra"," vijay", "gt");
			app.appLogout();
		 	app.appClose();
		 	
		

			/*
			 * String results=app.appLaunch(
			 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 * 
			 * System.out.println(results);
			 * 
			 * app.appLogin("Admin","admin123"); app.empCreation("vasedfg", "123", "123");
			 * app.appLogout();
			 * 
			 * app.appClose();
			 */	
			
			
			
		}
		

		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	












