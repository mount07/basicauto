package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest4 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()) {
			theDir.mkdirs();
		}

		String base = "https://www.nudist-theater.com/members/photos/Public%20Nudist%20Beach/063015301757/xlarge/0";
		String url = "";
		String suffix = ".jpg";
		
		for (int i = 1; i <= 370; i++) {
			if (i < 10)
				url = base + "00" + i + suffix;
			else if (i < 100)
				url = base + "0" + i + suffix;
			else
				url = base + i + suffix;

			long slashes = url.chars().filter(ch -> ch == '/').count();
			int j = (int) slashes;

			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);

			Thread.sleep(2000);

			Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
					new File(theDir.getPath()));
		}

	}
	
	
}
