																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														package practicewebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 //select specific check box
		 driver.findElement(By.id("sunday")).click();
		 
		 //Selecting multiple check boxes
		 
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		 //	Another way of loop
		for (WebElement checkbox:checkboxes)
		
		{
			checkbox.click();
		}
		Thread.sleep(3000);
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,1000)");
		
		
		List <WebElement>TableCheckboxes=driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
		for(int i=0;i<TableCheckboxes.size();i++)
			
		{   
			TableCheckboxes.get(i).click();
		
		
		}
		
		
		
		//driver.close();
	}
	

}
