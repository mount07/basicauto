package testPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
//		Process process = Runtime.getRuntime().exec("ping www.stackabuse.com");
		
		Process process = Runtime.getRuntime()
		        .exec("cmd /c curl https://f6j6u6m9.ssl.hwcdn.net/content/191143/0028-01.jpg --output kacy.jpg", null, new File("C:\\Users\\abcd"));
		
		printResults(process);
	}
	
	public static void printResults(Process process) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = "";
	    while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	    }
	}
}
