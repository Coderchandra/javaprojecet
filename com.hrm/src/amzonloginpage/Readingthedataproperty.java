package amzonloginpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readingthedataproperty {

	public static void main(String[] args) throws Throwable {
		Properties Config=new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\com.hrm\\screanshortes");
		
Config.load(fis);
System.out.println(Config.getProperty("url"));
System.out.println(Config.getProperty("Browser"));

System.out.println(Config.getProperty("password"));

		



	}

}
