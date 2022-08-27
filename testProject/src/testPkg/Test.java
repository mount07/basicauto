package testPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		renameFiles();
//		extractNameOfFiles();
	}

//--------------------------------------------------------------------------------------------------		 

//		List<String> lines = Files.readAllLines(Paths.get("D:\\source.txt"));
//		
//		File inputFile = new File("D:\\snigdhahelenite.txt");
//		File deleteFile = new File("D:\\source.txt");
//		
//		for(String lineToRemove : lines) {
//		FileClass.findAndRemoveLine(inputFile, lineToRemove);
//		}
//		
//		FileClass.findAndDeleteFromFile(inputFile, deleteFile);

//--------------------------------------------------------------------------------------------------

//		String text = "https://www.tiktok.com/@divanshirana/video/296804263106756608";
//		String text1 = text.split("@")[1];
//		System.out.println(text1);
//		String text2 = text1.split("/")[0] + " - " + text1.split("/")[2];
//		System.out.println(text2);
//		
//		String text3 = text.split("@")[1].split("/")[0] + " - " + text.split("@")[1].split("/")[2];
//		System.out.println(text3);
//		 //---------------------------------
//		String fileName = "D:\\duplicate.txt";
//		String lineToRemove = "456";	
//		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//			stream.filter(line->!line.trim().equals(lineToRemove)).forEach(System.out::println);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//---------------------------------------------
//		System.out.println(Files.readAllLines(Paths.get("D:\\source.txt")).size());
//		System.out.println(Files.readAllLines(Paths.get("D:\\source.txt")).get(0));

//		deleteLines("D:\\duplicate.txt", 1, 2);

	private static void extractNameOfFiles() {
		String[] pathnames;

		// Creates a new File instance by converting the given pathname string
		// into an abstract pathname
		File f = new File("A:\\media\\skipped");

		// Populates the array with names of files and directories
		pathnames = f.list();

		// For each pathname in the pathnames array
		for (String pathname : pathnames) {
			// Print the names of files and directories
//	            System.out.println(pathname);
			String id = pathname.split("-")[1].trim();
			System.out.println("https://www.tiktok.com/@piyanka_mongia/video/" + id);
		}
	}
	// -----------------------------------

	private static void renameFiles() {
		String dirPath = "A:\\media\\success";
		String filePath = dirPath + "\\";
		File directoryPath = new File(dirPath);
		// List of all files and directories
		String name = "nishma194";
		String contents[] = directoryPath.list();
		System.out.println("List of files and directories in the specified directory:");
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i].split("-")[1]);
			System.out.println(contents[i]);
			File f1 = new File(filePath + contents[i]);
			File f2 = new File(filePath + name + " - " + contents[i].split("-")[1] + ".mp4");
			System.out.println("New name : " + name + " - " + contents[i].split("-")[1] + ".mp4");
			boolean b = f1.renameTo(f2);
			System.out.println(b);
		}
	}

	public static void deleteLines(String filename, int startline, int numlines) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			// String buffer to store contents of the file
			StringBuffer sb = new StringBuffer("");

			// Keep track of the line number
			int linenumber = 1;
			String line;

			while ((line = br.readLine()) != null) {
				// Store each valid line in the string buffer
				if (linenumber < startline || linenumber >= startline + numlines)
					sb.append(line + "\n");
				linenumber++;
			}
			if (startline + numlines > linenumber)
				System.out.println("End of file reached.");
			br.close();

			FileWriter fw = new FileWriter(new File(filename));
			// Write entire string buffer into the file
			fw.write(sb.toString());
			fw.close();
		} catch (Exception e) {
			System.out.println("Something went horribly wrong: " + e.getMessage());
		}
	}
	
	public static void writeToFile(String filePath, String text) {
		try {
			File file = new File(filePath);
			FileWriter myWriter = new FileWriter(file, true);
			myWriter.write(text + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
