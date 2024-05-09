package p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlfile {

	
		// TODO Auto-generated method stub

		public static void main(String[] args) throws Throwable {
			File exlPath = new File(".\\files\\data.xlsx");
			FileInputStream fis = new FileInputStream(exlPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("chandra1");
			ws.getRow(0).createCell(2).setCellValue("Cloumn3");
			ws.getRow(1).createCell(2).setCellValue("Test@123");
			FileOutputStream fos = new FileOutputStream(exlPath);
			wb.write(fos);
			
	}

}
