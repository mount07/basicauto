package testPkg.nip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testPkg.FileClass;

public class ImgDwnUIAndRuntime3 {
	static File dir;
	static WebDriver driver;

//	public static void createDirectoy() {
//		dir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
//		if (!dir.exists()) {
//			dir.mkdirs();
//		}
//	}

	public static void main(String[] args) throws IOException, InterruptedException {
//		createDirectoy();
		getImgLinks();

		driver.close();
	}

	public static void getImgLinks() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://members.purenudism.com/members_only/access/pictures.cgi?p=1#base");
		Thread.sleep(20000);

		for (int i = 1; i <= 207; i++) {
			driver.get("https://members.purenudism.com/members_only/access/pictures.cgi?p=" + i + "#base");
			Thread.sleep(2000);
			List<WebElement> imgLinks = driver
					.findElements(By.cssSelector("[href*='gallery.cgi?gid='] span:not([style*='7pt'])"));

			for (WebElement link : imgLinks) {
				System.out.println(link.getText());
				String url = link.findElement(By.xpath("..")).getAttribute("href");
				System.out.println(url);
				String countTxt = link.findElement(By.xpath("../../../..")).findElement(By.cssSelector("tr p span"))
						.getText();
				int count = Integer.parseInt(countTxt.replaceAll("[\\D]", ""));
				System.out.println(count);
				
				FileClass.writeFile("F:\\urls.txt", link.getText());
				FileClass.writeFile("F:\\urls.txt", url);
				FileClass.writeFile("F:\\urls.txt", ""+count);
			}

			Thread.sleep(5000);
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
