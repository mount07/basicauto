package testPkg.nip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import testPkg.StringUtils;

public class EventsRuntimeDwn {
	static File dir;

	public static void createDirectoy(String name) {
		dir = new File("F:\\Events\\" + name);
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

		File file = new File("F:\\urlsfinal.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		List<String> urls = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			urls.add(st);
		}
		return urls;
	}

	public static void doFormatting(String urlInput) throws InterruptedException, IOException {
		
		
		String name = urlInput.split(";")[0];
		String id = urlInput.split("/")[6];
		String cat = urlInput.split("/")[7];
		int count = Integer.parseInt(urlInput.split(";")[2]);
		String url = "";
		
		
		String baseUrl = urlInput.split(";")[1];
		System.out.println("baseurl : " + baseUrl);

		createDirectoy(name);

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
			System.out.println("final url : " + url);
			
			String filename = id + "-" + cat + "-" + count + ".jpg";
			System.out.println(StringUtils.extractInt("filename : " + filename));
			Thread.sleep(2000);

			downloadFile(url, filename);
			
			count--;
		}
	}

	public static void downloadFile(String url, String filename) throws IOException {
		Process process = Runtime.getRuntime().exec("cmd /c " + "curl " + url + " --output " + filename, null,
				new File(dir.getPath()));
	}

}
