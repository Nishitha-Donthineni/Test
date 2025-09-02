package Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataintoexcel {

	public static void main(String[] args) throws IOException
	{
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Employee information");
		
		Object empdata[][]= {{"Empid","Emp Name","Job"},
				             {001,"Nishitha","Senior automation engineer"},
							 {002,"Goutham","Product engineer"},
							 {003,"Krishna","vice president"},
							 {004,"subadra","CEO"},
							 {004,"Karna","Director"},
		
							};
		
	
		//Using for loop
		 int rows= empdata.length; // no of rows
		 int columns = empdata[0].length; // no of columns 
		 
		 System.out.println(rows);
		 System.out.println(columns);
		
		 for(int r=0;r<rows;r++)
			 
		 {
			XSSFRow row=sheet.createRow(r);
			
			 for(int c=0;c<columns;c++) 
			 {
				XSSFCell cell = row.createCell(c);
				Object value=empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			
			 }
		
		 
		 }		 
		
		//Second method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 String filePath ="C:\\Users\\Nishitha\\Downloads\\Automation Testing File.xlsx";
		FileOutputStream output= new FileOutputStream(filePath);
		workbook.write(output);
		output.close();
		
		
		System.out.println(" Data entered into file successfully");
		

	}

}
