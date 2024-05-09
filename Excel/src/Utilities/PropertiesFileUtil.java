package Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;




public class PropertiesFileUtil  {
	
	
		public static String getvalueforkey(String key) throws IOException {
Properties config=new Properties();

FileInputStream fis=new FileInputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\storagedata");
config.load(fis);
return config.getProperty(key);

}   
		

		
		
		
}