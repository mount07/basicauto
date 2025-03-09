package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xhunter {
	static File dir;
	static WebDriver driver;

	public static void createDirectoy() {
		dir = new File("D:\\temp\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}
	
	public static final WebDriver getDriver() {
		BrowserManager.setDriver();
		return BrowserManager.getDriver();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		BrowserManager.setDriver();
		driver = BrowserManager.getDriver();
		
//		getDriver().get("https://www.hegrehunter.com/model/amberq/");
//		String url = "https://www.ftvhunter.com/model/kylie-2/";
		String url1 = "https://www.ftvhunter.com/model/kylie-2/";
		List<String> pages = getPageUrls("https://www.elitebabes.com/model/sanita/");
		System.out.println(pages);
		for (String page : pages) {
			createDirectoy();
			for(String url : getImageLinks(page)) {
				doFormattingAndDownload(url);
			}
		}
		driver.close();
	}

	public static List<String> getPageUrls(String url) {
		driver.get(url);
		List<WebElement> pageEls = driver.findElements(By.cssSelector("ul.list-gallery li a.has-img"));
		List<String> pageLinks = new ArrayList<>();
		for(WebElement pageEl : pageEls) {
			pageLinks.add(pageEl.getAttribute("href"));
		}
		return pageLinks;
	}

	public static List<String> getImageLinks(String url) {
		driver.get(url);
		List<WebElement> pageEls = driver.findElements(By.cssSelector("ul.list-gallery li a[data-fancybox*='gallery']"));
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
