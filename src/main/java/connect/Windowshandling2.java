package connect;

import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://connectqa.vultus.com/Login.aspx");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='Products']")).click();
		 
		
		 Set <String> windowIds = driver.getWindowHandles();
		//Approach 1 for 2/3 windows
		 //Converting set into list collection ,to extract multiple items one by one ,in set we cannot get multiple items by ids
		 //set doesn't have get method
		/* List<String> windowList  = new ArrayList(windowIds);
		 
		 String firsTab=windowList.get(0);
		 String secondTab=windowList.get(1);
		 
		 driver.switchTo().window(secondTab);
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(firsTab);
		 System.out.println(driver.getTitle());
		 */
		/* 
		 for (String winId:windowIds) 
		 {
			String title= driver.switchTo().window(winId).getTitle();
			
			if (title.equals("Vultus Connect | Log-In"))
			{
			System.out.println(driver.getCurrentUrl());
			}
			
			 }*/
		 
		 for (String winId:windowIds) 
		 {
			String title= driver.switchTo().window(winId).getTitle();
			System.out.println(driver.getTitle());
			if(title.equals("Vultus Connect | Log-In"))
			{
				driver.close();// closes current/specific window
			}

		 }
		 driver.quit();//closes all the windows in the browser
	}
}
