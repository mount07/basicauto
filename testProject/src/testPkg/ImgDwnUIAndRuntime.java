package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnUIAndRuntime {
	static File dir;
	static WebDriver driver;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		createDirectoy();
		for (String url : getImgLinks()) {
			doFormatting(url);
		}
	}

	public static List<String> getImgLinks() {
		driver = new ChromeDriver();
		driver.get("http://pokazuha.org/view/topic.cfm?key_or=875326");

		List<WebElement> imgLinks = driver.findElements(By.cssSelector("[id*='ppp'] img"));

		List<String> imgUrls = new ArrayList<String>();

		for (WebElement imgLink : imgLinks) {
			String url = imgLink.getAttribute("src");
			System.out.println(url);
			imgUrls.add(url);
		}
		
		driver.close();

		return imgUrls;
	}

	public static void doFormatting(String url) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(1000);

		downloadFile(url, filename);

	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
