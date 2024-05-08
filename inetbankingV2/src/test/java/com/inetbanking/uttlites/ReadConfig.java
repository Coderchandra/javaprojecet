package com.inetbanking.uttlites;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
	File src=new File("./Configuration/config.properties");	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	} catch (Exception e) {
	
	System.out.println("Exception is"+e.getMessage());
	}	
		
	}
	public String getapplicationURL() {
		
		String url=pro.getProperty("baseUrl");
		return url ;
		
	}
public String getusername() {
		
		String username=pro.getProperty("username");
		return username ;
}
public String getpassword() {
	
	String password=pro.getProperty("password");
	return password ;
}
public String get() {
	
	String password=pro.getProperty("password");
	return password ;
}
public String getChromepath() {
	
	String Chromepath=pro.getProperty("Chromepath");
	return Chromepath ;
}
public String getfirefoxpath() {
	
	String firefoxpath=pro.getProperty("Firefox");
	return firefoxpath ;
}
public String getinternetexflorer() {
	
	String internetexflorer=pro.getProperty("internetexflorer");
	return internetexflorer ;
}
public static void main(String[] args) {
	ReadConfig se= new ReadConfig();
	
	System.out.println(se.getapplicationURL());
	System.out.println(se.getusername());
	System.out.println(se.getpassword());
	System.out.println(se.getChromepath());

}

}
