package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest4 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\abcd\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		for (int i = 1; i <= 66; i++) {
			String url = "https://nacktsonnen.com/fkk-bilder/albums/userpics/23181/eine_Tag_am_Meer_" + i
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
