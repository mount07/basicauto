package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Auto\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://develop.jomi.com");
		
		WebElement pass = driver.findElement(By.cssSelector("[placeholder='Enter Password']"));
		WebElement login = driver.findElement(By.cssSelector("[type='submit']"));
		
		
		pass.sendKeys("jomi");
		login.click();
		
		WebElement msgClose = driver.findElement(By.cssSelector("[data-testid='CloseOutlinedIcon']"));
		
		msgClose.click();
	}
}
