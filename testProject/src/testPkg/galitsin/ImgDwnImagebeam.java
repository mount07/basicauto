package testPkg.galitsin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgDwnImagebeam {
    static File dir;
    static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        getImgLinks();
        driver.close();
    }

    public static void getImgLinks() throws InterruptedException, IOException {
        initializeDriver();
        navigateToPage("https://vipergirls.to/threads/1111573-Galitsin-Works-A-Z-(1999-2021)/page560");
        waitForPageLoad(10000);
        List<WebElement> contents = getContentElements();

        for (WebElement content : contents) {
            processContent(content);
        }
    }

    private static void initializeDriver() {
        driver = new ChromeDriver();
    }

    private static void navigateToPage(String url) {
        driver.get(url);
    }

    private static void waitForPageLoad(int milliseconds) throws InterruptedException { 
        Thread.sleep(milliseconds);
    }

    private static List<WebElement> getContentElements() {
        return driver.findElements(By.cssSelector(".postbody .content [id*='post_message_']"));
    }

    private static void processContent(WebElement content) throws InterruptedException, IOException {
    	List<WebElement> titleEl = content.findElements(By.cssSelector("font b"));
    	String title = "";
    	if(titleEl.size() > 0) {
    		title = titleEl.get(0).getText();
    	} else {
    		title = ""+System.currentTimeMillis();
		}
        System.out.println(title);

        waitForPageLoad(2000);
        List<WebElement> imgLinks = content.findElements(By.cssSelector("img"));

        if (imgLinks.size() > 1 && titleEl.size() > 0) {
            createDirectory(title);
            processImageLinks(imgLinks, title);
        }
    }

    public static void createDirectory(String name) {
        dir = new File("D:\\temp\\GG2\\" + name);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    private static void processImageLinks(List<WebElement> imgLinks, String title) throws InterruptedException, IOException {
        int fileCounter = 1;
        for (WebElement imgLink : imgLinks) {
            String url = imgLink.getAttribute("src");
            
            if(url.contains("https://imx.to/u/t")) {
            	url = url.replace("https://imx.to/u/t", "https://i006.imx.to/i");
            }
            
            System.out.println(url);
            // FileClass.writeFile("C:\\Users\\dev\\Documents\\urlsUpdate.txt", url);

            doFormatting(url, fileCounter);
            fileCounter++;
            waitForPageLoad(500);
        }
    }

    public static void doFormatting(String url, int fileCounter) throws InterruptedException, IOException {
        long slashes = url.chars().filter(ch -> ch == '/').count();
        int j = (int) slashes;

        String filename = url.split("/")[j];
        System.out.println(url.split("/")[j]);
        waitForPageLoad(500);

        String modifiedFilename = fileCounter + "_" + filename;
        downloadFile(url, modifiedFilename);
    }

    public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}
}