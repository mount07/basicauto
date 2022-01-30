package testPkg;

import java.io.File;
import java.io.IOException;

public class ImgDwnFsktr {
	static File dir;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "https://www.nacktsonnen.com/fkk-bilder/albums/userpics/19452/FKK_Urlaub_in_Brasilien_194.jpg";
		
		doFormatting(url);
	}

	public static void doFormatting(String url) throws InterruptedException, IOException {
		url = url.replace(".jpg", "");
		long slashes = url.chars().filter(ch -> ch == '/').count();
		int j = (int) slashes;

		String basename = url.split("/")[j].replaceAll("\\d", "");
		String baseUrl = url.replace(url.split("/")[j], "");
		System.out.println(baseUrl);
		String filecount = url.split("/")[j];
//		String numberOnly = filecount.replaceAll("[^0-9]", "");
		int count = Integer.parseInt(filecount.replaceAll("[^0-9]", ""));

		createDirectoy();

		while (count > 0) {
//			if (count >= 10) {
				url = baseUrl + basename + count + ".jpg";
//			} else {
//				url = baseUrl + basename + "0" + count + ".jpg";
//			}
			System.out.println(url);
			count--;

			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			System.out.println(StringUtils.extractInt(filename));
			Thread.sleep(1000);

			downloadFile(url, filename);
		}
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
