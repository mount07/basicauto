package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest4 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		for (int i = 10; i <= 20; i++) {
			String url = "https://k5x5n5g8.ssl.hwcdn.net/content/190864/0012-" + i
					+ ".jpg";
			
			int j = 5;
			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			
			Thread.sleep(500);

			Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
					new File(theDir.getPath()));
		}

	}

}
