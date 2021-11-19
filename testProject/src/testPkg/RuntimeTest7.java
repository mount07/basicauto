package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest7 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

			String url = "https://cdn5-images.motherlessmedia.com/images/B36D805.jpg";
			
			int j = 4;
			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			
			Thread.sleep(500);

			Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
					new File(theDir.getPath()));
		}

}
