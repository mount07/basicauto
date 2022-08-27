package testPkg;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDir {

	public static void main(String[] args) throws InterruptedException {

		renameFilesInSubDir("F:\\bulkdoc");
		removeNumbersInDirName("F:\\bulkdoc");
	}

	public static void findSubDir(String path) {
		File file = new File(path);
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isDirectory();
			}
		});

		System.out.println(Arrays.toString(directories));
	}

	public static void findSubDirAndFiles(String path) {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File : " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory : " + listOfFiles[i].getName());
			}
		}
	}

	public static void renameFilesInSubDir(String path) throws InterruptedException {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		List<String> dirNames = new ArrayList<String>();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isDirectory()) {
				System.out.println("" + listOfFiles[i].getName());
				dirNames.add(listOfFiles[i].getName());
			}
		}
		
		for(String dirName : dirNames) {
			String dirPath = path + "\\" + dirName;
			System.out.println("SubDir Path : " + dirPath);
			
			String newName = dirName.split(" - ")[1].trim();
			System.out.println("NewName : " + newName);
			
			renameFiles(newName, dirPath);
			
			Thread.sleep(1000);
		}
		
	}
	
	public static void renameFiles(String newName, String path) throws InterruptedException {
		File dir = new File(path);
        File[] listOfFiles = dir.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File(path + "\\" + listOfFiles[i].getName()); 
                System.out.println("FileIn : " + path + "\\" + listOfFiles[i].getName());

                f.renameTo(new File(path + "\\" + newName + " - " + listOfFiles[i].getName()));
                System.out.println("FileOut : " + path + "\\" + newName + " - " + listOfFiles[i].getName());
                
                System.out.println("renamed...");
                Thread.sleep(100);
            }
        }
	}
	
	public static void removeNumbersInDirName(String path) throws InterruptedException {
		File folder = new File(path);
		File[] listOfItems = folder.listFiles();
		
		
		for (int i = 0; i < listOfItems.length; i++) {
			if (listOfItems[i].isDirectory()) {
				System.out.println("" + listOfItems[i].getName());
				
				File f = new File(path + "\\" + listOfItems[i].getName()); 
                System.out.println("FileIn : " + path + "\\" + listOfItems[i].getName());

                f.renameTo(new File(path + "\\" + listOfItems[i].getName().replaceAll("\\d","").replaceAll("-", "").trim()));
                System.out.println("FileOut : " + path + "\\" + listOfItems[i].getName().replaceAll("\\d","").replaceAll("-", "").trim());
                
                Thread.sleep(500);
				
			}
		}
		
	}

}
