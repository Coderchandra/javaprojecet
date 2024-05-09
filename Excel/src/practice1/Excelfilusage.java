package practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfilusage {
	Workbook wb;
	public Excelfilusage() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\files\\Data.xlsx");
		
		 wb=WorkbookFactory.create(fis);
		
	}
	//Rowcount
	
	public int rowcount(String sheetname) {
	return wb.getSheet(sheetname).getLastRowNum();
		
		
	}
	public int colcount(String sheetname,int row) {
return	wb.getSheet(sheetname).getRow(row).getLastCellNum();	
		
	}
	public String getdata(String sheetname,int row,int coloum) {
		
		String data="";
		//checking the cell data type whether it is numeric 
		if(wb.getSheet(sheetname).getRow(row).getCell(coloum).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			//converting double data type into interger datatype
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(coloum).getNumericCellValue();
			//convert the int datatype to string datatype ,bcz while passing data have to send in the form of string
		data=String.valueOf(celldata);
		}else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(coloum).getStringCellValue();
		}
		return data;
		 
		}
		public void setdata(String sheetname,int row,int coloum,String status) throws IOException {
//ws.getRow(row).createcell(column).setCellValue("Pass");
			
			Sheet sh=wb.getSheet(sheetname);
			
			Row rownum=sh.getRow(row);
			
			Cell cell=rownum.createCell(coloum);
			
			cell.setCellValue(status);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\files\\Data.xlsx");
			wb.write(fos);
			fos.close();	
		}	
		
}	
		
			
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

