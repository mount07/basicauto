package testPkg;

import java.io.File;
import java.io.IOException;

public class RuntimeTest2 {

	public static void main(String[] args) throws IOException {
		
		String loc = "C:\\Users\\abcd\\Downloads\\milana g";
		String baseUrl = "https://nude-gals.com/galleries/milana/0001/";
		String prefix = "casting-milana-watch4beauty-";
		String prefix0 = prefix + "0";
		String prefix1 = prefix + "1";
		String prefix2 = prefix + "2";
		String param = "";
		
		for (int i = 1; i <= 9; i++) {
			param = prefix0+i+".jpg";
			Process process = Runtime.getRuntime()
			        .exec("cmd /c " + "curl " + baseUrl + param +" --output " + param, null, new File(loc));
		}
		for (int i = 0; i <= 9; i++) {
			param = prefix1+i+".jpg";
			Process process = Runtime.getRuntime()
			        .exec("cmd /c " + "curl " + baseUrl + param +" --output " + param, null, new File(loc));
		
		}
		param = prefix2+"0"+".jpg";
		Process process = Runtime.getRuntime()
		        .exec("cmd /c " + "curl " + baseUrl + param +" --output " + param, null, new File(loc));
	
	}
	
}
