package amzonloginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oranghrmlogin {

	public static void main(String[] args) {
       
		
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.name("username")).sendKeys("Admin");
		

		
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement LoginButtion=driver.findElement(By.xpath("//*[@type='submit']"));
		LoginButtion.click();
				
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();	
	//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
			
	}

	
		
		
	




	}


