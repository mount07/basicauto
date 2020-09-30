package testPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwImg {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://cyberdrop.me/a/UD9vHGdg");
//		
//		Thread.sleep(20000);
		
		List<String> urls = Arrays.asList("https://f.cyberdrop.pw/%D0%AD%D1%80%D0%BE%D1%82%D0%B8%D0%BA%D0%B0-%D1%81%D0%B8%D1%81%D1%8C%D0%BA%D0%B8-%D0%90%D0%BD%D0%BD%D0%B0-%D0%A6%D0%B0%D1%80%D1%91%D0%B2%D0%B0-Any-Tsareva-5406914-qxSXFzEO.jpg",  
				"https://f.cyberdrop.pw/%D0%AD%D1%80%D0%BE%D1%82%D0%B8%D0%BA%D0%B0-%D1%81%D0%B8%D1%81%D1%8C%D0%BA%D0%B8-%D0%90%D0%BD%D0%BD%D0%B0-%D0%A6%D0%B0%D1%80%D1%91%D0%B2%D0%B0-Any-Tsareva-5406913-EviBf9ML.jpg",  
				"https://f.cyberdrop.pw/%D0%B2%D0%B8%D0%B4%D0%BE%D1%81-94clnVnV.mp4",  
				"https://f.cyberdrop.pw/%D0%AD%D1%80%D0%BE%D1%82%D0%B8%D0%BA%D0%B0-%D1%81%D0%B8%D1%81%D1%8C%D0%BA%D0%B8-%D0%90%D0%BD%D0%BD%D0%B0-%D0%A6%D0%B0%D1%80%D1%91%D0%B2%D0%B0-Any-Tsareva-5406912-N6wijzsb.jpg",  
				"https://f.cyberdrop.pw/%D0%AD%D1%80%D0%BE%D1%82%D0%B8%D0%BA%D0%B0-%D0%90%D0%BD%D0%B4%D1%80%D0%B5%D0%B9-%D0%9F%D0%BE%D0%BF%D0%BE%D0%B2-(%D0%A4%D0%BE%D1%82%D0%BE%D0%B3%D1%80%D0%B0%D1%84)-%D0%90%D0%BD%D1%8F-%D0%A6%D0%B0%D1%80%D1%91%D0%B2%D0%B0-Any-Tsareva-5032375-4DjM3gIN.jpeg",  
				"https://f.cyberdrop.pw/Zpol0Xb_d-xthmrnmU.jpg",  
				"https://f.cyberdrop.pw/zhopa-2tTjANC1.jpg",  
				"https://f.cyberdrop.pw/YsmUybgscr0-zxj3hosW.jpg",  
				"https://f.cyberdrop.pw/z6yt1lymxhq41-tQh39xLB.jpg",  
				"https://f.cyberdrop.pw/yCpEQew_d-RFNzWoR8.jpg",  
				"https://f.cyberdrop.pw/XpsIZ2O9Fc8-QSDPM3Ix.jpg",  
				"https://f.cyberdrop.pw/y9u4liu5jhr41-Q25ycMBk.jpg",  
				"https://f.cyberdrop.pw/xthxUTB_d-0LOzlG98.jpg",  
				"https://f.cyberdrop.pw/xsdjgokzmhv31-BtjviRMF.jpg",  
				"https://f.cyberdrop.pw/WxUc42X-3KdxovCz.jpg",  
				"https://f.cyberdrop.pw/xMU86X5vUz0_l-KtFvpWw6.jpg",  
				"https://f.cyberdrop.pw/wXkygnx_d-yU4gW7H5.jpg",  
				"https://f.cyberdrop.pw/wwFvMF0XQieCl5l9_Uo7Q3luBzHTPewF6TIVggZW0OE-MXb7tIhs.jpg",  
				"https://f.cyberdrop.pw/ww1soxpx9km41-2ktPr6sY.jpg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.46-xK39of7t.jpeg",  
				"https://f.cyberdrop.pw/WnzP68nyr6z1b8Bx8aGHf0I83XCSUiWQvslC85OMfo4-FPDv8dqp.jpg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.45-VdLhRtvx.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.45(1)-cjBFUGDP.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.43-o7A7FNFI.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.39-Ccy9BiGu.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.38-75QXgUPA.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.38(1)-p7bBG4qR.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.37-5lxdaUmC.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.37(1)-SPF9NMX3.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.36-8ttRzsjJ.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.34-T2IfRKvs.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.34(1)-2FWY5QIH.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.33-kIsMWQAh.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.32-7MnpKpl7.jpeg",  
				"https://f.cyberdrop.pw/w-cwobSsc_Y-yXZlB82g.jpg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.31-dyZGK6x9.jpeg",  
				"https://f.cyberdrop.pw/WhatsApp%20Image%202019-11-23%20at%2014.07.31(1)-6MoTUfzS.jpeg",  
				"https://f.cyberdrop.pw/w55Og5iJ_Ec-wgYA1lgq.jpg",  
				"https://f.cyberdrop.pw/vid-qkf7OTRY.mp4",  
				"https://f.cyberdrop.pw/vewxn1ckp7r41-pbZ6Z4xp.jpg",  
				"https://f.cyberdrop.pw/VApB5Rj_d-xxoHzoPb.jpg",  
				"https://f.cyberdrop.pw/v4up91pc6lo31-8JiSiiED.jpg",  
				"https://f.cyberdrop.pw/uj8fNexXBQQ-rUwpIGj7.jpg",  
				"https://f.cyberdrop.pw/uy4yj5d5h3p41-JGIoSosn.jpg",  
				"https://f.cyberdrop.pw/UIw_UgyHrto-MfdCyIb9.jpg",  
				"https://f.cyberdrop.pw/uCEYxpS-RCk2d22x.jpg",  
				"https://f.cyberdrop.pw/TnUPFPb3OVVe5pG5Ybo2sOu5hxjYM37wKZFEcljH8MI-zgnBeNvf.jpg",  
				"https://f.cyberdrop.pw/thumb-IJ6hG2rD.jpg",  
				"https://f.cyberdrop.pw/tfm60dCda8Y-xli9Tget.jpg",  
				"https://f.cyberdrop.pw/tdTKuWUFYig-5mblJU0L.jpg",  
				"https://f.cyberdrop.pw/Sp4YxG1YlUo-DGfoXlL8.jpg",  
				"https://f.cyberdrop.pw/tdnks2k_P3fUkxdFbvtJNvtP5uOvTTZdWt38QmJoZLE-vG1QLa9s.jpg",  
				"https://f.cyberdrop.pw/syrj-eXq9tFyf.jpg",  
				"https://f.cyberdrop.pw/seethru-tE0KNUbg.jpg",  
				"https://f.cyberdrop.pw/Screenshot_20191008_142142-zBRiYbco.jpg",  
				"https://f.cyberdrop.pw/RpffhwzYaAA-8eBEgjjP.jpg",  
				"https://f.cyberdrop.pw/RpffhwzYaAA%20(1)-OxhPOpai.jpg",  
				"https://f.cyberdrop.pw/rb99rz2yoft41-S9AJlHcx.jpg",  
				"https://f.cyberdrop.pw/R0sB4oKgSwU-AuJNajOB.jpg",  
				"https://f.cyberdrop.pw/R2znXRa_d-qqTolYP3.jpg",  
				"https://f.cyberdrop.pw/qjzxip0rkir41-7Zn5AoYN.jpg",  
				"https://f.cyberdrop.pw/Q1K3B_E6_yI-lJgdrr1q.jpg",  
				"https://f.cyberdrop.pw/pub_anya_-_085_v4-AWNHaLKm.jpg",  
				"https://f.cyberdrop.pw/PresentZanyBlackpanther-mobile-xdkbZ0rr.mp4",  
				"https://f.cyberdrop.pw/post_file%20(8)-YynthCm4.png",  
				"https://f.cyberdrop.pw/post_file%20(6)-wHgWSLXX.png",  
				"https://f.cyberdrop.pw/post_file%20(5)-Q5XeTpEi.png",  
				"https://f.cyberdrop.pw/post_file%20(4)-7xtjXnpy.png",  
				"https://f.cyberdrop.pw/post_file%20(3)-soXC94P1.png",  
				"https://f.cyberdrop.pw/post_file%20(2)-fdIhx64q.png",  
				"https://f.cyberdrop.pw/post_file%20(1)-VdqvQnKn.png",  
				"https://f.cyberdrop.pw/OpulentUnnaturalIndianringneckparakeet-mobile-gdX1CkpK.mp4",  
				"https://f.cyberdrop.pw/of-DpHLrCjQ-PGizqiz8.jpg",  
				"https://f.cyberdrop.pw/nz5a-ORIYpWCfKeqyLtSbgGqiEiD5nEDWYDmQKjZG5w-Y3PhEF9H.jpg",  
				"https://f.cyberdrop.pw/mY5jwtHzk4E-08iV6yx7.jpg",  
				"https://f.cyberdrop.pw/nf3chitflvk41-8AEtibZp.jpg",  
				"https://f.cyberdrop.pw/nas72t2okir41-BKFVE0jX.jpg",  
				"https://f.cyberdrop.pw/md62SmMdshA-AZrWWgWE.jpg",  
				"https://f.cyberdrop.pw/mrwee0uk81131-0yLvYbnM.jpg",  
				"https://f.cyberdrop.pw/mQIyduiBKtGgtj0FG-RTqzyDIlZd54ko1hGbOzNEVAo-SwDcs4Uq.jpg",  
				"https://f.cyberdrop.pw/md62SmMdshA%20(1)-pmuRHv1j.jpg",  
				"https://f.cyberdrop.pw/lee07YUJxuI-1oC1RBO6.jpg",  
				"https://f.cyberdrop.pw/L7KXC6ySkcPlIszwrGfTvIWwRx_WACDmkO87Dq8Y8u4-cZ3lHkbh.jpg",  
				"https://f.cyberdrop.pw/KZkcSYGNpmeRJ45TfNsXkDZmXR-1RIMt1ylihVOlUZo-OYzzuxxG.jpg",  
				"https://f.cyberdrop.pw/KRpbzvz7OnIIFSd4tVArSn7IniU_T_1XthtYX-Q7TEE_292939-rgrudZdx.jpg",  
				"https://f.cyberdrop.pw/-jzltIumfG8-K3pnKRem.jpg",  
				"https://f.cyberdrop.pw/KRpbzvz7OnIIFSd4tVArSn7IniU_T_1XthtYX-Q7TEE-4lmJuJSL.jpg",  
				"https://f.cyberdrop.pw/klmrSih_d-wyLehe5F.jpg",  
				"https://f.cyberdrop.pw/JedTPLSB7gXlAxMsf-uFA-C9N4CNn9PY5d1Q7J58ZvA-bL7oBq8b.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150958_458-gLdGDxDX.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150957_147-7radA9jM.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150955_030-289I922P.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150953_197-7BFJWO6v.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150952_013-HhnsXe5q.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150949_665-5B3XNi4c.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150947_713-m8EMMrRu.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150946_709-8dp5wnmc.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150944_422-dxqcoowg.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150942_761-rr4gYaPN.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150941_503-hjzaUbLu.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150939_141-jD4QOM0G.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150937_862-6yaKeGq3.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150935_106-fkcUYpmK.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150933_681-vYs1Atlu.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150931_925-dz6ljzkp.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150929_543-xgjqmes9.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150928_022-LdYquA7T.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150925_855-60xSgLEx.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150922_342-SbmGFnLl.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150920_553-MoKUS6cn.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150918_439-RQ9I1yeS.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150916_411-JeAi6Acm.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150914_188-ZGJWhd1y.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150912_175-bHXoPf20.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150911_088-8OXx4fnt.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150908_430-oOu5KdB4.jpg",  
				"https://f.cyberdrop.pw/IMG_20200417_150907_163-ishlID7a.jpg",  
				"https://f.cyberdrop.pw/IMG_20191228_085335_404-Ehbd1SlP.jpg",  
				"https://f.cyberdrop.pw/IMG_20191228_085333_249-16zl4UqL.jpg",  
				"https://f.cyberdrop.pw/IMG_20191228_085331_238-s6FNxwP5.jpg",  
				"https://f.cyberdrop.pw/IMG_20191228_085328_441-EeryZClS.jpg",  
				"https://f.cyberdrop.pw/IMG_20191203_085745_835-AXdbxerd.jpg",  
				"https://f.cyberdrop.pw/IMG_20191203_085742_081-Z3nLTnoJ.jpg",  
				"https://f.cyberdrop.pw/IMG_20191130_085506_720-f14rOkBI.jpg",  
				"https://f.cyberdrop.pw/IMG_20191130_085503_330-NAecGjnl.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_181010_714-M9foJYG8.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092427_278-6FgLaLUZ.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092424_075-iHx00FW1.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092421_437-wF140dGo.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092418_195-sn0EyVum.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092414_910-gQBoGTuT.jpg",  
				"https://f.cyberdrop.pw/IMG_20191124_092410_505-hzOh01kY.jpg",  
				"https://f.cyberdrop.pw/IMG_20191123_135518_053-X46A9pnE.jpg",  
				"https://f.cyberdrop.pw/IMG_20191119_102749_233-7UqMP2Lc.jpg",  
				"https://f.cyberdrop.pw/IMG_20191119_102747_037-gkebYM7t.jpg",  
				"https://f.cyberdrop.pw/IMG_20191119_102740_319-02vnlpBB.jpg",  
				"https://f.cyberdrop.pw/IMG_20191119_102744_223-tlhBsKJy.jpg",  
				"https://f.cyberdrop.pw/IMG_20190929_121818_413-C082SBWT.jpg",  
				"https://f.cyberdrop.pw/IMG_9589.JPG-4g3RntjO.jpg",  
				"https://f.cyberdrop.pw/IMG_9429.JPG-xN4GorND.jpg",  
				"https://f.cyberdrop.pw/IMG_8763.JPG-qDNQZYCM.jpg",  
				"https://f.cyberdrop.pw/IMG_8748.JPG-mz9AgYCl.jpg",  
				"https://f.cyberdrop.pw/IMG_8454.JPG-n555aOMK.jpg",  
				"https://f.cyberdrop.pw/IMG_8445.JPG-obIoMlez.jpg",  
				"https://f.cyberdrop.pw/IMG_7960.JPG-32PgWbmh.jpg",  
				"https://f.cyberdrop.pw/IMG_7955.JPG-JiY0RPU3.jpg",  
				"https://f.cyberdrop.pw/IMG_6311.medium.MP4-IkBRVGWx.mp4",  
				"https://f.cyberdrop.pw/IMG_7804.JPG-o3NmBbaX.jpg",  
				"https://f.cyberdrop.pw/IMG_3530.medium.MP4-iuqDDiZ0.mp4",  
				"https://f.cyberdrop.pw/IMG_3529.medium.MP4-kMqGcFGG.mp4",  
				"https://f.cyberdrop.pw/IMG_0618.MOV-A5lYjRxm.mov",  
				"https://f.cyberdrop.pw/IMG_2066_DPP-i4YTB5lz.jpg",  
				"https://f.cyberdrop.pw/IMG_0723.medium.MP4-mal7jKXM.mp4",  
				"https://f.cyberdrop.pw/ilr21ofapmf31-dgSwQBlE.jpg",  
				"https://f.cyberdrop.pw/IBWURoW_d-rsTqLek6.jpg",  
				"https://f.cyberdrop.pw/igpu9sq98ek41-EPWW0MBt.jpg",  
				"https://f.cyberdrop.pw/I6yOWylvj3tqZNBKN8R3O3CMwtIPFu7mJIJ0cyFziR4-mfs5AZs9.jpg",  
				"https://f.cyberdrop.pw/I2gq1sF-RXx29ECl.jpg",  
				"https://f.cyberdrop.pw/GUOtzx3z8Eo-fr3YKnqM.jpg",  
				"https://f.cyberdrop.pw/h6qikc6ek6j41-70Y4RncI.jpg",  
				"https://f.cyberdrop.pw/gdasf-6BJVKRtr.jpg",  
				"https://f.cyberdrop.pw/FsIs5BUHlP0-5dnUwirq.jpg",  
				"https://f.cyberdrop.pw/fy01axvvadk41-LndMahKg.jpg",  
				"https://f.cyberdrop.pw/fllnkd-358SzIBD.jpg",  
				"https://f.cyberdrop.pw/FgpR6FFuVus%20(1)-FkbELa7G.jpg",  
				"https://f.cyberdrop.pw/FgpR6FFuVus-RvdwUsGb.jpg",  
				"https://f.cyberdrop.pw/fgegf-TAXDY85z.jpg",  
				"https://f.cyberdrop.pw/EDlQXzGfUzk-6QAfM57C.jpg",  
				"https://f.cyberdrop.pw/EMIzbbx_d-HJXvruYo.jpg",  
				"https://f.cyberdrop.pw/elogzknhfib41-lSfwYUFL.jpg",  
				"https://f.cyberdrop.pw/ebo3noihw0j41-ORz08L1c.jpg",  
				"https://f.cyberdrop.pw/E5RfHzgbYBQ%20(1)-m83HpM10.jpg",  
				"https://f.cyberdrop.pw/E5RfHzgbYBQ-HZlR1IAK.jpg",  
				"https://f.cyberdrop.pw/DistantNarrowBasil-mobile-pJOk4d42.mp4",  
				"https://f.cyberdrop.pw/DsQAyVA4Q80WImsSRuKr77bNCFZ-HNVJ92htfirl0_I-xGT1fYDG.jpg",  
				"https://f.cyberdrop.pw/DdkAElxb2GQ%20(1)-wTM07Oxq.jpg",  
				"https://f.cyberdrop.pw/de6307d-3tW4cHTQ.jpg",  
				"https://f.cyberdrop.pw/DdkAElxb2GQ-yPwqj2gA.jpg",  
				"https://f.cyberdrop.pw/anya_-_365_v6-y0KJJvUi.jpg",  
				"https://f.cyberdrop.pw/D02D220C-8F94-4BB0-BB0C-257A5CD35851-4599-0000010950F76DBE.JPG-B7XaKtBY.jpg",  
				"https://f.cyberdrop.pw/cldu4o812sr41_292318-lHRiTPS1.jpg",  
				"https://f.cyberdrop.pw/ckkam85ffib41-03ZIANPK.jpg",  
				"https://f.cyberdrop.pw/BWL8vWtc_4lIfHojKyBfUa7_SBqbEZfnfa3I_z6zrow-3uNUAMXU.jpg",  
				"https://f.cyberdrop.pw/bb53rugmm2k41-MX7uPnoY.jpg",  
				"https://f.cyberdrop.pw/Amy-Tsareva-7-yMxwZnz9.jpg",  
				"https://f.cyberdrop.pw/Amy_3-yVqnvBSD.jpg",  
				"https://f.cyberdrop.pw/Amy_2-qBr8faLV.jpg",  
				"https://f.cyberdrop.pw/Amy_1-GBRXO8Tc.jpg",  
				"https://f.cyberdrop.pw/Amy%20Tsareva%20(10)-1x3AHWUF.jpg",  
				"https://f.cyberdrop.pw/Amy%20Tsareva%20(6)-QVjssk36.jpg",  
				"https://f.cyberdrop.pw/Amy%20Tsareva%20(5)-pF3RtO1D.jpg",  
				"https://f.cyberdrop.pw/1554408200159124137-Iednoqc6.jpg",  
				"https://f.cyberdrop.pw/aiaxgns4l8r41-dNfXpU6g.jpg",  
				"https://f.cyberdrop.pw/a3wUxziRqNU-XovSPRB5.jpg",  
				"https://f.cyberdrop.pw/185862556_456240526-6K0ng2jV.jpg",  
				"https://f.cyberdrop.pw/66658654_131458234767466_8780034474627782453_n-BoHDIv2S.jpg",  
				"https://f.cyberdrop.pw/64166916_456273585-XMfptt29.jpg",  
				"https://f.cyberdrop.pw/20191124_093228-MKGIls9B.jpg",  
				"https://f.cyberdrop.pw/64166916_456272625-hCyrSKRP.jpg",  
				"https://f.cyberdrop.pw/20190618_210744-RERm6lNu.jpg",  
				"https://f.cyberdrop.pw/20191023_081302-lRRRyaSM.jpg",  
				"https://f.cyberdrop.pw/981856-a122ff05aa374ed2b5372ed274e74020-mv2-1rPSKkEQ.png",  
				"https://f.cyberdrop.pw/981856-dd0d3beba62341019fa61b3b3a608421-mv2-x8R7wseG.png",  
				"https://f.cyberdrop.pw/981856-9cb5396c588f473882f3803eeab3cc6e-mv2-MDxU8HS5.png",  
				"https://f.cyberdrop.pw/130319_c31523de660fdef84a51811b8bc8be19-AqpN9xak.jpg",  
				"https://f.cyberdrop.pw/125273_13790e4f68ab04c012fcc91579df5dea-S94fDpLE.png",  
				"https://f.cyberdrop.pw/125271_30d59406cf56d5a09b7215d568a92dfb-Vk60T3l0.png",  
				"https://f.cyberdrop.pw/125259_c814dac06165f5633d7f07a1d57dc729-Tc2CN0hZ.jpg",  
				"https://f.cyberdrop.pw/125267_54a56f55a4954c4b74a4badb54adb3ad-erKujrTa.png",  
				"https://f.cyberdrop.pw/125255_a8d1e20aae3eb716055e4aeb3bb5f81c-mSmam9Kx.jpg",  
				"https://f.cyberdrop.pw/125252_cfcddeff77d8cdc1b60e96daeb823433-9clyb9mg.jpg",  
				"https://f.cyberdrop.pw/125249_dc873eb4186fdc1f5ab2ca27383b80de-ifQ6WMnR.jpg",  
				"https://f.cyberdrop.pw/125245_fc5a29516ab21356c5470228f8b63127-D4Rw1Dqg.jpg",  
				"https://f.cyberdrop.pw/125248_385fa9dd0e749b666ca4161bd340f7cb-IM4Nk4ou.jpg",  
				"https://f.cyberdrop.pw/246sinst-wtrJbUCg.jpg",  
				"https://f.cyberdrop.pw/919cr1kcfib41-ASWoMVUO.jpg",  
				"https://f.cyberdrop.pw/588GzNB_d-bzKIbrxk.jpg",  
				"https://f.cyberdrop.pw/85a21bc-F37hV4Db.jpg",  
				"https://f.cyberdrop.pw/37l55z0p88141_-_copia_2_292309-MaiI0lkp.jpg",  
				"https://f.cyberdrop.pw/31v1cXlzv6c-vvlQ2AVS.jpg",  
				"https://f.cyberdrop.pw/9l9ez3zs2sr41_-_copia_2_292311-HoTKfjPE.jpg",  
				"https://f.cyberdrop.pw/9jsoarJs17k-gfWfncc1.jpg",  
				"https://f.cyberdrop.pw/8WlSlqHhkQ4-qzDznQfq.jpg",  
				"https://f.cyberdrop.pw/9fbgl4EPBEM-O14y9NVa.jpg",  
				"https://f.cyberdrop.pw/8xhqb6mikir41-yNkyuc2Y.jpg",  
				"https://f.cyberdrop.pw/6N1HFiNLoAQ-JRD6fF57.jpg",  
				"https://f.cyberdrop.pw/8-I1_MxUKPRQoiNfnMkjDcSQ6YP9RVKFTKKh54hmUt4-MZUKBJy7.jpg",  
				"https://f.cyberdrop.pw/8dlid2912sr41_-_copia_2_292310-MSS2z738.jpg",  
				"https://f.cyberdrop.pw/7B67C6AA-D3F2-4501-BBBF-2F8FB4DAA0CF-O5qBbVuZ.jpeg",  
				"https://f.cyberdrop.pw/2ai_DgqFlpc-NPO7DlOg.jpg",  
				"https://f.cyberdrop.pw/4gempchdeb831-4oGVl8WI.jpg",  
				"https://f.cyberdrop.pw/3j639ad5zxn41-NV8spG1l.jpg",  
				"https://f.cyberdrop.pw/1Ig16vENxopJIzxaGZx8t0Zjpm5nj6D0-9vxKm8wfy8-7jOU33aq.jpg",  
				"https://f.cyberdrop.pw/1eGp9270Hko-KvB87zQ3.jpg",  
				"https://f.cyberdrop.pw/0UC59o78Vx8-oj6veLee.jpg",  
				"https://f.cyberdrop.pw/_qiIRSyBBVM-FVZyHJ11.jpg");
		
		for(String url : urls) {
			driver.get(url);
			Thread.sleep(2000);
			
			Robot robot = new Robot();
			  
	        robot.delay(300);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_S);
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_S);
	        robot.keyRelease(KeyEvent.VK_ENTER);
		}
			
			

//		List<WebElement> links = driver.findElements(By.cssSelector(".image[href*='https://f']"));
//
//		for (WebElement link : links) {
//			String href = link.getAttribute("href");
//			System.out.println(href);
//			driver.get(href);
//			Thread.sleep(2000);
//			
//			Robot robot = new Robot();
//			  
//	        robot.delay(300);
//	        robot.keyPress(KeyEvent.VK_CONTROL);
//	        robot.keyPress(KeyEvent.VK_S);
//	        Thread.sleep(2000);
//	        robot.keyPress(KeyEvent.VK_ENTER);
//	        
//	        robot.keyRelease(KeyEvent.VK_CONTROL);
//	        robot.keyRelease(KeyEvent.VK_S);
//	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	       
//		}
	}
}
