package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RuntimeTest3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		List<String> urls = Arrays.asList("https://thumb-p1.xhcdn.com/a/vSky48P99AsWWZ5FpzQDxw/000/248/782/881_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/qxYeZNtfXyvd_s7t9PdZQg/000/248/782/967_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/vcjnmxM-Qy1MUl3vdf_m0Q/000/248/782/965_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/PXTMHGofMVwMNoB7hrkqow/000/248/782/964_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/bvKwCTtV_PGCTs0TNdY5PA/000/248/782/958_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/HFWnvKaFclKrd1lrbI5cfQ/000/248/782/955_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/EEswJQk1MvcM4PWpwkwYbQ/000/248/782/950_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/tDKgJ_430aXtwKBQOWb9FQ/000/248/782/948_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/K8kBE_K_41LwkxYZDG1k2Q/000/248/782/943_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/SK635NvWmdDMivtL8WMIog/000/248/782/937_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/ELjA0oelq2jdPX-Rnj-4FQ/000/248/782/930_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/iodmQZ--cRTpWzKtBdkwng/000/248/782/927_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/ODCrYdeoVvcdz1zNPgrNgg/000/248/782/924_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/1IMf5xQhGOf4JSDyDGATzw/000/248/782/922_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/gjB6WAk9l6xq6iiGWJSemQ/000/248/782/919_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/xNlCGsQi9IpLPPLiWC1MpA/000/248/782/917_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/IVTTu47XSgtIQOKQlQfxLA/000/248/782/915_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/H5h_rlJvhrZOKi2Dcb68ag/000/248/782/912_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/xXwxR5G-PNzKhJ52hIWsKg/000/248/782/911_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/jhQRhh_C6Rs4fjJYNmbR0w/000/248/782/900_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/MtoqY4IjYZTdhRJcZ9FrGw/000/248/782/897_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/Tt11EECTSiXzktBV1cJIeg/000/248/782/894_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/iEPo5C54Yvz_CG4nDQ7_dQ/000/248/782/891_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/uZtmQgFGKRYv7nrDh2BMZg/000/248/782/887_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/8gxZ4rv_pH40WKbAbQypmA/000/248/782/885_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/i-B7DhhUORgW4KEFve0jAQ/000/248/782/884_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/WnVL7HIb6AeI1JVOfRvXOQ/000/248/782/882_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/fvkD5tDLHkxHe6WXSWjroQ/000/248/782/880_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/Q0CvTYGl5qsU5_8K-6OBvA/000/248/782/879_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/DJcmKRMTaWF1m-9680dEVw/000/248/782/878_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/bkg8PbTCVKzhzQL58An7lg/000/248/782/875_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/iyIVilHxl8q8X2D3lQlR7w/000/248/782/874_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/QdMWj4JZdUCGg080dx9tjA/000/248/782/872_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/Kt5TIcrRre7dD1ChzCeLXw/000/248/782/871_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/g71cJLJ7qao-C7_X5CKqoA/000/248/782/870_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/_fXCKYN_LTFUVBrI9Nh_yQ/000/248/782/867_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/U2syppb-8mLJaLLZPp9O3Q/000/248/782/866_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/bc4E9P2QJDqKtPCCIbOSxA/000/248/782/864_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/WKnurwRDP0cwizwwzaNHYA/000/248/782/863_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/o4WN_QbL-R9MrWcQd_evfQ/000/248/782/859_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/LB-n40pdKei_f5ISqC9_9w/000/248/782/856_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/Q-cIOFhT_kPno9CNghKBIQ/000/248/782/855_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/bcH6x-fP8cOIyPr4HkAcrQ/000/248/782/852_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/DmNetTC9dYc1vCuE3ij0bQ/000/248/782/851_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/rVuvhRU0AIYpsfDrwXOlgA/000/248/782/849_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/2zbHdMGGz9H3etHBftWYtQ/000/248/782/847_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/UEV3iimr4OfU4bjz_XsqWQ/000/248/782/844_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/kOlMfXIkbGr5CzXgp1oZUA/000/248/782/843_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/CgWjXFykDrJUaLrGPm-Qqw/000/248/782/842_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/gB5yNJES6hIG5DaQHxYeIw/000/248/782/839_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/tFbtbwzWHaNzGoz8VsH4wA/000/248/782/838_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/tfqDtAzfIBc2KrgZANOfxA/000/248/782/830_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/aMPHx5d4YiW-NEEMKsqQ0w/000/248/782/828_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/IUFgv_8ssK4ccBTA5aBWxA/000/248/782/823_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/aqGUzCXty5r3HVsadCqDog/000/248/782/820_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/BrciybBGu4a9lRqA1r5BiA/000/248/782/819_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/Wg3jPCIXBqgCSgYnWBHhug/000/248/782/817_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/rsorRwTrM4Bfpv5mQbQFXA/000/248/782/814_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/-pHAsGJKbIuGVD8TH7JRzA/000/248/782/812_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/atkJFfs51HVbGQHov8RjYA/000/248/782/811_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/VjjUgkIjaGVqWbQkbZpMRQ/000/248/782/809_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/4dMVDB2YJxZhVHsBR92oaA/000/248/782/807_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/9oPF4dLG7t-O-ya77hKHtg/000/248/782/805_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/9eC3eVkRRmLBLGMIhqFQyQ/000/248/782/803_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/Psz8ckaMuT767bx_67iBCw/000/248/782/799_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/K9MJBp1f6xTkdsj0u4l71g/000/248/782/798_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/iSo7w9FpjOk0SOy7pUuTag/000/248/782/796_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/U9xYsHL6fJKq5D3SZqIIvg/000/248/782/795_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/VuOPKcdbNwvkmhUQTSJm-w/000/248/782/792_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/iZeK1GkPLzxh9p1vtsNYiw/000/248/782/791_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/y4nt-R8tnCrnvqUjntYp7Q/000/248/782/790_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/JV7KRcc4IjfrERyKyi9gQg/000/248/782/786_1000.jpg");
		
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
