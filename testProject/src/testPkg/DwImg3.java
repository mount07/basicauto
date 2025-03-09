package testPkg;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DwImg3 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		String url = "https://k5x5n5g8.ssl.hwcdn.net/content/1209/metart-uma-b-oberon-15.jpg";
		
		File theDir = new File("C:\\Users\\dev\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		String[] command = { "curl", "-I", url };
		Boolean status = null;
		
		status = getStatus(command, status);
		
		if(status) {
			RuntimeDownload.download(url, theDir);
		}

		System.out.println(status);

	}

	public static Boolean getStatus(String[] command, Boolean status) {
		ProcessBuilder process = new ProcessBuilder(command);
		Process p;
		try {
			p = process.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.getProperty("line.separator"));
			}
			String result = builder.toString();
			System.out.print(result);
			status = result.contains("HTTP/2 200");

		} catch (IOException e) {
			System.out.print("error");
			e.printStackTrace();
		}
		return status;
	}
}
