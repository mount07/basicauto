package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RuntimeTestXossipy {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		List<String> urls = Arrays.asList("https://thumb-p0.xhcdn.com/a/YxO4NO0V-4T4VSx2zLkoHA/000/200/293/060_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/VG2x5luOYJgfAOkka3135Q/000/200/293/061_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/H_Pg8ibafPs4C0MssMZMlQ/000/200/293/059_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/bRbTzQsXnAxo6-5XFaVsDg/000/200/293/058_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/TRby3D8_t_y3cxn8-YfgTg/000/200/293/057_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/fuDWfdwfxHJvdkMW0B2Cgw/000/200/293/056_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/An_-a_9ZbDxZ37a_Le1jRg/000/200/293/055_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/uaz22tz54nw-5oqkO-gFXw/000/200/293/054_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/kJwx3I7LdzEDc5GvLNRhew/000/200/293/053_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/Xm26oZICryr_BVUGcWdZuw/000/200/293/052_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/3K1ST-SroBHyhv1Mk9PN5Q/000/200/293/051_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/RS1iBusHg-joCQAaIE543w/000/200/293/050_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/t7qd7Smf93YRTY48cnAOxw/000/200/293/049_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/zJQ5q606Q10jJuKpOo2GOw/000/200/293/048_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/Dt0fXFKb7RN9m6wSQYS3Cg/000/200/293/047_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/mK13EZ0LyBQpQiSS5hTXEQ/000/200/293/046_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/XK1VtUAfrqY02oQwC5aEKw/000/200/293/045_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/gCVy10HrYl7gzAAXRV9hTQ/000/200/293/044_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/ap7Kk0waJqNztYv16PRyZg/000/200/293/043_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/bmGrffpJyxSV3RHB1M_6Ew/000/200/293/042_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/na49V0vsMYOP-XOMc6XOBQ/000/200/293/041_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/U9FlAVT5x1juY8emzIvZnQ/000/200/293/040_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/Vr8aNbkv3itP_LT7xpYOcg/000/200/293/039_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/n9b6JE862TD43GG-wyu29g/000/200/293/038_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/x0ITzwB-n0ALya4SO4ZgnA/000/200/293/037_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/Z5S3CpUIem8IPGH49gEfqw/000/200/293/036_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/s8fcdkXXNCCRfccUFOJpsg/000/200/293/035_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/JfLMHjFtAx3SBNGcOgYvYg/000/200/293/034_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/7-SAtOjriNrmk30ADu00Qg/000/200/293/033_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/PM307tTGj3Z2oZYjn0oLOA/000/200/293/032_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/AVrvVWzePeWTs9jQpmMYOw/000/200/293/031_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/xGe1tIvxk1fnAOsxW6_w4Q/000/200/293/030_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/eidFbkzTzWth7L6WSw9L3g/000/200/293/029_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/bz9Hwyhi15EwivWsNlmkIg/000/200/293/027_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/Nx0SR0iRlU2OWgnNYCcuNQ/000/200/293/026_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/L7NcO3gLWMLZsCzZGM7sxw/000/200/293/025_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/ANonpUTLCqtKDPbY4pRLqQ/000/200/293/024_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/_9_8484KordEV9bqnugmbA/000/200/293/023_1000.jpg");
		
		File theDir = new File("C:\\Users\\abcd\\Downloads\\" + System.currentTimeMillis());
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
		
//		String loc = "C:\\Users\\abcd\\Downloads\\mlf12";
		int i = 1;
		
		for(String url : urls) {
			Thread.sleep(1000);
			
			String filename = url.split("/")[8];
			System.out.println(url.split("/")[8]);
			
			Process process = Runtime.getRuntime()
			        .exec("cmd /c " + "curl " + url +" --output " + i + filename, null, new File(theDir.getPath()));
			i++;
		}
		
	
	}
	
}
