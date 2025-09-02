package practicewebsite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(("https://the-internet.herokuapp.com/javascript_alerts"));
		 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 Alert myAlert = driver.switchTo().alert();
		 myAlert.accept();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		 Alert myAlert1 = driver.switchTo().alert();
		 myAlert1.dismiss();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		 Alert myAlert2 = driver.switchTo().alert();
		 myAlert2.sendKeys("Hiee");
		 myAlert2.accept();
		 
		 

	}

}
