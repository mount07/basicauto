package testPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class FileClass {

	public static void main(String[] args) {

		readFileLineByLineUsingFiles("D:\\original.txt");
	}

	public static void readFileLineByLineUsingFiles(String filePath) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get(filePath));
			for (String line : allLines) {
				System.out.println(line);
				System.out.println("Line no : ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile(String filePath, String text) {
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

	public static boolean findStringInFile(File filePath, String text) throws IOException {
		return FileUtils.readFileToString(filePath).contains(text);
	}

	public static void deleteFromFile(String filePath, String lineText) {
		File inputFile = new File(filePath);
		File tempFile = new File("D:\\tempFile.txt");

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(tempFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String lineToRemove = "bbb";
		String currentLine;

		try {
			while ((currentLine = reader.readLine()) != null) {
				// trim newline when comparing with lineToRemove
				String trimmedLine = currentLine.trim();
				if (trimmedLine.equals(lineToRemove))
					continue;
				try {
					writer.write(currentLine + System.getProperty("line.separator"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean successful = tempFile.renameTo(inputFile);
	}

	public static void deleteFrom(String filePath) throws IOException {
		// PrintWriter object for output.txt
		PrintWriter pw = new PrintWriter("output.txt");

		// BufferedReader object for input.txt
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));

		String line1 = br1.readLine();

		// loop for each line of input.txt
		while (line1 != null) {
			boolean flag = false;

			// BufferedReader object for delete.txt
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));

			String line2 = br2.readLine();

			// loop for each line of delete.txt
			while (line2 != null) {
				if (line1.equals(line2)) {
					flag = true;
					break;
				}

				line2 = br2.readLine();
			}

			// if flag = false
			// write line of input.txt to output.txt
			if (!flag)
				pw.println(line1);

			line1 = br1.readLine();

		}

		pw.flush();

		// closing resources
		br1.close();
		pw.close();

		System.out.println("File operation performed successfully");
	}

	public static void readFileLineByLineUsingRandomAccessFile(String filePath) {
		try {
			RandomAccessFile file = new RandomAccessFile(filePath, "r");
			String str;
			while ((str = file.readLine()) != null) {
				System.out.println(str);
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static File getLastModified(String directoryFilePath) {
		File directory = new File(directoryFilePath);
		File[] files = directory.listFiles(File::isFile);
		long lastModifiedTime = Long.MIN_VALUE;
		File chosenFile = null;

		if (files != null) {
			for (File file : files) {
				if (file.lastModified() > lastModifiedTime) {
					chosenFile = file;
					lastModifiedTime = file.lastModified();
				}
			}
		}

		return chosenFile;
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

	public static void findAndRemoveLine(File inputFile, String lineToRemove) throws IOException {
		File tempFile = new File("D:\\myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String currentLine;

		while ((currentLine = reader.readLine()) != null) {
			// trim newline when comparing with lineToRemove
			String trimmedLine = currentLine.trim();
			if (trimmedLine.equals(lineToRemove))
				continue;
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
//		boolean successful = tempFile.renameTo(inputFile);
	}

	public static void findAndDeleteFromFile(File inputFile, File deleteFile) throws IOException {

//		OutputFile = inputFile - deleteFile
// 		PrintWriter object for output.txt 
		PrintWriter pw = new PrintWriter("D:\\output.txt");

// 		BufferedReader object for input.txt 
		BufferedReader br1 = new BufferedReader(new FileReader(inputFile));

		String line1 = br1.readLine();

// 		loop for each line of input.txt 
		while (line1 != null) {
			boolean flag = false;

			// BufferedReader object for delete.txt
			BufferedReader br2 = new BufferedReader(new FileReader(deleteFile));

			String line2 = br2.readLine();

			// loop for each line of delete.txt
			while (line2 != null) {
				if (line1.equals(line2)) {
					flag = true;
					break;
				}
				line2 = br2.readLine();
			}

			// if flag = false
			// write line of input.txt to output.txt
			if (!flag)
				pw.println(line1);
			line1 = br1.readLine();
		}

		pw.flush();

// 		closing resources 
		br1.close();
		pw.close();

		System.out.println("File operation performed successfully");
	}

}
