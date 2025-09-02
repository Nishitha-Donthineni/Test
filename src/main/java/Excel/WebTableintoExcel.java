package Excel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableintoExcel {


		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
			WebDriver driver= new ChromeDriver();

			driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		    String filepath="C:\\Users\\Nishitha\\Downloads\\WebTable1.xlsx";
		    XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet sheet = workbook.createSheet("Population");
		   
		    
		    List<WebElement> headerCells = driver.findElements(By.xpath("//table[contains(@class,'wikitable')]/thead/tr/th"));
	        XSSFRow headerRow = sheet.createRow(0);
	        
	        for (int i = 0; i < headerCells.size(); i++) {
	            headerRow.createCell(i).setCellValue(headerCells.get(i).getText());
	        }
		   
		    List <WebElement>rows= driver.findElements(By.xpath("//table[@class='wikitable sortable mw-datatable sort-under static-row-numbers sticky-header col1left col5left jquery-tablesorter']/tbody/tr"));
		    int rowCount= rows.size();
		    int excelRowNum =1;//start writing second row in excel
		    
		    
		  
		  
		   for(int r=1; r<= rowCount;r++)
		 {
		   
			  List <WebElement> column= driver.findElements(By.xpath("//table[@class='wikitable sortable mw-datatable sort-under static-row-numbers sticky-header col1left col5left jquery-tablesorter']/tbody/tr["+r+"]/td"));
		      int columnscount =column.size();
		      if(columnscount ==0);
			  XSSFRow excelRow= sheet.createRow(excelRowNum++);
			   for(int c=1;c < columnscount;c++)
		     {
		    	 String cellText =driver.findElement(By.xpath("//table[@class='wikitable sortable mw-datatable sort-under static-row-numbers sticky-header col1left col5left jquery-tablesorter']/tbody/tr["+r+"]/td["+c+"]")).getText();
		    	excelRow.createCell(c).setCellValue(cellText);
		    	 // System.out.println(cellText);
		     }
		    	 
		   //  System.out.println();
		   }
		 /*  for (int r = 1; r <= rows.size(); r++) {
	            List<WebElement> cells = driver.findElements(By.xpath("//table[contains(@class,'wikitable')]/tbody/tr[" + r + "]/td"));
	            if (cells.size() == 0) continue;  // Skip if it's a header or empty row

	            XSSFRow excelRow = sheet.createRow(excelRowNum++);
	            for (int c = 0; c < cells.size(); c++) {
	                excelRow.createCell(c).setCellValue(cells.get(c).getText());
	            }
	        }*/
		    
		FileOutputStream output = new FileOutputStream (filepath);
		workbook.write(output);
		output.close();
		
		System.out.println(" Excel created successfully");
		driver.close();
		
		}
		
		
}







/*System.out.println("No of rows in the webtable are "+ rowCount);
/* List <WebElement> columns= driver.findElements(By.xpath("//table[@class='wikitable sortable mw-datatable sort-under static-row-numbers sticky-header col1left col5left jquery-tablesorter']/tbody/tr[1]/td"));
 int columnCount= columns.size();
	System.out.println("No of columns in the webtable are "+ columnCount);*/
 