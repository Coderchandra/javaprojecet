package p1;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	

public class ExcelFileUtils {
	
	
		Workbook wb;
		public ExcelFileUtils() throws Throwable
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\files\\Data.xlsx");
			wb=WorkbookFactory.create(fis);
		}
		//row count
		public int rowCount(String sheetname)
		{
			return wb.getSheet(sheetname).getLastRowNum();
		}
		//coulmn Count
		public int colCount(String sheename,int row)
	   	{
			return wb.getSheet(sheename).getRow(row).getLastCellNum();
		}
		
		//reading data
		
		public String getData(String sheetname,int row,int column)
		{
			String data="";
			//checking the cell data type whether it is numeric 
			if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				//converting double data type into interger datatype
				int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
				//convert the int datatype to string datatype ,bcz while passing data have to send in the form of string
			data=String.valueOf(celldata);
			}else
			{
				data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			}
			return data;
		}
		
		//writing data into excel
		public void setData(String sheetname,int row,int column,String status) throws Throwable
		{
			//ws.getRow(row).createcell(column).setCellValue("Pass");
			
			Sheet sh=wb.getSheet(sheetname);
			
			Row rownum=sh.getRow(row);
			
			Cell cell=rownum.createCell(column);
			
			cell.setCellValue(status);
			
			if(status.equalsIgnoreCase("PASS"))
			{
				CellStyle style=wb.createCellStyle();
				Font font=wb.createFont();
				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFont(font);
				rownum.getCell(column).setCellStyle(style);
			}else
				if(status.equalsIgnoreCase("FAIL"))
				{
					CellStyle style=wb.createCellStyle();
					Font font=wb.createFont();
					//font.Bold()=true;
					font.setColor(IndexedColors.RED.getIndex());
					style.setFont(font);
					rownum.getCell(column).setCellStyle(style);
				}else
					if(status.equalsIgnoreCase("Not Executed"))
					{
						CellStyle style=wb.createCellStyle();
						Font font=wb.createFont();
						font.setColor(IndexedColors.BLUE.getIndex());
						style.setFont(font);
						rownum.getCell(column).setCellStyle(style);
					}
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\Excel\\files\\Data.xlsx");
			wb.write(fos);
			fos.close();
		}
		
		
	}


