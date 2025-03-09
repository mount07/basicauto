package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XImageSinglePage {
	static File dir;
	static WebDriver driver;
	static String url = "https://boombo.biz/en/naked-girls/47611-amy-tsareva-nude.html";
	static String imgPath = "div>a.highslide";
	
	static {
		BrowserManager.setDriver();
		driver = BrowserManager.getDriver();
	}

	public static void createDirectoy() {
		dir = new File("D:\\bulkdoc\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}
	
	public static final WebDriver getDriver() {
		BrowserManager.setDriver();
		return BrowserManager.getDriver();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
//		BrowserManager.setDriver();
//		driver = BrowserManager.getDriver();
		
			createDirectoy();
			for(String imageUrl : getImageLinks(url)) {
				doFormattingAndDownload(imageUrl);
			}
		driver.close();
	}

	public static List<String> getImageLinks(String url) {
		driver.get(url);
		List<WebElement> pageEls = driver.findElements(By.cssSelector(imgPath));
		List<String> pageLinks = new ArrayList<>();
		for(WebElement pageEl : pageEls) {
			pageLinks.add(pageEl.getAttribute("href"));
		}
		
		return pageLinks;
	}
	
	public static void doFormattingAndDownload(String url) throws InterruptedException, IOException {
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
