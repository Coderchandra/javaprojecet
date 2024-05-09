package p3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println(	driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	
	
	System.out.println(driver.getCurrentUrl());
	 driver.navigate().refresh();
	 driver.close();
	}

}
