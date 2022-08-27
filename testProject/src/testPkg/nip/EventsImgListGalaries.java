package testPkg.nip;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testPkg.FileClass;

public class EventsImgListGalaries {
	static File dir;
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		getImgLinks();

		driver.close();
	}

	public static void getImgLinks() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://madlad2590:Madmax@2021@members.purenudism.com/members_only/access/event-pictures.cgi?p=3&event=21");
		Thread.sleep(10000);

		for (int i = 1; i <= 322; i++) {
			driver.get("https://members.purenudism.com/members_only/access/event-pictures.cgi?p=" + i + "&event=all");
			Thread.sleep(2000);
			List<WebElement> imgLinks = driver
					.findElements(By.cssSelector("[href*='gallery.cgi?gid='] span:not([style*='7pt'])"));

			for (WebElement link : imgLinks) {
				System.out.println(link.getText());
				String url = link.findElement(By.xpath("..")).getAttribute("href");
				System.out.println(url);
				String countTxt = link.findElement(By.xpath("../../../..")).findElement(By.xpath("./following-sibling::tr")).findElement(By.cssSelector("p span"))
						.getText();
				int count = Integer.parseInt(countTxt.replaceAll("[\\D]", ""));
				System.out.println(count);
				
				System.out.println(link.getText().replaceAll("\\d", "").trim() + ";" + url + ";" + count);
				
				FileClass.writeFile("F:\\urlsnew.txt", link.getText().replaceAll("\\d", "").trim() + ";" + url + ";" + count);
			}

			Thread.sleep(2000);
		}

	}

}
