package testPkg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwnldFrmFile {
//	public static void main(String[] args) throws InterruptedException, IOException {
//		System.out.println(".........");
//
//		WebDriver driver = new ChromeDriver();
//
//		List<String> urls = Files.readAllLines(Paths.get("D:\\prekr.txt"));
//
//		for (String url : urls) {
//			driver.get("https://snaptik.app/in");
//			WebElement box = driver.findElement(By.cssSelector("input#url"));
//			WebElement btn = driver.findElement(By.cssSelector("button.btn-download"));
//			System.out.println(url);
//			box.sendKeys(url);
//			btn.click();
//			WebElement alert = driver.findElement(By.cssSelector(".alert.alert-warning"));
//			for (int i = 0; i <= 4; i++) {
//				if (alert.isDisplayed()) {
//					driver.get("https://snaptik.app/in");
//					box.sendKeys(url);
//					btn.click();
//				}
//			}
//
//			Thread.sleep(10000);
//			try {
//				WebElement dwnbtn = driver
//						.findElement(By.cssSelector("#div_download #download-block>div>a:nth-child(1)>span"));
//				if (dwnbtn.isDisplayed()) {
//					dwnbtn.click();
//					Thread.sleep(10000);
//					FileClass.writeFile("D:\\downloaded.txt", url);
//				} else
//					FileClass.writeFile("D:\\downloadFailed.txt", url);
//			} catch (NoSuchElementException exception) {
//				// TODO: handle exception
//			}
//		}

//	}
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%05d ", i);
		}

//		for (int k : getNumbers(4, 50)) {
//			System.out.println(k);
//		}
//
//		for (String k : getFormatedNumber(4, 150)) {
//			System.out.println(k);
//		}

		for (String k : getFormatedNumberList(4, 150)) {
			System.out.println(k);
		}
	}

	public static int[] getNumbers(int digitCount, int inputNumber) {
		int[] numbers = new int[inputNumber];
		for (int i = 0; i < inputNumber; i++) {
			numbers[i] = Integer.parseInt(String.format("%0" + digitCount + "d", i));
		}
		return numbers;
	}

	public static String[] getFormatedNumber(int digitCount, int inputNumber) {
		String[] numbers = new String[inputNumber];
		for (int i = 0; i < inputNumber; i++) {
			numbers[i] = String.format("%0" + digitCount + "d", i);
		}
		return numbers;
	}

	public static List<String> getFormatedNumberList(int digitCount, int inputNumber) {
		List<String> numberList = new ArrayList<>();
		for (int i = 0; i < inputNumber; i++) {
			numberList.add(String.format("%0" + digitCount + "d", i));
		}
		return numberList;
	}

}
