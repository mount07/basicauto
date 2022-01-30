package testPkg;

import java.io.File;
import java.io.FilenameFilter;

public class RenameFiles {

	public static void main(String[] args) throws InterruptedException {
		String dirPath = "E:\\sunny";
		renameFiles(dirPath);
//		renameFilesInSubDir(dirPath);
	}

	public static String[] getSubfolders(String dirPath) {
		File file = new File(dirPath);
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});
//		System.out.println(Arrays.toString(directories));
		return directories;
	}

	public static void renameFilesInSubDir(String dir) throws InterruptedException {
		String[] subDirs = getSubfolders(dir);

		for (String subDir : subDirs) {
			renameFiles(dir + "\\" + subDir);
		}
	}

	public static void renameFiles(String dir) throws InterruptedException {
		File folder = new File(dir);
		File[] fileList = folder.listFiles();

		for (File file : fileList) {
			renameFile(dir, file.getName());
			Thread.sleep(300);
		}

	}

	public static void renameFile(String filePath, String fileName) {
		String ext = ".jpg";

		File sourceFile = new File(filePath + "//" + fileName);
		File destFile = new File(filePath + "//" + System.currentTimeMillis() + ext);

		if (!sourceFile.isDirectory())
			if (sourceFile.renameTo(destFile)) {
				System.out.println("File renamed successfully");
			} else {
				System.out.println("Failed to rename file");
			}
	}

}
