package testPkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(":::::::::::: Starting :::::::::::::");

		String dir = "A:\\media\\";
		String downloadFilepath = dir + "success\\";
		String downloadSourceFile = dir + "source.txt";
		String downloadSuccessFile = dir + "success.txt";
		String downloadFailedFile = dir + "failed.txt";

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
		driver.manage().deleteAllCookies();
		
//		Thread.sleep(20000);
		}
		
	}
}
