package testPkg;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImgLinksOfPage {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		getImgLinks();

		driver.close();
	}

	public static void getImgLinks() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://www.famousboard.com/threads/71711-Katherinne-Sofia-Rodriguez");

		Thread.sleep(10000);
		List<WebElement> imgLinks = driver
				.findElements(By.cssSelector("a[href*='.jpg']"));
		for (WebElement vid : imgLinks) {
			String url = vid.getAttribute("href");
			System.out.println(url);
		}
	}

}
