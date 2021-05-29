package testPkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(".........");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1010, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		extractLinks(driver);
		
	}

	public static void extractLinks(WebDriver driver) throws InterruptedException {
//		for (int i = 0; i <= 13; i++) {

			driver.get("https://www.erome.com/a/prFqZ2xb");

			Thread.sleep(10000);

			List<WebElement> links = driver.findElements(By.cssSelector("#album .media-group .img-front"));

			for (WebElement link : links) {
				String href = link.getAttribute("src");
//			write("A:\\piyanka_mongia.txt", href);
				System.out.println(href);
			}
//		}
	}
	
	public static void write(String filePath, String text) {
		try {
			File file = new File(filePath);
			FileWriter myWriter = new FileWriter(file, true);
			myWriter.write(text + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}