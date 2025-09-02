import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		// Selecting options from select tag drop down
		 
		 Select statesDropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		 //statesDropdown.selectByVisibleText("China");
		// statesDropdown.selectByValue("india");
		   statesDropdown.selectByIndex(5);
			 
		   //No of options in an drop down 
		   
		List <WebElement> Options = statesDropdown.getOptions();
		System.out.println(Options.size());
		
		//Printing all the options from the drop down
		/*for(int i =0; i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
		}
		 */
		
		////Printing all the options from the drop down using enhanced for loop
		for(WebElement option : Options)
			
		{
			System.out.println(option.getText());
		}
		
		
		
		driver.close();
	
	}


}


