package testPkg;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaOperation {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.opera.driver", "D:\\Auto\\drivers\\operadriver_win32\\operadriver.exe");

//		String opera_profile = "C:\\Users\\abcd\\AppData\\Roaming\\Opera Software\\Opera Stable";

		String opera_profile = "D:\\Auto\\Opera Stable";

		OperaOptions options = new OperaOptions();
		options.addArguments("user-data-dir=" + opera_profile);

		OperaDriver driver = new OperaDriver(options);
		driver.get("https://www.tiktok.com/@faya.ff");

		List<WebElement> links = driver.findElements(By.cssSelector(".video-feed a[href*='https://www.tiktok.com/@']"));

		for (WebElement link : links) {
			String href = link.getAttribute("href");
			System.out.println(href);
		}
	}

}
