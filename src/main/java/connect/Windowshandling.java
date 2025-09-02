package connect;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// URL myURL= new URL("https://connectqa.vultus.com/Login.aspx");
		 //driver.navigate().to(myURL);
		 driver.navigate().to("https://connectqa.vultus.com/Login.aspx");
		 driver.navigate().to("https://recruitqa.vultus.com/SignIn.aspx");
		 
		 driver.navigate().back();
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.navigate().forward();
		 System.out.println(driver.getCurrentUrl());
		 
		 
		 driver.navigate().refresh();
		 driver.close();
		 
		 
	}

}
