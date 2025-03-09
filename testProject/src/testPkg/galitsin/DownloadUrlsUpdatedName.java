package testPkg.galitsin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUrlsUpdatedName {
	static File dir;
	static WebDriver driver;
	static int fileCounter = 1;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\dev\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws Exception {
		createDirectoy();
		for (String url : getLinksFromFile()) {
			doFormatting(url);
		}
	}
	
	public static List<String> getLinksFromFile() throws Exception {
		File file = new File("C:\\Users\\dev\\Documents\\urls2.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		List<String> urls = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			urls.add(st);
		}
		return urls;
	}

	public static void doFormatting(String url) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(500);
		
//		int randomNum = new Random().nextInt(9000) + 1000;
		String modifiedFilename = "Katja_" + fileCounter + "_" + filename;
		fileCounter++;
		
		downloadFile(url, modifiedFilename);

	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
