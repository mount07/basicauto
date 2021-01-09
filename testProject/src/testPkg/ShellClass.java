package testPkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellClass {
	
	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder();

	    // -- Linux --

	    // Run a shell command
	    // processBuilder.command("bash", "-c", "ls /home/abcd/");

	    // Run a shell script
	    //processBuilder.command("path/to/hello.sh");

	    // -- Windows --

	    // Run a command
//	    processBuilder.command("cmd.exe", "/c", "dir C:\\Users\\abcd");
	    processBuilder.command("cmd.exe", "/c", "cd C:\\Users\\abcd");
//	    processBuilder.command("cmd.exe", "/c", "curl https://mkyong.com/java/how-to-execute-shell-command-from-java/");
	    processBuilder.command("cmd.exe", "/c", "cd C:\\Users\\abcd \ndir");
	    
	    // Run a bat file
	    //processBuilder.command("C:\\Users\\abcd\\hello.bat");

	    try {

	        Process process = processBuilder.start();

	        StringBuilder output = new StringBuilder();

	        BufferedReader reader = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));

	        String line;
	        while ((line = reader.readLine()) != null) {
	            output.append(line + "\n");
	        }

	        int exitVal = process.waitFor();
	        if (exitVal == 0) {
	            System.out.println("Success!");
	            System.out.println(output);
	            System.exit(0);
	        } else {
	            //abnormal...
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e1) {
	        e1.printStackTrace();
	    }
	}

	
}
