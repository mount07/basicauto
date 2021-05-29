package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File theDir = new File("C:\\Users\\abcd\\Downloads\\katherinne-sofia");

		String url = "https://p4k7u4x7.ssl.hwcdn.net/content/190364/spectacular-long-legged-vixen-stripping-and-posing-outside-on-the-terrace-bed-15";

		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String basename = url.split("/")[j].replaceAll("\\d", "");
		String baseUrl = url.replace(url.split("/")[j], "");
		System.out.println(baseUrl);
		String filecount = url.split("/")[j];
//		String numberOnly = filecount.replaceAll("[^0-9]", "");
		int count = Integer.parseInt(filecount.replaceAll("[^0-9]", ""));
		System.out.println(count);

		while (count > 0) {
			if (count >= 10) {
				url = baseUrl + basename + count + ".jpg";
				System.out.println(url);
			} else {
				url = baseUrl + basename + "0" + count + ".jpg";
				System.out.println(url);
			}
			System.out.println(count);

			count--;

			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			System.out.println(StringUtils.extractInt(filename));
			Thread.sleep(500);

//			Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
//					new File(theDir.getPath()));
		}

	}

}
