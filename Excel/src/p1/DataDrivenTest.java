package p1;

import java.util.Properties;

import Utilities.PropertiesFileUtil;
import p2.OrangeHRMlibrary;
import practice1.Excelfilusage;
import p1.ExcelFileUtils;

public class DataDrivenTest {

	public static void main(String[] args) throws Throwable {
		OrangeHRMlibrary  app=new OrangeHRMlibrary ();
		Excelfilusage excel=new Excelfilusage ();
		PropertiesFileUtil		po=new PropertiesFileUtil();


		
		
		
		app.appLaunch(PropertiesFileUtil.getvalueforkey("url"));
		
		app.appLogin(PropertiesFileUtil.getvalueforkey("urlname"), PropertiesFileUtil.getvalueforkey("password"));

		//reading data from excel "EmployeeData" sheet
		
		for (int i = 0; i <=excel.rowcount("EmployeeData"); i++) 
		{
			String empFirstName=excel.getdata("EmployeeData", i, 0);
			String empLastName=excel.getdata("EmployeeData", i, 1);
			String empID=excel.getdata("EmployeeData", i, 2);
			
			String results=app.empCreation(empFirstName, empLastName, empID);
			//writing results into excel Ouputsheet
			excel.setdata("EmployeeData", i, 3, results);
		}
		
		app.appLogout();
		
		app.appClose();
		
		System.out.println("data is printed sussufuly");
		
	}



		
		
		
		

	}


