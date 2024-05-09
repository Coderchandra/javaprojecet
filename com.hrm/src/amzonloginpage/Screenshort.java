package amzonloginpage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//File trg=new File("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\com.hrm\\images");
		System.out.println("pass");
		FileUtils.getFile(srcFile,  ("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\com.hrm\\images"));
		System.out.println("pass");
		//driver.quit();
	}	
	
	}




	

	
