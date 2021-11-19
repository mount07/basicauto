package testPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImgDwnFsktr2 {
	static File dir;

	public static void createDirectoy() {
		dir = new File("C:\\Users\\deven\\Downloads\\" + System.currentTimeMillis());
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws Exception {
		
		readFromFile();
		for(String url : readFromFile()) {
		doFormatting(url);
		}
	}

	public static List<String> readFromFile() throws Exception {

		File file = new File("C:\\Users\\deven\\OneDrive\\Documents\\urls.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		List<String> urls = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			urls.add(st);
		}
		return urls;
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
			Thread.sleep(2000);

			downloadFile(url, filename);
		}
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
