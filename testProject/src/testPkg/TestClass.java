package testPkg;

import java.io.File;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(".........");
//		WebDriver driver = new ChromeDriver();

		FileClass.rename("E:\\Chrome Passwords.csv", "E:\\ChromePass.csv");

		File directoryPath = new File("G:\\Nudist\\EventsOccasions");
		// List of all files and directories
		String contents[] = directoryPath.list();
		System.out.println("List of files and directories in the specified directory:");
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}

	}

}