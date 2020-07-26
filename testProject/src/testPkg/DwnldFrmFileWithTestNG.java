package testPkg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwnldFrmFileWithTestNG {
	
	public void downloadFrom(String filePath) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		List<String> urls = Files.readAllLines(Paths.get(filePath));

		for (String url : urls) {
			driver.get("https://snaptik.app/in");
			WebElement box = driver.findElement(By.cssSelector("input#url"));
			WebElement btn = driver.findElement(By.cssSelector("button.btn-download"));
			System.out.println(url);
			box.sendKeys(url);
			btn.click();
			WebElement alert = driver.findElement(By.cssSelector(".alert.alert-warning"));
			for (int i = 0; i <= 4; i++) {
				if (alert.isDisplayed()) {
					driver.get("https://snaptik.app/in");
					box.sendKeys(url);
					btn.click();
				}
			}

			Thread.sleep(10000);
			try {
				WebElement dwnbtn = driver
						.findElement(By.cssSelector("#div_download #download-block>div>a:nth-child(1)>span"));
				if (dwnbtn.isDisplayed()) {
					dwnbtn.click();
					Thread.sleep(10000);
					FileClass.writeFile("D:\\downloaded.txt", url);
					FileClass.deleteFromFile(filePath, url);
				} else
					FileClass.writeFile("D:\\downloadFailed.txt", url);
			} catch (NoSuchElementException exception) {
				// TODO: handle exception
			}
		}
	}

	@Test
	public void download() throws IOException, InterruptedException {
		System.out.println("......... Starting .........");

		downloadFrom("D:\\mountr-org.txt");
		
		/*
		Callable<Void> callable1 = new Callable<Void>()
		   {
		      @Override
		      public Void call() throws Exception
		      {
		    	  downloadFrom("D:\\prekr.txt");
		         return null;
		      }
		   };

		   Callable<Void> callable2 = new Callable<Void>()
		   {
		      @Override
		      public Void call() throws Exception
		      {
		    	  downloadFrom("D:\\rajd.txt");
		         return null;
		      }
		   };
		   
		   List<Callable<Void
		   >> taskList = new ArrayList<Callable<Void>>();
		   taskList.add(callable1);
		   taskList.add(callable2);
		   
		   ExecutorService executor = Executors.newFixedThreadPool(2);

		   try
		   {
		      //start the threads and wait for them to finish
		      executor.invokeAll(taskList);
		   }
		   catch (InterruptedException ie)
		   {
		      //do something if you care about interruption;
		   }
		*/
	}
}
