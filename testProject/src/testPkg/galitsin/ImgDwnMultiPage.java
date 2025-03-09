package testPkg.galitsin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnMultiPage {
	static File dir;
	static WebDriver driver;
	

	public static void createDirectoy(String name) {
		dir = new File("D:\\temp\\GG2\\" + name); //System.currentTimeMillis());
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
		for(int i = 563; i<= 566; i++) {
			driver.get("https://vipergirls.to/threads/1111573-Galitsin-Works-A-Z-(1999-2021)/page" + i);
			getImgLinks();
		}
		
	}

	public static void getImgLinks() throws InterruptedException, IOException {
//		driver = new ChromeDriver();
//		driver.get("https://vipergirls.to/threads/1111573-Galitsin-Works-A-Z-(1999-2021)/page567");

		Thread.sleep(10000);
		List<WebElement> contents = driver.findElements(By.cssSelector(".postbody .content [id*='post_message_']"));
		
		for(WebElement content : contents) {
			WebElement title = content.findElement(By.cssSelector("font b"));
			System.out.println(title.getText());
			createDirectoy(title.getText());
			Thread.sleep(2000);
			List<WebElement> imgLinks = content.findElements(By.cssSelector("img"));
			
			int fileCounter = 1;
			for(WebElement imgLink : imgLinks) {
				String url = imgLink.getAttribute("src");
				url = url.replace("https://imx.to/u/t", "https://i006.imx.to/i");
				System.out.println(url);
//				FileClass.writeFile("C:\\Users\\dev\\Documents\\urlsUpdate.txt", url);
				 
				doFormatting(url, fileCounter);
				fileCounter++;
				Thread.sleep(500);
			}
		}
	}

	public static void doFormatting(String url, int fileCounter) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(500);
		
//		int randomNum = new Random().nextInt(9000) + 1000;
		String modifiedFilename = fileCounter + "_" + filename;
		
		downloadFile(url, modifiedFilename);

	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
