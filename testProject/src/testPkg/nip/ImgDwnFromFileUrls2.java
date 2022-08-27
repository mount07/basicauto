package testPkg.nip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import testPkg.StringUtils;

public class ImgDwnFromFileUrls2 {
	static File dir;

	public static void createDirectoy(String name) {
		dir = new File("F:\\bulkdoc\\" + name);
		if (!dir.exists()) {
			dir.mkdirs();
		}
	}

	public static void main(String[] args) throws Exception {

		readFromFile();
		for (String url : readFromFile()) {
			doFormatting(url);
		}
	}

	public static List<String> readFromFile() throws Exception {

		File file = new File("F:\\bulk\\urlstemp.txt");

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
		
		
		String name = url.split(";")[0];
		String id = url.split(";")[1];
		String cat = url.split(";")[3];
		int count = Integer.parseInt(url.split(";")[4]);
		
		
		String baseUrl = "https://www.nudist-theater.com/members/photos/" + cat + "/" + id + "/xlarge/";
		System.out.println(baseUrl);

		createDirectoy(name + " - " + id);

		while (count > 0) {
			if (count >= 1000) {
				url = baseUrl + count + ".jpg";
			} else if (count >= 100) {
				url = baseUrl + "0" + count + ".jpg";
			} else if (count >= 10) {
				url = baseUrl + "00" + count + ".jpg";
			} else {
				url = baseUrl + "000" + count + ".jpg";
			}
			System.out.println(url);
			
			String filename = ""+ count + ".jpg";
			System.out.println(StringUtils.extractInt(filename));
			Thread.sleep(500);

			downloadFile(url, filename);
			
			count--;
		}
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
