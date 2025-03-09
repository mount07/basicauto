package testPkg.galitsin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TurboImgDwnMultiPage {
	static File dir;
	static WebDriver driver;
	

	public static void createDirectoy(String name) {
		dir = new File("D:\\temp\\turboImg\\" + name); //System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
//		createDirectoy();
//		getImgLinks();
		getImages();
		
		driver.close(); 
	}
	
	public static void getImages() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		for(int i = 202; i<= 235; i++) {
			driver.get("https://www.turboimagehost.com/album/125303/my_images?p=" + i);
			System.out.println("https://www.turboimagehost.com/album/125303/my_images?p=" + i);
			getImgLinks(i);
		}
	}

	public static void getImgLinks(int num) throws InterruptedException, IOException {
		Thread.sleep(5000);
		List<WebElement> contents = driver.findElements(By.cssSelector(".row.galleryThumbs .thumbUrl"));
		List<String> pageUrls = new ArrayList<>();
		
		for(WebElement content : contents) {
			pageUrls.add(content.getAttribute("href"));
		}
		
		createDirectoy("page"+num);
		int fileCounter = 1;
		for(String pageUrl : pageUrls) {
			driver.get(pageUrl);
			Thread.sleep(500);
			String url = driver.findElement(By.cssSelector("#imageid")).getAttribute("src");
			
			doFormatting(url, fileCounter);
			fileCounter++;
			Thread.sleep(500);
		}
		
	}

	public static void doFormatting(String url, int fileCounter) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(200);
		
		String modifiedFilename = /* fileCounter + "_" + */filename;
		
		downloadFile(url, modifiedFilename);
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
