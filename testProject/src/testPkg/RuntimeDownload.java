package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RuntimeDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		List<String> urls = Arrays.asList();
		download(urls);
	}

	public static void download(List<String> urls) throws InterruptedException, IOException {

		File theDir = new File("C:\\Users\\abcd\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		int i = 1;

		for (String url : urls) {
			Thread.sleep(1000);

			String filename = url.split("/")[8];
			filename = i + filename;
			System.out.println(url.split("/")[8]);

			Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
					new File(theDir.getPath()));
			i++;
		}
	}

	public static void download(String url, File dir) throws InterruptedException, IOException {

		
		Thread.sleep(1000);
		int count = (int) url.chars().filter(ch -> ch == '/').count();
		String filename = url.split("/")[count];
		System.out.println(url.split("/")[count]);

		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				dir);
	}

}
