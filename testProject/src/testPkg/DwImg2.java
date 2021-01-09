package testPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwImg2 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(300,250));
		String txt = "https://f6j6u6m9.ssl.hwcdn.net/content/200246/0001-";

		List<String> urls = new ArrayList<String>();
		
		for (int i = 1; i <= 9; i++) {
			urls.add(txt + "0" + i + ".jpg");
		}
		for (int i = 0; i <= 9; i++) {
			urls.add(txt + "1" + i + ".jpg");
		}
		urls.add(txt + "20" + ".jpg");

		for (String url : urls) {
			driver.get(url);
//			Thread.sleep(1000);
			System.out.println(url);

			Robot robot = new Robot();

			robot.delay(300);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}
}
