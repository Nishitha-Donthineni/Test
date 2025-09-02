package connect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsertesting {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.edge.driver", "D:\\software\\new driver\\edgedriver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();*/
		System.setProperty("webdriver.gecko.driver","D:\\software\\new driver\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://connectqa.vultus.com/Login.aspx");

	}

}
