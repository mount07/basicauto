package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksxHams {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(".........");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1010, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		extractLinks(driver);
		
	}

	public static void extractLinks(WebDriver driver) throws InterruptedException {
		
		driver.get("https://xhamster7.desi/photos/gallery/15596034/475876665");
		
		for (int i = 0; i <= 572; i++) {

			Thread.sleep(2000);

			WebElement link = driver.findElement(By.cssSelector(".fotorama__stage__frame.fotorama__active img"));

			String href = link.getAttribute("src");

			System.out.println(href);

			WebElement next = driver.findElement(By.cssSelector(".fotorama__arr--next"));
			next.click();

		}
	}
	
	
}