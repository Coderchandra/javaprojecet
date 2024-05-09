package p2;

import p1.ExcelFileUtils;

public class Readingxl{



	public static void main(String[] args) throws Throwable {
		
ExcelFileUtils excel=new ExcelFileUtils();
		
		excel.setData("LoginData", 0, 2, "Results");
		excel.setData("LoginData", 1, 2, "Pass");
		excel.setData("LoginData", 2, 2, "pass");
		excel.setData("LoginData", 3, 2, "pass");
		
}



}


