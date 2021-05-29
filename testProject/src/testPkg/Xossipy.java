package testPkg;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xossipy {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(".........");
		WebDriver driver = new ChromeDriver();
		List<String> urls = Arrays.asList("https://xossipy.com/thread-32967.html");
		for (String url : urls) {
			extractLinks(driver, url);
		}

	}

	public static void extractLinks(WebDriver driver, String url) throws InterruptedException {

		driver.get(url);
		
		do {
			Thread.sleep(4000);

			List<WebElement> link = driver.findElements(By.cssSelector(".scaleimages img"));
			WebElement next = driver.findElement(By.cssSelector(".float_left .pagination_next"));
			
			for(WebElement el : link) {
				String href = el.getAttribute("src");
				System.out.println(href);
			}
			
			next.click();

		} while (driver.findElement(By.cssSelector(".float_left .pagination_next")).isDisplayed());

	}

}
