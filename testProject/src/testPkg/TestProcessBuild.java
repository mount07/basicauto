package testPkg;

import java.io.File;
import java.io.IOException;

public class TestProcessBuild {

	public static void main(String[] args) throws IOException {
		String command =
				  "curl -X GET https://postman-echo.com/get?foo1=bar1&foo2=bar2";
				ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
				processBuilder.directory(new File("/home/"));
				Process process = processBuilder.start();
	}
	
}
