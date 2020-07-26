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

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(".........");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1010, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Administrator/Downloads/Riya%20(@riya.shines)%20TikTok%20_%20Watch%20Riya's%20Newest%20TikTok%20Videos.html");
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.cssSelector(".video-feed a"));
		
		for(WebElement link : links) {
			String href = link.getAttribute("href");
			write("D:\\riya.shines.txt", href);
		}
		
		
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