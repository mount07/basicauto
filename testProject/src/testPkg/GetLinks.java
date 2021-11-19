package testPkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(".........");
		System.setProperty("webdriver.chrome.driver", "D:\\auto\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1010, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		extractLinks(driver);
		
	}

	public static void extractLinks(WebDriver driver) throws InterruptedException, IOException {
		for (int i = 1; i <= 8; i++) {

			driver = new ChromeDriver();
			driver.get("file:///C:/Users/deven/Downloads/" + i + ".html");

			Thread.sleep(5000);

			List<WebElement> links = driver.findElements(By.cssSelector(".content-inner img.static"));

			List<String> imgs = new ArrayList<String>();
			for (WebElement link : links) {
				String href = link.getAttribute("src");
//			write("A:\\piyanka_mongia.txt", href);
				System.out.println(href.split("/")[8]);
				imgs.add(href.split("/")[8]);
			}
			download(imgs);
		}
	}
	
	public static void download(List<String> strList) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}
			for(String str : strList) {
				String url = "https://cdn5-images.motherlessmedia.com/images/" + str;
				
				int j = 4;
				String filename = url.split("/")[j];
				System.out.println(url.split("/")[j]);
				
				Thread.sleep(1000);

				Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
						new File(theDir.getPath()));
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