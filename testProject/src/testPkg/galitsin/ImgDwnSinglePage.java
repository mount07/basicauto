package testPkg.galitsin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnSinglePage {
	static File dir;
	static WebDriver driver;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		getMultiImages();
		
		driver.close(); 
	}
	
//	public static void navigate(String pageUrl) {
//		driver.get(pageUrl);
//	}
	
	public static void getMultiImages() throws InterruptedException, IOException {
		driver.get("https://vipergirls.to/threads/3516201-Apricot-Super-Girl-(x100)(-2018-01-14)");
        Thread.sleep(10000);
//        getImgLinks();
        getContent();
    }
	
	public static void getContent() throws InterruptedException, IOException {
		
		List<WebElement> contents = driver.findElements(By.cssSelector(".postbody .content [id*='post_message_']"));
		for(WebElement content : contents) {
			List<WebElement> imgLinks = content.findElements(By.cssSelector("img"));
			
			if(imgLinks.size() > 4) {
				createDirectory("page" + " - " + getFolderName(content));
				extractUrls(content);
			}
			
		}
	}
	
	public static void extractUrls(WebElement content) throws InterruptedException, IOException {
		List<WebElement> imgLinks = content.findElements(By.cssSelector("img"));
		int fileCounter = 1;
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
                url = url.replace("https://imx.to/u/t/", "https://i006.imx.to/i/");
            }
            else if (url.contains("https://imx.to/upload/small/")) {
                url = url.replace("https://imx.to/upload/small/", "https://i001.imx.to/i/");
            }
//            else if (url.contains("https://thumbs2.imgbox")) {
//                url = url.replace("https://thumbs2.imgbox", "https://images2.imgbox");
//                url = url.replace("_t", "_o");
//            }
//            else if (url.contains("https://thumbs4.imagebam")) {
//                url = url.replace("https://thumbs4.imagebam", "https://images4.imagebam");
//                url = url.replace("_t", "_o");
//            }
//            else if (url.contains("https://i7.vipr.im/th")) {
//                url = url.replace("https://i7.vipr.im/th", "https://i7.vipr.im/i");
//            }
//            else {
//                url = "";
//            }
            
            if(url!="") {
            	System.out.println("Converted : " + url);
                
                doFormatting(url, fileCounter);
                fileCounter++;
            }
        }
	}
	
	public static String getFolderName(WebElement content) {
		//.postdetails .content a
    	List<WebElement> titleEl = content.findElements(By.cssSelector("font[size='3'],font[size='4'],.postcontent>b:nth-child(1)"));
    	String title = "";
    	if(titleEl.size() > 0) {
    		title = titleEl.get(0).getText()+System.currentTimeMillis();;
    	} else {
    		title = ""+System.currentTimeMillis();
		}
    	return title;
	}
	
	public static void createDirectory(String name) {
    	name = name.replaceAll("[#%&{}\\\\<>*?/$!'\":@+`|=]", "");
    	name = name.replaceAll("[\\n\\r]", "");
    	if (name.length() > 100) {
    		name = name.substring(0, 100);
        }
    	System.out.println(name);
        dir = new File("D:\\temp\\Apricot\\" + name);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
	
	public static void formatFileUrl() {
		
	}
	
	public static void doFormatting(String url, int fileCounter) throws InterruptedException, IOException {

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String filename = url.split("/")[j];
		System.out.println(url.split("/")[j]);
		Thread.sleep(10000);
		
//		int randomNum = new Random().nextInt(9000) + 1000;
		String modifiedFilename = fileCounter + "_" + filename;
		
		downloadFile(url, modifiedFilename);

	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
