package testPkg;

import java.io.File;
import java.io.IOException;

public class ImgDwnList {
	static File dir;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\dev\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "https://enf-cmnf.com/wp-content/gallery/enf-gallery/enf-embarrassed-pics-085.jpg";
		
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
			if (count >= 10) {
				url = baseUrl + basename + "0" +count + ".jpg";
			} else {
				url = baseUrl + basename + "00" + count + ".jpg";
			}
			System.out.println(url);
			count--;

			String filename = url.split("/")[j];
			System.out.println(url.split("/")[j]);
			System.out.println(StringUtils.extractInt(filename));
			Thread.sleep(500);

			downloadFile(url, filename);
		}
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
