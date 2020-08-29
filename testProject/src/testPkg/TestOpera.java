package testPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestOpera {

	public static void main(String[] args) throws IOException {
		System.out.println(" _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  \r\n" + 
				"|_   _| ____/ ___|_   _| / ___|_   _|/ \\  |  _ \\_   _| ____|  _ \\ \r\n" + 
				"  | | |  _| \\___ \\ | |   \\___ \\ | | / _ \\ | |_) || | |  _| | | | |\r\n" + 
				"  | | | |___ ___) || |    ___) || |/ ___ \\|  _ < | | | |___| |_| |\r\n" + 
				"  |_| |_____|____/ |_|   |____/ |_/_/   \\_\\_| \\_\\|_| |_____|____/ ");
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\Administrator\\Documents\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		
	}
	
	
	

}
