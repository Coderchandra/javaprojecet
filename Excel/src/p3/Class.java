package p3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
public static void main(String[] args) {


	  WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//driver.get("https://jqueryui.com/droppable/");
driver.get("https://www.amazon.in/");

File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

try {
	FileUtils.copyFile(src,new File("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\Screen\\screenshot.jpg"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Screen short is printed");
driver.close();
}
}
