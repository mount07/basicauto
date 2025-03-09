package testPkg.galitsin;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnSinglePageSimple2 {
	static File dir;
	static WebDriver driver;
	static boolean isSingleSet = true;
	static int fileCounter = 1;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
//		if (isSingleSet) {
//			String folderName = driver.findElement(By.cssSelector("#logo ~h1")).getText();
//			createDirectory(folderName + " - " + System.currentTimeMillis());
//		}
		
		List<String> urls = Arrays.asList(
			    "https://imgdrive.net/gallery-15584.html?p=6",
			    "https://imgdrive.net/gallery-15628.html?p=8",
			    "https://imgdrive.net/gallery-15147.html?p=5",
			    "https://imgdrive.net/gallery-8608.html?p=5",
			    "https://imgdrive.net/gallery-8852.html?p=5",
			    "https://imgdrive.net/gallery-8888.html?p=5",
			    "https://imgdrive.net/gallery-13098.html?p=1",
			    "https://imgdrive.net/gallery-12670.html?p=4",
			    "https://imgdrive.net/gallery-12547.html?p=2",
			    "https://imgdrive.net/gallery-12559.html?p=2",
			    "https://imgdrive.net/gallery-12555.html?p=1",
			    "https://imgdrive.net/gallery-13017.html?p=5",
			    "https://imgdrive.net/gallery-13402.html?p=2",
			    "https://imgdrive.net/gallery-13391.html?p=2",
			    "https://imgdrive.net/gallery-12428.html?p=6",
			    "https://imgdrive.net/gallery-13380.html?p=3",
			    "https://imgdrive.net/gallery-13063.html?p=6",
			    "https://imgdrive.net/gallery-12990.html?p=3",
			    "https://imgdrive.net/gallery-15721.html?p=0"
			);
		
		for (String url : urls) {
			getMultiImages(url);
		}
		
		driver.close(); 
	}
	
	public static void getMultiImages(String url) throws InterruptedException, IOException {
		int value = Integer.parseInt(url.split("\\?p=")[1]);
		url=url.split("\\?p=")[0] + "?p=";
		for(int i = 0 ; i<= value; i++) {
			driver.get(url + i);
            System.out.println(url + i);
            Thread.sleep(5000);
            String folderName = driver.findElement(By.cssSelector("#logo ~h1")).getText();
			createDirectory(folderName);
            getContent();
    	}
    }
	
	public static void getContent() throws InterruptedException, IOException {
		if (!isSingleSet) {
			createDirectory("singlePage" + " - " + System.currentTimeMillis());
		}
//		createDirectory("singlePage" + " - " + System.currentTimeMillis());
		extractUrls();	
	}
	
	public static void extractUrls() throws InterruptedException, IOException {
		List<WebElement> imgLinks = driver.findElements(By.cssSelector("#content a>img"));
//		int fileCounter = 1;
        for (WebElement imgLink : imgLinks) {
            String url = imgLink.getAttribute("src");
            System.out.println("Original : " + url);
            if (url.contains("https://t.imx.to/t/")) {
                url = url.replace("https://t.imx.to/t/", "https://i.imx.to/i/");
            }   
//            else if (url.contains("https://imx.to/u/t/")) {
//                url = url.replace("https://imx.to/u/t/", "https://i.imx.to/i/");
//            }
            else if (url.contains("https://imx.to/u/t/")) {
                url = url.replace("https://imx.to/u/t/", "https://i001.imx.to/i/");
            }
            else if (url.contains("https://imx.to/upload/small/")) {
                url = url.replace("https://imx.to/upload/small/", "https://i001.imx.to/i/");
            }
            else if (url.contains("https://imgdrive.net/images/small/")) {
                url = url.replace("https://imgdrive.net/images/small/", "https://imgdrive.net/images/big/");
            }
            else {
                url = "";
            }
            
            if(url!="") {
            	System.out.println("Converted : " + url);
                
                doFormatting(url, fileCounter);
                fileCounter++;
            }
        }
	}
	
	public static void createDirectory(String name) {  
		name = name.replaceAll("[#%&{}\\\\<>*?/$!'\":@+`|=]", "");
    	name = name.replaceAll("[\\n\\r]", "");
    	System.out.println(name);
        dir = new File("D:\\temp\\Single\\" + name);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
	
	public static void doFormatting(String url, int fileCounter) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(500);
		
//		int randomNum = new Random().nextInt(9000) + 1000;
		String modifiedFilename = fileCounter + "_" + filename;
		
		downloadFile(url, modifiedFilename);

	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
