package testPkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(":::::::::::: Starting :::::::::::::");
		
		String downloadFilepath = "D:\\downloaded";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.htmlUnit();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);

		List<String> urls = Arrays.asList(
				"https://www.tiktok.com/@riya.shines/video/6646673468538490117",  
				"https://www.tiktok.com/@riya.shines/video/6646662663499681030");
		
		
		for (String url : urls) {
			driver.get("https://snaptik.app/in");
			WebElement box = driver.findElement(By.cssSelector("input#url"));
			WebElement btn = driver.findElement(By.cssSelector("button.btn-download"));
			System.out.println(url);
			box.sendKeys(url);
			btn.click();
			WebElement alert = driver.findElement(By.cssSelector(".alert.alert-warning"));
			for (int i = 0; i <= 4; i++) {
				if (alert.isDisplayed()) {
					driver.get("https://snaptik.app/in");
					box.sendKeys(url);
					btn.click();
				}
			}

			Thread.sleep(10000);
			try {
				WebElement dwnbtn = driver
						.findElement(By.cssSelector("#div_download #download-block>div>a:nth-child(1)>span"));
				if (dwnbtn.isDisplayed()) {
					dwnbtn.click();
					Thread.sleep(16000);
					FileClass.writeFile("D:\\downloaded-riya.shines.txt", url);
				} else
					FileClass.writeFile("D:\\downloadFailed.txt", url);
			} catch (NoSuchElementException exception) {
				// TODO: handle exception
			}

		}
	}

}
