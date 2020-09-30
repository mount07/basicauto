package testPkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(":::::::::::: Starting :::::::::::::");

		String dir = "A:\\media\\";
		String downloadFilepath = dir + "success\\";
		String downloadSourceFile = dir + "source.txt";
		String downloadSuccessFile = dir + "success.txt";
		String downloadFailedFile = dir + "failed.txt";
		
		Stream<Path> files = Files.list(Paths.get(downloadFilepath));
		long baseCount = files.count();
		long nextCount = baseCount;

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--incognito");
		DesiredCapabilities cap = DesiredCapabilities.htmlUnit();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		WebDriver driver = new ChromeDriver(cap);
		
		List<String> urls = Files.readAllLines(Paths.get("A:\\media\\source.txt"));
		for(String url : urls) {
		String id = "https://tiktokdownloader.in/wp-admin/admin-ajax.php?action=wppress_tt_download&url=" + url + "&key=no-watermark";
		driver.get(id);
		System.out.println(id);
		
		Thread.sleep(25000);
		
		try (Stream<Path> file = Files.list(Paths.get(downloadFilepath))) {
			nextCount = file.count();
			if (nextCount > baseCount) {
				FileClass.writeFile(downloadSuccessFile, url);

				String fileName = FileClass.getLastModified(downloadFilepath).getName();
				String newName = url.split("@")[1].split("/")[0] + " - " + url.split("@")[1].split("/")[2];
				System.out.println("fileName : " + fileName);
				System.out.println("newName : " + newName);

				File f1 = new File(downloadFilepath + fileName);
				File f2 = new File(downloadFilepath + newName + ".mp4");
				f1.renameTo(f2);
			} else {
				FileClass.writeFile(downloadFailedFile, url);
				FileClass.writeFile(downloadSourceFile, url);
			}
			System.out.println("FileCount : " + nextCount);
		}
		driver.manage().deleteAllCookies();
		
//		Thread.sleep(20000);
		}
		
	}
}
