package testPkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class GetLinksxHams {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(".........");

//		System.setProperty("webdriver.opera.driver", "D:\\Auto\\drivers\\operadriver_win32\\operadriver.exe");
//		WebDriver driver = new OperaDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\driver\\chromedriver.exe");
		WebDriver driver;

		List<String> urls = Arrays.asList(
				
				"https://xhamster16.desi/photos/gallery/13836971/379290232");
		for (String url : urls) {
			Thread.sleep(5000);
			driver = new ChromeDriver();
			extractLinks(driver, url);
		}

	}

	public static void extractLinks(WebDriver driver, String url) throws InterruptedException, IOException {
		Actions action = new Actions(driver);
		List<String> imgUrls = new ArrayList<String>();
		driver.get(url);

		WebElement diagbox = driver.findElement(By.cssSelector(".desktop-dialog__footer button"));
		if (diagbox.isDisplayed()) {
			diagbox.click();
		}
		WebElement count = driver.findElement(By.cssSelector(".photo-amounts-info"));
		do {
			Thread.sleep(2000);

			WebElement link = driver.findElement(By.cssSelector(".fotorama__stage__frame.fotorama__active img"));
			String href = link.getAttribute("src");

			System.out.println(href);
			imgUrls.add(href);

			WebElement next = driver.findElement(By.cssSelector(".fotorama__arr--next"));
			action.moveToElement(link).perform();
			next.click();

		} while (!count.getText().split("/")[0].equals(count.getText().split("/")[1]));

		driver.quit();
		RuntimeDownload.download(imgUrls);

//		for (int i = 0; i <= 32; i++) {
//			Thread.sleep(5000);
//
//			WebElement link = driver.findElement(By.cssSelector(".fotorama__stage__frame.fotorama__active img"));
//			String href = link.getAttribute("src");
//
//			System.out.println(href);
//
//			WebElement next = driver.findElement(By.cssSelector(".fotorama__arr--next"));
//			next.click();
//		}
	}

}