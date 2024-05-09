package amzonloginpage;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Capchersc {

	public static void main(String[] args) throws Exception {
		
		
		ChromeDriver driver=new ChromeDriver();


driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
File sourcefile=driver.getScreenshotAs(OutputType.FILE);

File desfile=new File("./images/img1.jpg");

FileUtils.copyFile(sourcefile, desfile);

System.out.println("screen shorts saved succesfully");
driver.quit();
	}


}