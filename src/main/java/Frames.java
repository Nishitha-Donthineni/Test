import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://software//new driver//Latestdriver//chromedriver//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.get("https://ui.vision/demo/webtest/frames/");
		 driver.manage().window().maximize();
		 //Frame 1
		 WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 driver.switchTo().frame(frame1);
		 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Nishitha D");
		 driver.switchTo().defaultContent();
		 
		
		 
		 //Frame2
		 WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		 driver.switchTo().frame(frame2);
		 driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Donthineni");
		 driver.switchTo().defaultContent();
		 
		 
		 //Frame 3
		 
		 WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(frame3);
		 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium learning");
		 driver.switchTo().defaultContent();
		 
		 
		/* driver.switchTo().frame(0);
	
		WebElement radioButton= driver.findElement(By.xpath("//div[@id='i9']//div[@class='rseUEf nQOrEb']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",radioButton);*/
		 
		
		 WebElement frame5 =driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		 driver.switchTo().frame(frame5);
		 driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		 WebElement image =driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
		 if(image.isDisplayed())
		  {
			 System.out.println(image.getText());
			 System.out.println("Logo is dispalayed");
		  }
		 else
		  {
			 System.out.println("Logo is not  dispalayed");
		  }
	/*	 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(frame5);
		 driver.switchTo().frame(0);*/
		 
		 
		 
		 
		 
		 
		
		 
	}

}
