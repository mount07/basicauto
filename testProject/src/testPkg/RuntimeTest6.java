package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest6 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		for (int i = 1; i <= 13; i++) {
			String url = "https://indiangirlsclub.com/wp-content/uploads/2018/07/big-boob-porn-photos-indian-babe-caught-naked-" + i
					+ ".jpg";
			
			int j = 7;
			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			
			Thread.sleep(500);

			Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
					new File(theDir.getPath()));
		}

	}

}
