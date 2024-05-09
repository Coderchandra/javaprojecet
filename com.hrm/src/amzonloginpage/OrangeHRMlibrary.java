package amzonloginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMlibrary  {
	

	String res;
	FirefoxDriver driver;
	//appLaunch
	
	public  String appLaunch(String url)
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
		   	    	res="Failed";
		    }
		    
		    return res;
		    

	    	
	
}
	public void appclose() {
		driver.close();
	}
	    
	
	public static void main(String[] args) {
		
			OrangeHRMlibrary  app=new OrangeHRMlibrary ();

		
String results=app.appLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(results);
	
			app.appLogin("Admin","admin123");
			app.appLogout();
			
			app.appclose();
			
			
			
			
		}
		

		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	












