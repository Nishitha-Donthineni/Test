package Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Excelandwebtable {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String Filepath="C:\\Users\\Nishitha\\Downloads\\Table.xlsx";
		XSSFWorkbook workbook= new XSSFWorkbook(Filepath);
		XSSFSheet sheet = workbook.createSheet("Test Data");
		
		
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		sheet.createRow(0);
		
		//Retrieving headers
		int colCount =driver.findElement(By.xpath("//table[contains(@class,'wikitable')]/thead/tr")).findElements(By.tagName("th")).size();
	    
		for(int colNo=1;colNo<=colCount;colCount++)
		{
			
		  String cellText=driver.findElement(By.xpath("//table[contains(@class,'wikitable')]/thead/tr/th["+colNo+"]")).getText();
		  System.out.println(cellText+" ");
		  sheet.getRow(0).createCell(colNo-1);
		  sheet.getRow(0).getCell(colNo-1).setCellValue(cellText);
		}
		System.out.println();
		
		
		int rowCount = driver.findElements(By.xpath("//table[@class='wikitable sortable mw-datatable sort-under static-row-numbers sticky-header col1left col5left jquery-tablesorter']/tbody/tr")).size();
		for(int rowNo=1;rowNo<=rowCount;rowNo++) 
		{
			sheet.createRow(rowNo);
			colCount=driver.findElement(By.xpath("//table[contains(@class,'wikitable')]/thead/tr")).findElements(By.tagName("td")).size();
			for(int colNo=1;colNo<colCount;colNo++)
				
			{
				String cellText = driver.findElement(By.xpath("//table[contains(@class,'wikitable')]/thead/tr["+rowNo+"]/td["+colNo+"]")).getText();
				 System.out.println(cellText+" ");
				  sheet.getRow(0).createCell(colNo-1);
				  sheet.getRow(0).getCell(colNo-1).setCellValue(cellText);
			}
			System.out.println();
		 }
	
		FileOutputStream output= new FileOutputStream(Filepath);
		workbook.write(output);
		output.close();
		workbook.close();
		driver.quit();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(rowCount));//globally waits for all the elements to load
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		element.click();
		
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot1, new File ("c:/downloads//abc.png"));
		
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.get("URL");
		
		Select dd = new Select(driver.findElement(By.xpath("")));
		dd.selectByContainsVisibleText("china");
		dd.deselectByValue(Filepath);
		dd.selectByIndex(rowCount);
		
		
		driver.findElement(By.xpath("//tag[@id='checkbox']")).click();
		
		List	<WebElement> checkboxes =driver.findElements(By.xpath("//div[@id='sunday' and @type='checkbox']"));
		
	     for(int i=0;i<= checkboxes.size();i++)
	     {
	    	 
	    	 checkboxes.get(i).click();
	    	 if(checkboxes.get(i).isSelected())
	    	 {
	    		 checkboxes.get(i).click();
	    	 }
	    	 
	     }
	     
		
		
	}

}
