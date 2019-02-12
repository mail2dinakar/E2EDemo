package Lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldataConstructorclass {

		XSSFWorkbook wb;
		XSSFSheet sheet1;
		public ReadExceldataConstructorclass(String Path)
		{
			try 
			{
				File src =new File(Path);
				FileInputStream fis = new FileInputStream(src);
				wb =new XSSFWorkbook(fis);	
				
			} catch (Exception e) 
			{
				System.out.println("File not found" +e.getMessage()); 
			} 
		}
		
		public String getData(int Sheetnum,int row,int col)
		{
		sheet1 = wb.getSheetAt(Sheetnum);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
		}
	
		public int getrowcount(int sheetindex)
		{
			int rowcount = wb.getSheetAt(sheetindex).getLastRowNum();
			
			rowcount = rowcount+1;
			
			return rowcount;
		}

}	