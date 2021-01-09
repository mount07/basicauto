package testPkg;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RuntimeTest3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		List<String> urls = Arrays.asList("https://thumb-p5.xhcdn.com/a/f1TQa4PC_lQ-rC4977ARGw/000/475/876/665_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/qGtxvQ_vUzq3Nl3dE-vDjw/000/476/402/658_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/oHudV6pHq3833_Z3k6Ovsw/000/476/402/653_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/sCdoSWc628IoyiPw3BDmAA/000/476/402/614_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/2cuSJ6Ktt8SypiRB3KJj8Q/000/476/402/582_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/uumGhxTOu6oTt5JcobfPLw/000/476/402/571_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/l8qkNHi4HZCByT8T7I1sfA/000/476/402/558_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/N55h08TMYSDfbnvtuwBvAQ/000/476/402/548_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/pz-PUcSmrwvdPqVbPfCHNA/000/476/402/533_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/KLblB01D0PsNMkWfeL7iQw/000/476/402/522_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/Q9Uwq_10E5VKn89bV7VDtA/000/476/402/502_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/pt5xOQ4We7HdMwC7v6TSgg/000/476/402/483_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/XNM1j5aGn0H7FGlctNeIsw/000/476/402/471_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/-1e8Vp-4opiW9g8qvBjTHg/000/476/402/443_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/9NkMLCrgTLW5hIf01ZJ5ow/000/476/402/417_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/mmD80HYFavmIdCaDpzzQUw/000/476/402/390_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/YORlHLfC_vSHuGaAAehz2g/000/476/402/371_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/ah3kQ3G86dVvH39jPEZLsA/000/476/402/355_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/-1E84gdPCmtzT5KeTxA2SQ/000/476/402/329_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/zCN7XdlkoZHhmiE7HaIpMw/000/476/402/321_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/up9pP82FpLTEhp8fX6Dp5A/000/476/402/304_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/dCGpUAi3lzLaKoiQa_SaeQ/000/476/402/270_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/p3vr1C6y9d_7a035J4Rlyg/000/476/402/234_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/IgjtFI8e0yahRGQUBfvAkg/000/476/402/201_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/MdNFtVJ2Y3SuqXVGHNQN3A/000/476/402/179_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/AjxWfnQoLB6_OgYwddsZuQ/000/476/402/164_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/s1RFEhYEuyFv31F0SI27uA/000/476/402/126_1000.jpg"
				, "https://thumb-p7.xhcdn.com/a/G1sJfjV15BwA2c2qfzaxww/000/476/402/107_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/UBY61gwQRa4ubqv0vjQurw/000/476/402/098_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/dJBwrUF44ZjV0ce8KcUBCA/000/476/402/089_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/mVVouaLpXxg2ILdnSwHEtw/000/476/402/078_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/vzo952-nRlgVHIm-5nha6g/000/476/402/069_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/vzo952-nRlgVHIm-5nha6g/000/476/402/069_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/gAFPJuu5L-VSyEU_HYZ2jA/000/476/401/824_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/NRQEkr4SMlYuIaaJt47vlA/000/476/401/812_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/XNcOm8kqLky_hvzXG0-pNw/000/476/401/803_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/189iBYc-_B8_WdBpUMu58A/000/476/401/788_1000.jpg"
				, "https://thumb-p5.xhcdn.com/a/rEv6De5UgRfbOHMYurJ91A/000/476/401/775_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/MJ4s6gXWGrCcZi-kCVv3uA/000/476/401/760_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/5BA1T3wvVfN6z9sTcgcFhg/000/476/401/751_1000.jpg"
				, "https://thumb-p8.xhcdn.com/a/vWZ1fzdxs3ISkgJL1BtdSg/000/476/401/738_1000.jpg"
				, "https://thumb-p6.xhcdn.com/a/VUXiwIOXC2SP9iQcj6KXsw/000/476/401/726_1000.jpg"
				, "https://thumb-p3.xhcdn.com/a/efLrE3SHnsbTWz-AsOnYtw/000/476/401/723_1000.jpg"
				, "https://thumb-p4.xhcdn.com/a/w1vvY1ZBH9B14HU54q2dgw/000/476/401/694_1000.jpg"
				, "https://thumb-p9.xhcdn.com/a/oCBGOSLcMRs9pN90Wb9mzw/000/476/401/689_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/Ode5BuJzqqtblvaidlVqcw/000/476/401/682_1000.jpg"
				, "https://thumb-p1.xhcdn.com/a/F2HmcaKUF2pNQXcsgIIn1g/000/476/401/671_1000.jpg"
				, "https://thumb-p2.xhcdn.com/a/gxNVs57ARgBJ22lqALU8IA/000/476/401/642_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/fibOsJMvKTeopZXDC-GRzw/000/476/401/630_1000.jpg"
				, "https://thumb-p0.xhcdn.com/a/fibOsJMvKTeopZXDC-GRzw/000/476/401/630_1000.jpg");
		
		String loc = "C:\\Users\\abcd\\Downloads\\mlf12";
		
		for(String url : urls) {
			Thread.sleep(3000);
			String filename = url.split("/")[8];
			System.out.println(url.split("/")[8]);
			
			Process process = Runtime.getRuntime()
			        .exec("cmd /c " + "curl " + url +" --output " + filename, null, new File(loc));
		}
		
	
	}
	
}
