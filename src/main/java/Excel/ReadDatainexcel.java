package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainexcel 
{
	public static void main(String[]args) throws IOException
	{
		
		String Filepath1 ="C:\\Users\\Nishitha\\Downloads\\Android Leave Application.xlsx";
		
		//To read the data we use; FileInputstream
		
		
		FileInputStream read = new FileInputStream(Filepath1);
		
		XSSFWorkbook wb = new XSSFWorkbook(read); //Reads workbook of the sheet
		XSSFSheet sheet1 = wb.getSheetAt(0); //Gets firt sheet in the workbook
		
		int rows=sheet1.getLastRowNum(); //Gets last row no (total number of rows)
		int columns =sheet1.getRow(1).getLastCellNum(); //gets total columns in first row
		
		
		for(int r=0;r<=rows;r++)  //Iterating each row
			
		{
			XSSFRow row=sheet1.getRow(r); //gets each row
			
			for(int c=0;c<columns;c++)//Iterating each column
			{
				XSSFCell cell=row.getCell(c);  //gets each cell
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());
				break;
				case BOOLEAN:  System.out.println(cell.getBooleanCellValue());
				break;
				}
			
			
			}
			
		System.out.println(" ");	
			
		}
		
	}

}
