package practicee2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	WebDriver driver;
	
	public  void applanch() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	
public static void main(String[] args) {
	Amazon s=new Amazon();
	
	s.applanch();
}
}
