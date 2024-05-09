package amzonloginpage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Microsoftloginpage {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandra sekhar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait()
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		
		
		
		 driver.get("https://login.microsoftonline.com/");
		// Thread.sleep(2000);		
		WebElement usernamefeldes=driver.findElement(By.xpath("//*[@id=\"i0116\"]"));
        
		usernamefeldes.sendKeys("kummithachandrasekhar@gmail.com");
		

		WebElement NextButtion=driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		NextButtion.click();
		 //driver.findElement(By.id("i0118")).sendKeys("Chandra@990");
		 
		 
		 
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div/div/input[@id='i0118']")).sendKeys("Chandra@990");
		WebElement SigninButtion=driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		SigninButtion.click();
			
			
	WebElement Yesbuttion=driver.findElement(By.xpath("//*[@id=\"acceptButton\"]"));
			
	Yesbuttion.click();
	
	
	driver.close();
	}

}
