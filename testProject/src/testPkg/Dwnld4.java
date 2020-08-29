package testPkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld4 {

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
		DesiredCapabilities cap = DesiredCapabilities.htmlUnit();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		WebDriver driver = new ChromeDriver(cap);

		Stream<Path> files = Files.list(Paths.get(downloadFilepath));
		long baseCount = files.count();
		long nextCount = baseCount;

		int size = Files.readAllLines(Paths.get(downloadSourceFile)).size();


		while (size > 0) {
			String url = Files.readAllLines(Paths.get(downloadSourceFile)).get(0);
			driver.get("https://ssstiktok.io/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement box = driver.findElement(By.cssSelector("input#main_page_text"));
			WebElement btn = driver.findElement(By.cssSelector("button#submit"));
			System.out.println(url.split("@")[1]);
			box.sendKeys(url);
			btn.click();

			FileClass.deleteLines(downloadSourceFile, 1, 1);
			System.out.println("Lines remaining : " + Files.readAllLines(Paths.get(downloadSourceFile)).size());

			Thread.sleep(15000);
			try {
				WebElement dwnbtn = driver
						.findElement(By.cssSelector(".result .without_watermark"));

				baseCount = nextCount;
				if (dwnbtn.isDisplayed()) {
					dwnbtn.click();
					Thread.sleep(15000);

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
				} else
					FileClass.writeFile(downloadFailedFile, url);
			} catch (NoSuchElementException exception) {
				// TODO: handle exception
			}
			size = Files.readAllLines(Paths.get(downloadSourceFile)).size();
		}
	}

}
