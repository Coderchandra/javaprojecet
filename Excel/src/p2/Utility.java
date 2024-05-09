package p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	
public static Object fechproperteyvalue(String key) throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\storagedata");
	Properties property=new  Properties();
	
	property.load(file);
	return property.getProperty(key);
	
}
	
	
	
}
