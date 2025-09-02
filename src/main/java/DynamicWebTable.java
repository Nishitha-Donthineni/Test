import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		List <WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		System.out.println("Number of rows in the table are "+rows.size());
		
		for(int r=1;r<=rows.size();r++)
			
		{
			WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]//td[1]")); //First column
			//	System.out.println(name.getText());
			if(name.getText().equals("Chrome")) 
			{
				String CPU=driver.findElement(By.xpath("//td[normalize-space()='Chrome']/following-sibling::*[contains(text(),'%')]")).getText();
				String value=driver.findElement(By.xpath("(//p[@id='chrome-cpu'])")).getText();
				if(value.contains(CPU))
				{
					System.out.println("CPU matches");
				}
				else 
				{
					System.out.println("CPU not matched");

				}
				break;
			}
		}
		
		JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		js1.executeScript("Window.scrollBy(0,500)");		
		driver.close();
		
		Actions dragadndrop = new Actions(driver);
		dragadndrop.dragAndDrop(null, null).build().perform();
		
	
	}

}
