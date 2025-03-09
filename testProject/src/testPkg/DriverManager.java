package testPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static void setDriver() {
//		WebDriverManager.firefoxdriver().setup();
		driver.set(new FirefoxDriver());
		
//		WebDriverManager.chromedriver().setup();
//		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void closeBrowser()
	{
		driver.get().close();
		driver.remove();
	}
}
