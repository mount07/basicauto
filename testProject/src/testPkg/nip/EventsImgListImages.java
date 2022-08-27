package testPkg.nip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testPkg.FileClass;

public class EventsImgListImages {
	static File dir;
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		readFromFile();
		
		driver = new ChromeDriver();
		driver.get("https://madlad2590:Madmax@2021@members.purenudism.com/members_only/access/event-pictures.cgi?p=3&event=21");
		
		for (String url : readFromFile()) {
			urlFormat(url);
		}
		
		driver.close();
	}
	
	public static List<String> readFromFile() throws Exception {

		File file = new File("F:\\eventurls.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		List<String> urls = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			urls.add(st);
		}
		return urls;
	}
	
	public static void urlFormat(String url) {
		
		driver.get(url.split(";")[1]);
		
		WebElement imgLink = driver.findElement(By.cssSelector("img[src*='thumbs']"));
		String id1 = imgLink.getAttribute("src").split("/")[6];
		String id2 = imgLink.getAttribute("src").split("/")[7];
		String finalUrl = url.split(";")[0] + ";" + "https://www.nudist-theater.com/members/photos/Naturist%20Family%20Events/" + id1 + "/" + id2 + "/native/" + ";" + url.split(";")[2];
		
		System.out.println(finalUrl);
		FileClass.writeFile("F:\\urlsfinal.txt", finalUrl);
	}

}
