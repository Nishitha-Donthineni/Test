package connect;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Locatorss 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(("https://connectqa.vultus.com/Login.aspx"));
		 driver.findElement(By.id("email")).sendKeys("bheemudiagasthya@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Welcome@123");
		 driver.findElement(By.id("LoginBtn")).click();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 driver.findElement(By.xpath("//i[@class='fa fa-users']")).click();
		 driver.findElement(By.xpath("//span[@role='presentation']")).click();
		 driver.findElement(By.xpath("//div[text()='Employee']")).click();
	//	 Select dropdown = new Select(driver.findElement(By.id("s2id_ddlroletype")));
		// dropdown.selectByVisibleText("Employee"); 
		/* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='s2id_ddluserlist'])")));
		element.sendKeys("Nishitha K"+Keys.ENTER);*/
		// driver.findElement(By.xpath("(//div[@id='s2id_ddluserlist'])")).sendKeys("Nishitha k"+Keys.ENTER);
		 driver.findElement(By.id("ausersearch")).click();
		 driver.findElement(By.id("aCustomreport")).click();
		 Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='ddlCustomFilters']")));
		 dropdown.selectByValue("13");
		
		// driver.findElement(By.id("//div[@id='s2id_ddlCustomFiltertype_0']")).click();
		 Select fieldtype = new Select(driver.findElement(By.xpath("//select[@id='ddlCustomFiltertype_0']")));
		 fieldtype.selectByValue("15");
		 Select Value = new Select(driver.findElement(By.xpath("//select[@id='ddlCustomFilterDropdown_0']")));
		 Value.selectByValue("1851");
		 driver.findElement(By.id("btnGetCustomReport")).click();	
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(screenshot,new File("C:\\Users\\Nishitha\\OneDrive\\Pictures\\Screenshots\\test.png"));
		
		 /*driver.findElement(By.xpath("//span[@id='select2-chosen-22']")).click();
		 driver.findElement(By.xpath("//span[text()='Immigration Status']")).click();*/
		 
		 /*	 driver.findElement(By.xpath("//a[@id='anc_tab91C']")).click();
		 driver.findElement(By.xpath("(//input[@id='chkprojectactivity'])[1]")).click();
		 driver.findElement(By.xpath("//em[@class='fa fa-check']")).click();*/
		 driver.close();
		 
		 
		 
	}

}
