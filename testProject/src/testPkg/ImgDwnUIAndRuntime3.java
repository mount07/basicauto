package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnUIAndRuntime3 {
	static File dir;
	static WebDriver driver;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
//		createDirectoy();
		getImgLinks();
		
		driver.close(); 
	}

	public static void getImgLinks() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://pornsavant.com/threads/1260575-Nutella-softcore-sets");

		Thread.sleep(10000);
		List<WebElement> imgLinks = driver.findElements(By.cssSelector("li.postcontainer .postcontent a img"));
		
		for(WebElement imgLink : imgLinks) {
			String url = imgLink.getAttribute("src");
			System.out.println(url);
			FileClass.writeFile("C:\\Users\\dev\\Documents\\urlsUpdate.txt", url);
//			doFormatting(url);
		}
			
	}

	public static void doFormatting(String url) throws InterruptedException, IOException {
		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(3000);

		downloadFile(url, filename);
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
