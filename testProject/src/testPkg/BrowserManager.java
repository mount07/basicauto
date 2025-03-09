package testPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {

private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static  void setDriver() {
		driver.set(new ChromeDriver());
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
